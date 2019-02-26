# language: en
@smoke @inspector
Feature: Amazon Inspector

  Scenario: Making a request
    When I call the "DescribeRulesPackages" API with:
    | rulesPackageArns | fake-arn |
    Then the value at "failedItems" should be a map

  Scenario: Handling errors
    When I attempt to call the "ListAssessmentRuns" API with:
    | assessmentTemplateArns | fake-arn |
    Then I expect the response error code to be "InvalidInputException"
