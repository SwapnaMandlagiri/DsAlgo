Feature: Tree Module

@Positive @Negative
Scenario: user navigates to Tree Module
Given user is on Tree Module
When user clicks  getstarted button of Tree Module
Then user launchs Tree page

# Overview of Trees

@Positive @Negative
Scenario: user navigates to Overview of Trees
Given user is on Overview of Trees
When user clicks on Overview of Trees 
Then user launches on Overview of Trees

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
  
  # Terminologies
  
  @Positive @Negative
Scenario: user navigates to Terminologies
Given user is on Terminologies
When user clicks on Terminologies link
Then user launches on Terminologies page
  
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
  
  # Types of Trees
  
    @Positive @Negative
Scenario: user navigates to Types of Trees
Given user is on Types of Trees
When user clicks on Types of Trees link
Then user launches on Types of Trees page
  
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
  
  # Tree Traversals
  
      @Positive @Negative
Scenario: user navigates to Tree Traversals
Given user is on Tree Traversals
When user clicks on Tree Traversals link
Then user launches on Tree Traversals page
  
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
  
  # Traversals-Illustration
  
        @Positive @Negative
Scenario: user navigates to Traversals-Illustration
Given user is on Traversals-Illustration
When user clicks on Traversals-Illustration link
Then user launches on Traversals-Illustration page
  
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
  
  # Binary Trees
  
          @Positive @Negative
Scenario: user navigates to Binary Trees
Given user is on Binary Trees 
When user clicks on Binary Trees link 
Then user launches on Binary Trees page 
  
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
  
  # Types of Binary Trees
  
            @Positive @Negative
Scenario: user navigates to Types of Binary Trees
Given user is on Types of Binary Trees 
When user clicks on Types of Binary Trees link 
Then user launches on Types of Binary Trees page 
  
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
  
  # Implementation in Python
  
              @Positive @Negative
Scenario: user navigates to Implementation in Python
Given user is on Implementation in Python
When user clicks on Implementation in Python link 
Then user launches on Implementation in Python page 
  
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
  
  # Binary Tree Traversals
  
    
              @Positive @Negative
Scenario: user navigates to Binary Tree Traversals
Given user is on Binary Tree Traversals
When user clicks on Binary Tree Traversals
Then user launches on Binary Tree Traversals
  
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
  
  # Implimentation of Binary Trees
  
     
              @Positive @Negative
Scenario: user navigates to Implimentation of Binary Trees
Given user is on Implimentation of Binary Trees
When user clicks on Implimentation of Binary Trees
Then user launches on Implimentation of Binary Trees
  
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
  
  # Applications of Binary trees
  
                @Positive @Negative
Scenario: user navigates to Applications of Binary trees 
Given user is on Applications of Binary trees
When user clicks on Applications of Binary trees link
Then user launches on Applications of Binary trees page
  
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
  
  # Binary Search Trees
  
                 @Positive @Negative
Scenario: user navigates to Binary Search Trees
Given user is on Binary Search Trees
When user clicks on Binary Search Trees link
Then user launches on Binary Search Trees page
  
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
  
  
  # Implementation Of BST
  
    
                 @Positive @Negative
Scenario: user navigates to Implementation Of BST
Given user is on Implementation Of BST
When user clicks on Implementation Of BST link
Then user launches on Implementation Of BST page
  
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
  
 # Practice Questions 
  
    @positive
  Scenario: user is trying to click Practice Questions
    Given user clicks on Practice Questions
    When user navigates to practice Questions
    Then user navigates back to HomePage
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
   
  
  
  
  