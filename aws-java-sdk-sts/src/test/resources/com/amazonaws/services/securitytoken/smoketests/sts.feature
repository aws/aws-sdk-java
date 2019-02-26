# language: en
@sts @client
Feature: AWS STS

  Scenario: Making a request
    When I call the "GetSessionToken" API
    Then the response should contain a "Credentials"

  Scenario: Handling errors 1
    When I attempt to call the "GetFederationToken" API with:
    | Name   | temp |
    | Policy |      |
    Then I expect the response error code to be "ValidationError"

  Scenario: Handling errors 2
    When I attempt to call the "GetFederationToken" API with:
    | Name   | temp            |
    | Policy | {\"temp\":true} |
    Then I expect the response error code to be "MalformedPolicyDocument"
