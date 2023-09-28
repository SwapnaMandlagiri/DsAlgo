Feature: Array Module

@Positive @Negative
Scenario: user navigates to Array Module
Given user is on Array Module
When user clicks Array getStarted button
Then user launches Array Page

#Arrays in Python
@Positive @Negative
Scenario: user navigates to Arrays in Python Page
Given user enters into Arrays in Python
When user clicks on Arrays in Python link
Then user lands on Arrays in Python Page

@Positive
Scenario: user is trying to click TryHere button
    Given user clicks on TryHere button
    And user navigated to Tryeditor page to write a Python code
    When user is writing Python code
    And user clicks on Run button
    Then user can see the Output of Python code
   
  @Negative  
  Scenario: user is trying to click on TryEditor for Invalid data

Given user navigates back to click TryHere button
And  user clicks on TryHere button
And user navigated to Tryeditor page to write a Python code
When user is entering Invalid Python code
And user clicks on Run button
Then user is capturing Alert message
  And user navigates back to previous page 
  
  #Arrays Using List
  
 @Positive @Negative 
  Scenario: user navigates to Arrays Using List
 Given user enters into Arrays Using List
When user clicks on Arrays Using List
Then user lands on Arrays Using List

@Positive
Scenario: user is trying to click TryHere button
    Given user clicks on TryHere button
    And user navigated to Tryeditor page to write a Python code
    When user is writing Python code
    And user clicks on Run button
    Then user can see the Output of Python code
   
  @Negative  
  Scenario: user is trying to click on TryEditor for Invalid data

Given user navigates back to click TryHere button
And  user clicks on TryHere button
And user navigated to Tryeditor page to write a Python code
When user is entering Invalid Python code
And user clicks on Run button
Then user is capturing Alert message
  And user navigates back to previous page 
  
  #Basic Operations in Lists
  
  @Positive @Negative
  Scenario: user navigates to Basic Operations in Lists
 Given user enters into Basic Operations in Lists
When user clicks on Basic Operations in Lists
Then user lands on Basic Operations in Lists

@Positive
Scenario: user is trying to click TryHere button
    Given user clicks on TryHere button
    And user navigated to Tryeditor page to write a Python code
    When user is writing Python code
    And user clicks on Run button
    Then user can see the Output of Python code
   
  @Negative  
  Scenario: user is trying to click on TryEditor for Invalid data

Given user navigates back to click TryHere button
And  user clicks on TryHere button
And user navigated to Tryeditor page to write a Python code
When user is entering Invalid Python code
And user clicks on Run button
Then user is capturing Alert message
  And user navigates back to previous page 
  
  #Applications of Array
  
   @Positive @Negative
  Scenario: user navigates to Applications of Array
 Given user enters into Applications of Array
When user clicks on Applications of Array
Then user lands on Applications of Array
@Positive
Scenario: user is trying to click TryHere button
    Given user clicks on TryHere button
    And user navigated to Tryeditor page to write a Python code
    When user is writing Python code
    And user clicks on Run button
    Then user can see the Output of Python code
   
  @Negative  
  Scenario: user is trying to click on TryEditor for Invalid data

Given user navigates back to click TryHere button
And  user clicks on TryHere button
And user navigated to Tryeditor page to write a Python code
When user is entering Invalid Python code
And user clicks on Run button
Then user is capturing Alert message
  And user navigates back to previous page 
  
  

  