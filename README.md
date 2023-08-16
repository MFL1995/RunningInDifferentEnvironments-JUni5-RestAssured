**Running in different environments' setup!**

By using this line in ShareData constructor:

        String environment = System.getProperty("environment", "mock"); // Default to "mock"

**Explication for:**  System.getProperty("environment"): 
 - This part of the code retrieves the value of the system property named "environment". If you run your Java application or tests with a command-line option like -Denvironment=qa, this code will retrieve the value "qa".

 - "mock": This is the default value that will be used if the system property "environment" is not explicitly set. If you run your application without passing the -Denvironment option, the code will use "mock" as the default environment.

We can override this environment tests running by using this command

    mvn test -P qa -Denvironment=qa  or mvn test -P mock -Denvironment=mock
The -D flag followed by a property name is used to define a system property when you're executing a Java program, such as when running Maven tests. In the context of my example we can use -Denvironment=qa to set the environment system property to the value "qa" when running Maven tests.

    <profiles>
        <profile>
            <id>mock</id>
            <properties>
                <environment>mock</environment>
            </properties>
        </profile>
        <profile>
            <id>qa</id>
            <properties>
                <environment>qa</environment>
            </properties>
        </profile>
    </profiles>


**Parallel execution: setup!**

The Runner must have:

    public class Test {
    @BeforeAll
    public static void setup() {
    // Set the default parser to JSON
    RestAssured.defaultParser = Parser.JSON;
    }}

The Plugin from pom.xml:

                <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.1.2</version>
                <executions>
                    <execution>
                        <phase>test</phase>
                        <configuration>
                            <includes>
                                <include>**/runner.Test.java</include>
                                <include>**/*runner.Test.java</include>
                            </includes>
                            <parallel>classes</parallel>
                            <threadCountClasses>2</threadCountClasses>
                            <skip>true</skip>
                        </configuration>
                    </execution>
                </executions>
            </plugin>

Create in resources the cucumber.properties:

    cucumber.publish.enabled = true

Create in resources the junit.platform.properties:

    cucumber.execution.parallel.enabled=false
    cucumber.execution.parallel.config.strategy=fixed
    cucumber.execution.parallel.config.fixed.parallelism=1

The dependencies for Junit5 of course.

            <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>${junit-5.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.vintage</groupId>
            <artifactId>junit-vintage-engine</artifactId>
            <version>${junit-5.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit-platform-engine</artifactId>
            <version>${cucumber.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-picocontainer</artifactId>
            <version>${cucumber.version}</version>
        </dependency>
        <dependency>
            <groupId>org.junit.platform</groupId>
            <artifactId>junit-platform-suite</artifactId>
            <version>${junit-platform.version}</version>
            <scope>test</scope>
        </dependency>

And the most important part, the heart of te test, from where everything is starting, it must run in multi threads.

    public class TestContext {
	private ThreadLocal<Response> threadLocalResponse = new ThreadLocal<>();
	private ThreadLocal<Map<String, Object>> threadLocalSession = ThreadLocal.withInitial(HashMap::new);
	public RequestSpecification requestSetup() {
		SharedData sharedData = new SharedData();
		RestAssured.reset();
		Options options = Options.builder().logStacktrace().build();
		RestAssuredConfig config = CurlRestAssuredConfigFactory.createConfig(options);
		RestAssured.baseURI = sharedData.getBaseURL();
		return RestAssured.given()
				.config(config)
				.filter(new RestAssuredFilter())
				.contentType("application/json")
				.accept("application/json")
				.header("x-colt-user-agent", "portal-ui");
	}

	public void setResponse(Response response) {
		threadLocalResponse.set(response);
	}

	public Response getResponse() {
		return threadLocalResponse.get();
	}

	public void setSessionAttribute(String key, Object value) {
		threadLocalSession.get().put(key, value);
	}
	public Object getSessionAttribute(String key) {
		return threadLocalSession.get().get(key);
	}}
