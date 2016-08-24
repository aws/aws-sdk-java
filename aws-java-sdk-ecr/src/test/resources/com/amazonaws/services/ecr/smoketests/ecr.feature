# language: en
@smoke @ecr
Feature: Amazon ECR

  I want to use Amazon ECR

  Scenario: Making a request
    When I call the "DescribeRepositories" API
    Then the value at "repositories" should be a list

  Scenario: Handling errors
    When I attempt to call the "ListImages" API with:
    | repositoryName  | not-a-real-repository  |
    Then I expect the response error code to be "RepositoryNotFoundException"
