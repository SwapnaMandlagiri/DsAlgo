#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: SignIn Page

  @Negative
  Scenario Outline: user enters Invalid data to SignIn
    Given user clicks on signIn page
    And user enters Invalid "<invalidUsername>" and "<invalidPassword>"
    When user clicks on login button
    Then user navigated to home page

    Examples: 
      | invalidUsername | invalidPassword |
      |              84 | sdet84batch     |
      | Numpyninja84    |              84 |

  Scenario Outline: user is redirected to sign in page
    Given user clicks on signIn page
    And user enters valid "<username>" and "<password>"
    When user clicks on login button
    Then user navigated to home page

    Examples: 
      | username    | password    |
      | Numpysdet84 | sdet84batch |
