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
Feature: Graph Module

  @positive @Negative
  Scenario: User navigates to Graph module
    Given User is on Graph module
    When User clicks on Graph modules Get Start button
    Then User launches on Graph page

  @positive
  Scenario: User Clicks TryHere
    Given user clicks on TryHere button
    And user navigated to Tryeditor page to write a Python code
    When user is writing Python code
    And user clicks on Run button
    Then user can see the Output of Python code

  @Negative
  Scenario: user is trying to click on TryEditor for Invalid data
    Given user navigates back to click TryHere button
    And user clicks on TryHere button
    And user navigated to Tryeditor page to write a Python code
    When user is entering Invalid Python code
    And user clicks on Run button
    Then user is capturing Alert message
    And user navigates back to previous page

  @positive
  Scenario: User clicks on Graphs representation
    Given User is on representation on graph
    When User clicks on representation in graph button
    Then User launches on representation in graph page

  @positive
  Scenario: User Clicks TryHere
    Given user clicks on TryHere button
    And user navigated to Tryeditor page to write a Python code
    When user is writing Python code
    And user clicks on Run button
    Then user can see the Output of Python code

  @Negative
  Scenario: user is trying to click on TryEditor for Invalid data
    Given user navigates back to click TryHere button
    And user clicks on TryHere button
    And user navigated to Tryeditor page to write a Python code
    When user is entering Invalid Python code
    And user clicks on Run button
    Then user is capturing Alert message
    And user navigates back to previous page
    
     @positive
  Scenario: user is trying to click Practice Questions
    Given user clicks on Practice Questions
    When user navigates to practice Questions
    Then user navigates back to HomePage
