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
@LinkedList
Feature: LinkedList

  @positive
  Scenario: user navigated introduction page
    Given user is in LinkeList page after logged In
    When user clicks on introduction link
    Then user is directed to introduction page of linked list

  @positive
  Scenario: user navigated to try editor page
    Given user is on the creating  list after logged in
    When user clicks on TryHere button
    Then user navigated to Tryeditor page to write a Python code

  @positive
  Scenario: user run the code in try editor with valid input for intro page
    Given user navigated to Tryeditor page to write a Python code
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
    And user navigates back to previous page

  @create_linked_List
  Scenario: user navigated to creating a linked list page
    Given user is in the linked list page after logged In
    When user clicks on the creating a linked list button
    Then user should be directed to creating a linked list page

  @positive
  Scenario: user navigated to try editor page
    Given user is on the creating  list after logged in
    When user clicks on TryHere button
    Then user navigated to Tryeditor page to write a Python code

  @positive
  Scenario: user run the code in try editor with valid input for intro page
    Given user navigated to Tryeditor page to write a Python code
    When user is writing Python code
    And user clicks on Run button
    Then user can see the Output of Python code

  @Typesof_linked_List
  Scenario: user navigated to Types of linked list page
    Given user is in the linked list page after logged In
    When user clicks on the Types of linked list button
    Then user should be directed to creating a linked list page

  @positive
  Scenario: user navigated to try editor page
    Given user is on the creating  list after logged in
    When user clicks on TryHere button
    Then user navigated to Tryeditor page to write a Python code

  @positive
  Scenario: user run the code in try editor with valid input for intro page
    Given user navigated to Tryeditor page to write a Python code
    When user is writing Python code
    And user clicks on Run button
    Then user can see the Output of Python code

  @Impliment_linked_List
  Scenario: user navigated to Types of linked list page
    Given user is in the linked list page after logged In
    When user clicks on the Impliment linked button
    Then user should be directed to creating a linked list page

  @positive
  Scenario: user navigated to try editor page
    Given user is on the creating  list after logged in
    When user clicks on TryHere button
    Then user navigated to Tryeditor page to write a Python code

  @positive
  Scenario: user run the code in try editor with valid input for intro page
    Given user navigated to Tryeditor page to write a Python code
    When user is writing Python code
    And user clicks on Run button
    Then user can see the Output of Python code

  @Traversal_linked_List
  Scenario: user navigated to Types of linked list page
    Given user is in the linked list page after logged In
    When user clicks on the Traversal button
    Then user should be directed to creating a linked list page

  @positive
  Scenario: user navigated to try editor page
    Given user is on the creating  list after logged in
    When user clicks on TryHere button
    Then user navigated to Tryeditor page to write a Python code

  @positive
  Scenario: user run the code in try editor with valid input for intro page
    Given user navigated to Tryeditor page to write a Python code
    When user is writing Python code
    And user clicks on Run button
    Then user can see the Output of Python code

  @Insert_linked_List
  Scenario: user navigated to Types of linked list page
    Given user is in the linked list page after logged In
    When user clicks on the insert button
    Then user should be directed to creating a linked list page

  @positive
  Scenario: user navigated to try editor page
    Given user is on the creating  list after logged in
    When user clicks on TryHere button
    Then user navigated to Tryeditor page to write a Python code

  @positive
  Scenario: user run the code in try editor with valid input for intro page
    Given user navigated to Tryeditor page to write a Python code
    When user is writing Python code
    And user clicks on Run button
    Then user can see the Output of Python code
