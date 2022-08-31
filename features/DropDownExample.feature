Feature: Drop Down Example feature

  Scenario Outline: Selecting the DropDowns
    Given I can see "Chrome" browser
    When I enter the RahulShettyAcademy Practise link "https://rahulshettyacademy.com/AutomationPractice/"
    And Verify the title of the page "Practice Page"
    Then I can select options <options> from drop down example
    And I can close the browser

    Examples: 
      | options |
      | Option1 |
      | Option2 |
      | Option3 |
