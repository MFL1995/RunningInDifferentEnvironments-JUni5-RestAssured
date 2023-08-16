package utils;

import com.github.dzieciou.testing.curl.CurlRestAssuredConfigFactory;
import com.github.dzieciou.testing.curl.Options;
import io.cucumber.java.BeforeAll;
import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

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
	}
}
