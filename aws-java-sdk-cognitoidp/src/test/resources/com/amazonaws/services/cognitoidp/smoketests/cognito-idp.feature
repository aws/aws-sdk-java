# language: en
@smoke @cognito-idp
Feature: Amazon Cognito Identity Provider

  Scenario: Making a request
    When I call the "ListUserPools" API with:
    | MaxResults | 5 |
    Then the value at "UserPools" should be a list

