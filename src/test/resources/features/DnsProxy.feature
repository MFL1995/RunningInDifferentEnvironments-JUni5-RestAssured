Feature: DnsProxy Tests

  Background: Create Token
    Given I save the "loginEndPoint" EndPoint
    And I create Patch request with a different user
    Then I verify the response code is 200
    Given I save the "birmingham" EndPoint
#    Given I save the "BK2Branch" EndPoint
    And I lock "true" the Site
    Then I retrieve the SoftAssertions

  @happyflow
  Scenario: Add Rule with Round Robin  - 200 Status Code
    Given I save the "dnsProxy" EndPoint
    And I create PUT request for DnsProxy Rule
      | Description | ProxyName          | ProxyVpn | ProxyMode   | ProxyQueryPattern | DnsName  | DnsIp   | DnsDomain         | DnsMonitor |
      | textFlorin  | DNS-Profile-1-LAN1 | LAN1     | ROUND_ROBIN | automationFlorin  | FirstDns | 1.2.3.4 | automation.florin | true       |
    Then I verify the response code is 200
    Given I save the "sitePropertiesBirmingham" EndPoint
#    Given I save the "sitePropertiesBK2" EndPoint
    And I wait until the site is has finish the commit changes
    Then I create PUT request to delete the DnsProxy rule
    Given I save the "sitePropertiesBirmingham" EndPoint
#    Given I save the "sitePropertiesBK2" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "birmingham" EndPoint
#    Given I save the "BK2Branch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @happyflow
  Scenario: Add Rule with Failover  - 200 Status Code
    Given I save the "dnsProxy" EndPoint
    And I create PUT request for DnsProxy Rule
      | Description | ProxyName          | ProxyVpn | ProxyMode | ProxyQueryPattern | DnsName  | DnsIp   | DnsDomain         | DnsMonitor |
      | textFlorin  | DNS-Profile-1-LAN2 | LAN2     | FAILOVER  | automationFlorin  | FirstDns | 1.2.3.4 | automation.florin | true       |
    Then I verify the response code is 200
    Given I save the "sitePropertiesBirmingham" EndPoint
#    Given I save the "sitePropertiesBK2" EndPoint
    And I wait until the site is has finish the commit changes
    Then I create PUT request to delete the DnsProxy rule
    Given I save the "sitePropertiesBirmingham" EndPoint
#    Given I save the "sitePropertiesBK2" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "birmingham" EndPoint
#    Given I save the "BK2Branch" EndPoint
    And I lock "false" the Site

#  @happyflow
#    not implemented
  Scenario: Add Rule Two DNS  - 200 Status Code
    Given I save the "dnsProxy" EndPoint
    And I create PUT request for DnsProxy Rule, with two DNS
      | Description | ProxyName          | ProxyVpn | ProxyMode | ProxyQueryPattern | DnsName  | DnsIp   | DnsDomain         | DnsMonitor |
      | textFlorin  | DNS-Profile-1-LAN2 | LAN2     | FAILOVER  | automationFlorin  | FirstDns | 1.2.3.4 | automation.florin | true       |
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Then I create PUT request to delete the DnsProxy rule
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site

#  @happyflow
#    not implemented
  Scenario: Add Rule Three DNS  - 200 Status Code
    Given I save the "dnsProxy" EndPoint
    And I create PUT request for DnsProxy Rule, with three DNS
      | Description | ProxyName          | ProxyVpn | ProxyMode | ProxyQueryPattern | DnsName  | DnsIp   | DnsDomain         | DnsMonitor |
      | textFlorin  | DNS-Profile-1-LAN2 | LAN2     | FAILOVER  | automationFlorin  | FirstDns | 1.2.3.4 | automation.florin | true       |
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Then I create PUT request to delete the DnsProxy rule
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site

  Scenario: Add Rule without authentication  - 401 Error Code
    Given I save the "dnsProxy" EndPoint
    And I create PUT request for DnsProxy Rule without authentication
      | Description | ProxyName          | ProxyVpn | ProxyMode   | ProxyQueryPattern | DnsName  | DnsIp   | DnsDomain         | DnsMonitor |
      | textFlorin  | DNS-Profile-1-LAN1 | LAN1     | ROUND_ROBIN | automationFlorin  | FirstDns | 1.2.3.4 | automation.florin | true       |
#    here is not handled the body response to verify a message
    Then I verify the response code is 401
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  Scenario: Add Rule without being locked  - 400 Error Code (Validation Error)
    And I lock "false" the Site
    Given I save the "dnsProxy" EndPoint
    And I create PUT request for DnsProxy Rule
      | Description | ProxyName          | ProxyVpn | ProxyMode | ProxyQueryPattern | DnsName  | DnsIp   | DnsDomain         | DnsMonitor |
      | textFlorin  | DNS-Profile-1-LAN2 | LAN2     | FAILOVER  | automationFlorin  | FirstDns | 1.2.3.4 | automation.florin | false      |
    And I verify the Response of detail attribute "Site is not locked."
    And I verify the Response of status attribute "400"
    Then I verify the response code is 400
    Then I retrieve the SoftAssertions

  Scenario: Locked by someone else  - 400 Error Code
    Given I save the "loginEndPoint" EndPoint
    And I create Patch request with a different user
    Then I verify the response code is 200
    Given I save the "barcelonaBranch" EndPoint
    And I lock "true" the Site
    And I verify the Response of detail attribute "Site with id 2018 is already locked by another user."
    And I verify the Response of title attribute "Validation Error"
    And I verify the Response of status attribute "400"
    Then I verify the response code is 400
    Given I save the "loginEndPoint" EndPoint
    And I save during the session the login response
    Then I verify the response code is 200
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  Scenario: Add Rule with Non Existing Site - 404 Error Code
    Given I save the "nonExistingSite" EndPoint
    And I create PUT request for DnsProxy Rule
      | Description | ProxyName          | ProxyVpn | ProxyMode | ProxyQueryPattern | DnsName  | DnsIp   | DnsDomain         | DnsMonitor |
      | textFlorin  | DNS-Profile-1-LAN2 | LAN2     | FAILOVER  | automationFlorin  | FirstDns | 1.2.3.4 | automation.florin | false      |
#    here is not handled the body response to verify a message
    Then I verify the response code is 404
    And I verify the response time is less than 1000 Milliseconds
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  Scenario: Add Rule with Incorrect Site - 405 Error Code
    Given I save the "incorrectSite" EndPoint
    And I create PUT request for DnsProxy Rule
      | Description | ProxyName          | ProxyVpn | ProxyMode | ProxyQueryPattern | DnsName  | DnsIp   | DnsDomain         | DnsMonitor |
      | textFlorin  | DNS-Profile-1-LAN2 | LAN2     | FAILOVER  | automationFlorin  | FirstDns | 1.2.3.4 | automation.florin | false      |
    And I verify the Response of detail attribute "Request method 'PUT' not supported"
    And I verify the Response of status attribute "405"
    Then I verify the response code is 405
    And I verify the response time is less than 1000 Milliseconds
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  Scenario: Add Rule with blank values  - 400 Error Code (Validation Error)
    Given I save the "dnsProxy" EndPoint
    And I create PUT request for DnsProxy Rule
      | Description | ProxyName | ProxyVpn | ProxyMode | ProxyQueryPattern | DnsName  | DnsIp   | DnsDomain         | DnsMonitor |
      | textFlorin  | [blank]   | [blank]  | FAILOVER  | automationFlorin  | FirstDns | 1.2.3.4 | automation.florin | false      |
    And I verify the Response of detail attribute "Invalid profile name. Please follow the standard ex: 'DNS-Profile-1-LAN1'"
    And I verify the Response of status attribute "400"
    Then I verify the response code is 400
    And I verify the response time is less than 1000 Milliseconds
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  Scenario: Add Rule with incorrect Mode value  - 400 Error Code (Validation Error)
    Given I save the "dnsProxy" EndPoint
    And I create PUT request for DnsProxy Rule
      | Description | ProxyName          | ProxyVpn | ProxyMode      | ProxyQueryPattern | DnsName  | DnsIp   | DnsDomain         | DnsMonitor |
      | textFlorin  | DNS-Profile-1-LAN2 | LAN2     | incorrectValue | automationFlorin  | FirstDns | 1.2.3.4 | automation.florin | false      |
    And I verify the Response of title attribute "Bad Request"
    And I verify the Response of status attribute "400"
    Then I verify the response code is 400
    And I verify the response time is less than 1000 Milliseconds
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  Scenario: Add Rule with incorrect DnsIp  - 400 Error Code (Validation Error)
    Given I save the "dnsProxy" EndPoint
    And I create PUT request for DnsProxy Rule
      | Description | ProxyName          | ProxyVpn | ProxyMode   | ProxyQueryPattern | DnsName  | DnsIp | DnsDomain         | DnsMonitor |
      | textFlorin  | DNS-Profile-1-LAN1 | LAN1     | ROUND_ROBIN | automationFlorin  | FirstDns | 1234  | automation.florin | true       |
    And I verify the Response of title attribute "Constraint Violation"
    And I verify the Response of status attribute "400"
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site

#    not implemented
  Scenario: Add Rule with incorrect Predefined Query Patterns  - 400 Error Code (Validation Error)
    Given I save the "dnsProxy" EndPoint
    And I create PUT request for DnsProxy Rule
      | Description | ProxyName          | ProxyVpn | ProxyMode   | ProxyQueryPattern | DnsName  | DnsIp | DnsDomain         | DnsMonitor |
      | textFlorin  | DNS-Profile-1-LAN1 | LAN1     | ROUND_ROBIN | automationFlorin  | FirstDns | 1234  | automation.florin | true       |
    And I verify the Response of title attribute "Constraint Violation"
    And I verify the Response of status attribute "400"
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site

#    not implemented
  Scenario: Add Rule with incorrect DnsIp  - 400 Error Code (Validation Error)
    Given I save the "dnsProxy" EndPoint
    And I create PUT request for DnsProxy Rule with empty DnsIp
      | Description | ProxyName          | ProxyVpn | ProxyMode   | ProxyQueryPattern | DnsName  | DnsIp | DnsDomain         | DnsMonitor |
      | textFlorin  | DNS-Profile-1-LAN1 | LAN1     | ROUND_ROBIN | automationFlorin  | FirstDns | 1234  | automation.florin | true       |
    And I verify the Response of title attribute "Constraint Violation"
    And I verify the Response of status attribute "400"
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site

  Scenario: Incorrect Domain - 400 Status Code
    Given I save the "dnsProxy" EndPoint
    And I create PUT request for DnsProxy Rule without authentication
      | Description | ProxyName          | ProxyVpn | ProxyMode   | ProxyQueryPattern | DnsName  | DnsIp   | DnsDomain         | DnsMonitor |
      | textFlorin  | DNS-Profile-1-LAN1 | LAN1     | ROUND_ROBIN | automationFlorin  | FirstDns | 1.2.3.4 | automation.florin | true       |
    And I verify the Response of detail attribute "Florin, here is suppose to be a warning"
    And I verify the Response of status attribute "400"
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

#    not implemented
  Scenario: Name validation #1  - 422 Status Code
    Given I save the "dnsProxy" EndPoint
    And I create PUT request for DnsProxy Rule
      | Description | ProxyName          | ProxyVpn | ProxyMode | ProxyQueryPattern | DnsName | DnsIp   | DnsDomain         | DnsMonitor |
      | textFlorin  | DNS-Profile-1-LAN2 | LAN2     | FAILOVER  | automationFlorin  | ABC!@#  | 1.2.3.4 | automation.florin | true       |
    And I verify the Response of detail attribute "Special characters are not allowed."
    And I verify the Response of title attribute "Validation Error"
    And I verify the Response of status attribute "422"
    Then I verify the response code is 422
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

#    not implemented
  Scenario: Name validation  #2  - 422 Status Code
    Given I save the "dnsProxy" EndPoint
    And I create PUT request for DnsProxy Rule
      | Description | ProxyName          | ProxyVpn | ProxyMode | ProxyQueryPattern | DnsName | DnsIp   | DnsDomain         | DnsMonitor |
      | textFlorin  | DNS-Profile-1-LAN2 | LAN2     | FAILOVER  | automationFlorin  | !@#     | 1.2.3.4 | automation.florin | true       |
    And I verify the Response of detail attribute "The first character of a rule name must start with a letter."
    And I verify the Response of title attribute "Validation Error"
    And I verify the Response of status attribute "422"
    Then I verify the response code is 422
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

#    not implemented
  Scenario: Name validation #3  - 422 Status Code
    Given I save the "dnsProxy" EndPoint
    And I create PUT request for DnsProxy Rule
      | Description | ProxyName          | ProxyVpn | ProxyMode | ProxyQueryPattern | DnsName          | DnsIp   | DnsDomain         | DnsMonitor |
      | textFlorin  | DNS-Profile-1-LAN2 | LAN2     | FAILOVER  | automationFlorin  | text with spaces | 1.2.3.4 | automation.florin | true       |
    And I verify the Response of detail attribute "Special characters are not allowed."
    And I verify the Response of title attribute "Validation Error"
    And I verify the Response of status attribute "422"
    Then I verify the response code is 422
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

#    not implemented
  Scenario: Name validation #4  - 422 Status Code
    Given I save the "dnsProxy" EndPoint
    And I create PUT request for DnsProxy Rule, with empty Name
      | Description | ProxyName          | ProxyVpn | ProxyMode | ProxyQueryPattern | DnsName | DnsIp   | DnsDomain         | DnsMonitor |
      | textFlorin  | DNS-Profile-1-LAN2 | LAN2     | FAILOVER  | automationFlorin  |         | 1.2.3.4 | automation.florin | true       |
    And I verify the Response of detail attribute "A name with at least one character should be provided."
    And I verify the Response of title attribute "Validation Error"
    And I verify the Response of status attribute "422"
    Then I verify the response code is 422
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

#    not implemented
  Scenario: Name validation #5  - 400 Error Code (Validation Error)
    Given I save the "dnsProxy" EndPoint
    And I create PUT request for DnsProxy Rule
      | Description | ProxyName          | ProxyVpn | ProxyMode | ProxyQueryPattern | DnsName                                            | DnsIp   | DnsDomain         | DnsMonitor |
      | textFlorin  | DNS-Profile-1-LAN2 | LAN2     | FAILOVER  | automationFlorin  | llllllllllllllllllllllllllllllllllllllllllllllllll | 1.2.3.4 | automation.florin | true       |
    And I verify the Response of title attribute "Constraint Violation"
    And I verify the Response of status attribute "400"
    Then I verify the response code is 400
    Given I save the "birmingham" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions
