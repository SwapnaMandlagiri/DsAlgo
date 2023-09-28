Feature: Queue Module

@Positive @Negative
Scenario: user navigates to Queue Module
Given user is on Queue Module
When user clicks  getstarted button of Queue Module
Then user launchs Queue page

#Implementation of Queue in Python

@Positive @Negative
Scenario: user navigates to Implementation of Queue in Python
Given user is on Implementation of Queue in Python Page
When user clicks on Implementation of Queue in Python link
Then user launches on Implementation of Queue in Python page

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
  
 # Implementation using collections.deque
 
 @Positive @Negative
Scenario: user navigates to Implementation using collections
Given user is on Implementation using collections Page
When user clicks on Implementation using collections link
Then user launches on Implementation using collections page
  
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
  
  # Implementation using array
  
   @Positive @Negative
Scenario: user navigates to Implementation using array
Given user is on Implementation using array Page
When user clicks on Implementation using array link
Then user launches on Implementation using array page
  
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
  
  #Queue Operations
  
    
   @Positive @Negative
Scenario: user navigates to Queue Operations
Given user is on  Page Queue Operations
When user clicks onlink Queue Operations
Then user launches on  page Queue Operations
  
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
  
  #Practice Questions
    
   @Positive 
    Scenario: user is trying to click Practice Questions
    Given user clicks on Practice Questions
    When user navigates to practice Questions
    Then user navigates back to HomePage
  
  
  
  