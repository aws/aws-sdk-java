# language: en
@smoke @simpledb @sdb
Feature: Amazon SimpleDB

  I want to use Amazon SimpleDB

  Scenario: Making a request
    When I call the "ListDomains" API
    Then the value at "DomainNames" should be a list

  Scenario: Handling errors
    When I attempt to call the "CreateDomain" API with:
    | DomainName  |   |
    Then I expect the response error code to be "InvalidParameterValue"
