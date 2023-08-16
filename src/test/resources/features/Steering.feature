Feature: Steering Tests
#  44 scenarios

  Background: Create Token
    Given I save the "loginEndPoint" EndPoint
    And I save during the session the login response
    Then I verify the response code is 200
    Given I save the "barcelonaBranch" EndPoint
    And I lock "true" the Site
    Then I retrieve the SoftAssertions

  @pass     @happyflow
#    Protocol ICMP without Prioritized and Avoid values
  Scenario: Sdwan - combined data #1  - 200 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Protocol Rule
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType | Application | Protocol | Behavior                                          | EvaluateContinuously | Editable | Priority | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN1 | PROTOCOL | Application | ICMP     | STEER_TRAFFIC_AND_FORWARD_ERROR_CORRECTION_ALWAYS | true                 | true     | 1        | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "steering" EndPoint
    Then I create PUT request to delete Steering Rule
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass    @happyflow
#    Protocol TCP without Prioritized and Avoid values
  Scenario: Sdwan - combined data #2  - 200 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Protocol Rule
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType | Application | Protocol | Behavior                                          | EvaluateContinuously | Editable | Priority | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN1 | PROTOCOL | Application | TCP      | STEER_TRAFFIC_AND_FORWARD_ERROR_CORRECTION_ALWAYS | true                 | true     | 1        | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "steering" EndPoint
    Then I create PUT request to delete Steering Rule
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
#    Protocol UDP without Prioritized and Avoid values
  Scenario: Sdwan - combined data #3  - 200 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Protocol Rule
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType | Application | Protocol | Behavior                                          | EvaluateContinuously | Editable | Priority | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN1 | PROTOCOL | Application | UDP      | STEER_TRAFFIC_AND_FORWARD_ERROR_CORRECTION_ALWAYS | true                 | true     | 1        | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "steering" EndPoint
    Then I create PUT request to delete Steering Rule
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
#    Application without Prioritized and Avoid values
  Scenario: Sdwan - combined data #4  - 200 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Application Rule
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                                          | EvaluateContinuously | Editable | Priority | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_FORWARD_ERROR_CORRECTION_ALWAYS | true                 | true     | 1        | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "steering" EndPoint
    Then I create PUT request to delete Steering Rule
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
#    INT-WAN1 on Prioritized Interfaces 1 and INT-WAN2 on Prioritized Interfaces 1
  Scenario: Sdwan - combined data #5  - 200 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Rule same Priority
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                                          | EvaluateContinuously | Editable | Priority | FirstPriorityCircuitValue | FirstPriorityCircuitName | SecondPriorityCircuitValue | SecondPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_FORWARD_ERROR_CORRECTION_ALWAYS | true                 | true     | 1        | 1                         | INT-WAN                  | 1                          | MPLS-WAN                  | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "steering" EndPoint
    Then I create PUT request to delete Steering Rule
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
#    INT-WAN1 on Prioritized Interfaces and INT-WAN2 on Avoid Interfaces
  Scenario: Sdwan - combined data #6  - 200 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Rule one Priority one Avoid
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                                          | EvaluateContinuously | Editable | Priority | FirstAvoidCircuit | FirstPriorityCircuitValue | FirstPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_FORWARD_ERROR_CORRECTION_ALWAYS | true                 | true     | 1        | MPLS-WAN          | 1                         | INT-WAN                  | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "steering" EndPoint
    Then I create PUT request to delete Steering Rule
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
#    INT-WAN1 and INT-WAN2 on Avoid Interfaces
  Scenario: Sdwan - combined data #7  - 200 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Rule two Avoid
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                                          | EvaluateContinuously | Editable | Priority | FirstAvoidCircuit | SecondAvoidCircuit | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_FORWARD_ERROR_CORRECTION_ALWAYS | true                 | true     | 1        | MPLS-WAN          | INT-WAN            | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "steering" EndPoint
    Then I create PUT request to delete Steering Rule
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
#    INT-WAN1 on Prioritized Interfaces 1 and INT-WAN2 on Prioritized Interfaces 2
  Scenario: Sdwan - combined data #8  - 200 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Rule same Priority
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                                          | EvaluateContinuously | Editable | Priority | FirstPriorityCircuitValue | FirstPriorityCircuitName | SecondPriorityCircuitValue | SecondPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_FORWARD_ERROR_CORRECTION_ALWAYS | true                 | true     | 1        | 1                         | INT-WAN                  | 2                          | MPLS-WAN                  | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "steering" EndPoint
    Then I create PUT request to delete Steering Rule
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
#  Behavior: Steer traffic and Forward Error Correction by metric
  Scenario: Sdwan - combined data #9  - 200 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Rule same Priority
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                                       | EvaluateContinuously | Editable | Priority | FirstPriorityCircuitValue | FirstPriorityCircuitName | SecondPriorityCircuitValue | SecondPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_FORWARD_ERROR_CORRECTION_SLA | true                 | true     | 1        | 1                         | INT-WAN                  | 1                          | MPLS-WAN                  | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "steering" EndPoint
    Then I create PUT request to delete Steering Rule
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
#  Behavior: Steer traffic with Replication Always
  Scenario: Sdwan - combined data #10  - 200 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Rule same Priority
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                             | EvaluateContinuously | Editable | Priority | FirstPriorityCircuitValue | FirstPriorityCircuitName | SecondPriorityCircuitValue | SecondPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_REPLICATION_ALWAYS | true                 | true     | 1        | 1                         | INT-WAN                  | 1                          | MPLS-WAN                  | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "steering" EndPoint
    Then I create PUT request to delete Steering Rule
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
#  Behavior: Steer traffic and Replication by metric
  Scenario: Sdwan - combined data #11  - 200 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Rule same Priority
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                          | EvaluateContinuously | Editable | Priority | FirstPriorityCircuitValue | FirstPriorityCircuitName | SecondPriorityCircuitValue | SecondPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_REPLICATION_SLA | true                 | true     | 1        | 1                         | INT-WAN                  | 1                          | MPLS-WAN                  | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "steering" EndPoint
    Then I create PUT request to delete Steering Rule
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
  Scenario: Add Rule without authentication  - 401 Error Code
    Given I save the "steering" EndPoint
    And I create PUT request for Steering Rule without authentication
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                          | EvaluateContinuously | Editable | Priority | FirstPriorityCircuitValue | FirstPriorityCircuitName | SecondPriorityCircuitValue | SecondPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_REPLICATION_SLA | true                 | true     | 1        | 1                         | INT-WAN                  | 1                          | MPLS-WAN                  | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
#    here is not handled the body response to verify a message
    Then I verify the response code is 401
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
  Scenario: Add Rule without being locked  - 400 Error Code
    And I lock "false" the Site
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Rule same Priority
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                          | EvaluateContinuously | Editable | Priority | FirstPriorityCircuitValue | FirstPriorityCircuitName | SecondPriorityCircuitValue | SecondPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_REPLICATION_SLA | true                 | true     | 1        | 1                         | INT-WAN                  | 1                          | MPLS-WAN                  | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    And I verify the Response of detail attribute "Site is not locked."
    And I verify the Response of status attribute "400"
    Then I verify the response code is 400
    Then I retrieve the SoftAssertions

  @pass
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

  @pass
  Scenario: Add Rule Non Existing Site - 404 Error Code
    Given I save the "nonExistingSite" EndPoint
    And I create PUT request for Sdwan Steering Rule same Priority
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                          | EvaluateContinuously | Editable | Priority | FirstPriorityCircuitValue | FirstPriorityCircuitName | SecondPriorityCircuitValue | SecondPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_REPLICATION_SLA | true                 | true     | 1        | 1                         | INT-WAN                  | 1                          | MPLS-WAN                  | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    And I verify the Response of error attribute "Not Found"
    And I verify the Response of status attribute "404"
    Then I verify the response code is 404
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
  Scenario: Sdwan - Name validation #1  - 422 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Rule same Priority
      | DescriptionSaveRule     | Name   | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                          | EvaluateContinuously | Editable | Priority | FirstPriorityCircuitValue | FirstPriorityCircuitName | SecondPriorityCircuitValue | SecondPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | ABC!@# | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_REPLICATION_SLA | true                 | true     | 1        | 1                         | INT-WAN                  | 1                          | MPLS-WAN                  | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    And I verify the Response of detail attribute "Special characters are not allowed."
    And I verify the Response of title attribute "Validation Error"
    And I verify the Response of status attribute "422"
    Then I verify the response code is 422
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
  Scenario: Sdwan - Name validation  #2  - 422 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Rule same Priority
      | DescriptionSaveRule     | Name | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                          | EvaluateContinuously | Editable | Priority | FirstPriorityCircuitValue | FirstPriorityCircuitName | SecondPriorityCircuitValue | SecondPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | !@#  | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_REPLICATION_SLA | true                 | true     | 1        | 1                         | INT-WAN                  | 1                          | MPLS-WAN                  | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    And I verify the Response of detail attribute "The first character of a rule name must start with a letter."
    And I verify the Response of title attribute "Validation Error"
    And I verify the Response of status attribute "422"
    Then I verify the response code is 422
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
  Scenario: Sdwan - Name validation #3  - 422 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Rule same Priority
      | DescriptionSaveRule     | Name             | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                          | EvaluateContinuously | Editable | Priority | FirstPriorityCircuitValue | FirstPriorityCircuitName | SecondPriorityCircuitValue | SecondPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | text with spaces | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_REPLICATION_SLA | true                 | true     | 1        | 1                         | INT-WAN                  | 1                          | MPLS-WAN                  | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    And I verify the Response of detail attribute "Special characters are not allowed."
    And I verify the Response of title attribute "Validation Error"
    And I verify the Response of status attribute "422"
    Then I verify the response code is 422
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
  Scenario: Sdwan - Name validation #4  - 422 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Protocol Rule, with empty Name
      | DescriptionSaveRule     | Name | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                          | EvaluateContinuously | Editable | Priority | FirstPriorityCircuitValue | FirstPriorityCircuitName | SecondPriorityCircuitValue | SecondPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes |      | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_REPLICATION_SLA | true                 | true     | 1        | 1                         | INT-WAN                  | 1                          | MPLS-WAN                  | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    And I verify the Response of detail attribute "A name with at least one character should be provided."
    And I verify the Response of title attribute "Validation Error"
    And I verify the Response of status attribute "422"
    Then I verify the response code is 422
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
  Scenario: Sdwan - Name validation #5  - 400 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Rule same Priority
      | DescriptionSaveRule     | Name                                          | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                          | EvaluateContinuously | Editable | Priority | FirstPriorityCircuitValue | FirstPriorityCircuitName | SecondPriorityCircuitValue | SecondPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_REPLICATION_SLA | true                 | true     | 1        | 1                         | INT-WAN                  | 1                          | MPLS-WAN                  | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    And I verify the Response of title attribute "Constraint Violation"
    And I verify the Response of status attribute "400"
    Then I verify the response code is 400
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @failed
  Scenario: Sdwan - Empty Packet Loss validation  - 400 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Rule, with empty Packet Loss
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                          | EvaluateContinuously | Editable | Priority | FirstPriorityCircuitValue | FirstPriorityCircuitName | SecondPriorityCircuitValue | SecondPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_REPLICATION_SLA | true                 | true     | 1        | 1                         | INT-WAN                  | 1                          | MPLS-WAN                  | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE |           |
    And I verify the Response of title attribute "Bad Request"
    And I verify the Response of status attribute "400"
    Then I verify the response code is 400
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @failed
  Scenario: Sdwan - Incorrect Packet Loss - 400 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Rule same Priority
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                          | EvaluateContinuously | Editable | Priority | FirstPriorityCircuitValue | FirstPriorityCircuitName | SecondPriorityCircuitValue | SecondPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_REPLICATION_SLA | true                 | true     | 1        | 1                         | INT-WAN                  | 1                          | MPLS-WAN                  | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 150       |
    And I verify the Response of detail attribute "Florin, here is suppose to be a warning"
    And I verify the Response of status attribute "400"
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @failed
  Scenario: Sdwan - Incorrect Source IP - 400 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Rule same Priority
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                          | EvaluateContinuously | Editable | Priority | FirstPriorityCircuitValue | FirstPriorityCircuitName | SecondPriorityCircuitValue | SecondPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_REPLICATION_SLA | true                 | true     | 1        | 1                         | INT-WAN                  | 1                          | MPLS-WAN                  | 11111         | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    And I verify the Response of detail attribute "Florin, here is suppose to be a warning"
    And I verify the Response of status attribute "400"
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @failed
  Scenario: Sdwan - Incorrect Destination IP - 400 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Rule same Priority
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                          | EvaluateContinuously | Editable | Priority | FirstPriorityCircuitValue | FirstPriorityCircuitName | SecondPriorityCircuitValue | SecondPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_REPLICATION_SLA | true                 | true     | 1        | 1                         | INT-WAN                  | 1                          | MPLS-WAN                  | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 44444              | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    And I verify the Response of detail attribute "Florin, here is suppose to be a warning"
    And I verify the Response of status attribute "400"
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
  Scenario: Sdwan - Incorrect Source Port  - 422 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Rule same Priority
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                          | EvaluateContinuously | Editable | Priority | FirstPriorityCircuitValue | FirstPriorityCircuitName | SecondPriorityCircuitValue | SecondPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_REPLICATION_SLA | true                 | true     | 1        | 1                         | INT-WAN                  | 1                          | MPLS-WAN                  | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 55               | 45             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 95                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    And I verify the Response of title attribute "Validation Error"
    And I verify the Response of status attribute "422"
    Then I verify the response code is 422
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
  Scenario: Sdwan - Incorrect Destination Port  - 422 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Sdwan Steering Rule same Priority
      | DescriptionSaveRule     | Name         | RuleDescription  | Vpn  | RuleType    | Application   | Protocol | Behavior                          | EvaluateContinuously | Editable | Priority | FirstPriorityCircuitValue | FirstPriorityCircuitName | SecondPriorityCircuitValue | SecondPriorityCircuitName | SourceFirstIp | SourceSecondIp | SourceFirstFrom | SourceFirstTo | SourceSecondFrom | SourceSecondTo | DestinationFirstIp | DestinationSecondIp | DestinationFirstFrom | DestinationFirstTo | DestinationSecondFrom | DestinationSecondTo | Metric          | Threshold |
      | Steering saving changes | SteeringName | Rule Description | LAN2 | APPLICATION | FACEBOOK_CODE | ANY      | STEER_TRAFFIC_AND_REPLICATION_SLA | true                 | true     | 1        | 1                         | INT-WAN                  | 1                          | MPLS-WAN                  | 1.2.3.4/32    | 4.5.6.6/32     | 5               | 15            | 25               | 25             | 4.3.2.1/32         | 5.6.7.8/32          | 85                   | 75                 | 55                    | 55                  | LOSS_PERCENTAGE | 55        |
    And I verify the Response of title attribute "Validation Error"
    And I verify the Response of status attribute "422"
    Then I verify the response code is 422
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass    @happyflow
#    Network Lan2 - Two applications
  Scenario: Internet - combined data #1  - 200 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Internet Steering Rule
      | Priority | Name         | RuleDescription      | FirstApplication | SecondApplication | RuleType    | Vpn  | BreakoutType | BreakoutTypePriority | LocalInterface |
      | 1        | SteeringName | Steering Description | FACEBOOK_CODE    | FACEBOOK_GAMES    | APPLICATION | LAN1 | LOCAL        | 1                    | INT-WAN        |
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "steering" EndPoint
    Then I create PUT request to delete Steering Rule
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site

  @pass
  Scenario: Internet - Name validation #1  - 422 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Internet Steering Rule
      | Priority | Name   | RuleDescription      | FirstApplication | SecondApplication | RuleType    | Vpn  | BreakoutType | BreakoutTypePriority | LocalInterface |
      | 1        | ABC!@# | Steering Description | FACEBOOK_CODE    | FACEBOOK_GAMES    | APPLICATION | LAN1 | LOCAL        | 1                    | INT-WAN        |
    And I verify the Response of detail attribute "Special characters are not allowed."
    And I verify the Response of title attribute "Validation Error"
    And I verify the Response of status attribute "422"
    Then I verify the response code is 422
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
  Scenario: Internet - Name validation  #2  - 422 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Internet Steering Rule
      | Priority | Name | RuleDescription      | FirstApplication | SecondApplication | RuleType    | Vpn  | BreakoutType | BreakoutTypePriority | LocalInterface |
      | 1        | !@#  | Steering Description | FACEBOOK_CODE    | FACEBOOK_GAMES    | APPLICATION | LAN1 | LOCAL        | 1                    | INT-WAN        |
    And I verify the Response of detail attribute "The first character of a rule name must start with a letter."
    And I verify the Response of title attribute "Validation Error"
    And I verify the Response of status attribute "422"
    Then I verify the response code is 422
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
  Scenario: Internet - Name validation #3  - 422 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Internet Steering Rule
      | Priority | Name             | RuleDescription      | FirstApplication | SecondApplication | RuleType    | Vpn  | BreakoutType | BreakoutTypePriority | LocalInterface |
      | 1        | text with spaces | Steering Description | FACEBOOK_CODE    | FACEBOOK_GAMES    | APPLICATION | LAN1 | LOCAL        | 1                    | INT-WAN        |
    And I verify the Response of detail attribute "Special characters are not allowed."
    And I verify the Response of title attribute "Validation Error"
    And I verify the Response of status attribute "422"
    Then I verify the response code is 422
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
  Scenario: Internet - Name validation #4  - 422 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for Internet Steering Rule, with empty Name
      | Priority | Name | RuleDescription      | FirstApplication | SecondApplication | RuleType    | Vpn  | BreakoutType | BreakoutTypePriority | LocalInterface |
      | 1        |      | Steering Description | FACEBOOK_CODE    | FACEBOOK_GAMES    | APPLICATION | LAN1 | LOCAL        | 1                    | INT-WAN        |
    And I verify the Response of detail attribute "A name with at least one character should be provided."
    And I verify the Response of title attribute "Validation Error"
    And I verify the Response of status attribute "422"
    Then I verify the response code is 422
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
  Scenario: Internet - Name validation #5  - 400 Error Code (Validation Error)
    Given I save the "steering" EndPoint
    And I create PUT request for Internet Steering Rule
      | Priority | Name                                          | RuleDescription      | FirstApplication | SecondApplication | RuleType    | Vpn  | BreakoutType | BreakoutTypePriority | LocalInterface |
      | 1        | iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii | Steering Description | FACEBOOK_CODE    | FACEBOOK_GAMES    | APPLICATION | LAN1 | LOCAL        | 1                    | INT-WAN        |
    And I verify the Response of title attribute "Constraint Violation"
    And I verify the Response of status attribute "400"
    Then I verify the response code is 400
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
#    SAAS application: Adobe-Apps, Lan1
  Scenario: SAAS - combined data #1  - 200 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for SAAS Steering Rule
      | Priority | MaxLatency | MaxPacketLoss | Network | SaasApplication | SaasApplicationFqdn | BreakoutType | SlaNextHopsPriority | LocalInterface |
      | 1        | 500        | 40            | LAN1    | Adobe-Apps      | www.adobe.com       | LOCAL        | 1                   | INT-WAN        |
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "steering" EndPoint
    Then I create PUT request to delete Steering Rule
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
#    SAAS application: Box-Apps, Lan2
  Scenario: SAAS - combined data #1  - 200 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for SAAS Steering Rule
      | Priority | MaxLatency | MaxPacketLoss | Network | SaasApplication | SaasApplicationFqdn | BreakoutType | SlaNextHopsPriority | LocalInterface |
      | 1        | 500        | 40            | LAN2    | Box-Apps        | www.box.com         | LOCAL        | 1                   | INT-WAN        |
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "steering" EndPoint
    Then I create PUT request to delete Steering Rule
    Then I verify the response code is 200
    Given I save the "sitePropertiesBarcelona" EndPoint
    And I wait until the site is has finish the commit changes
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
  Scenario: SAAS - Null Packet Loss validation  - 400 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for SAAS Steering Rule, with null Packet Loss
      | Priority | MaxLatency | MaxPacketLoss | Network | SaasApplication | SaasApplicationFqdn | BreakoutType | SlaNextHopsPriority | LocalInterface |
      | 1        | 500        |               | LAN1    | Adobe-Apps      | www.adobe.com       | LOCAL        | 1                   | INT-WAN        |
    And I verify the Response of title attribute "Constraint Violation"
    And I verify the Response of status attribute "400"
    Then I verify the response code is 400
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
  Scenario: SAAS - Incorrect Packet Loss - 400 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for SAAS Steering Rule
      | Priority | MaxLatency | MaxPacketLoss | Network | SaasApplication | SaasApplicationFqdn | BreakoutType | SlaNextHopsPriority | LocalInterface |
      | 1        | 500        | 150           | LAN2    | Box-Apps        | www.box.com         | LOCAL        | 1                   | INT-WAN        |
    And I verify the Response of title attribute "Constraint Violation"
    And I verify the Response of status attribute "400"
    Then I verify the response code is 400
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
  Scenario: SAAS - Empty Max Latency validation  - 400 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for SAAS Steering Rule, with null Max Latency
      | Priority | MaxLatency | MaxPacketLoss | Network | SaasApplication | SaasApplicationFqdn | BreakoutType | SlaNextHopsPriority | LocalInterface |
      | 1        | 500        | 50            | LAN2    | Box-Apps        | www.box.com         | LOCAL        | 1                   | INT-WAN        |
    And I verify the Response of title attribute "Constraint Violation"
    And I verify the Response of status attribute "400"
    Then I verify the response code is 400
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
  Scenario: SAAS - Empty SAAS Application validation  - 422 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for SAAS Steering Rule, with null SAAS Application
      | Priority | MaxLatency | MaxPacketLoss | Network | SaasApplication | SaasApplicationFqdn | BreakoutType | SlaNextHopsPriority | LocalInterface |
      | 1        | 500        | 50            | LAN2    |                 |                     | LOCAL        | 1                   | INT-WAN        |
    And I verify the Response of detail attribute "SaaS Application: A name with at least one character should be provided."
    And I verify the Response of title attribute "Validation Error"
    And I verify the Response of status attribute "422"
    Then I verify the response code is 422
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

  @pass
  Scenario: SAAS - Incorrect Max Latency - 400 Status Code
    Given I save the "steering" EndPoint
    And I create PUT request for SAAS Steering Rule
      | Priority | MaxLatency | MaxPacketLoss | Network | SaasApplication | SaasApplicationFqdn | BreakoutType | SlaNextHopsPriority | LocalInterface |
      | 1        | 1500       | 50            | LAN2    | Box-Apps        | www.box.com         | LOCAL        | 1                   | INT-WAN        |
    And I verify the Response of title attribute "Constraint Violation"
    And I verify the Response of status attribute "400"
    Then I verify the response code is 400
    Given I save the "barcelonaBranch" EndPoint
    And I lock "false" the Site
    Then I retrieve the SoftAssertions

