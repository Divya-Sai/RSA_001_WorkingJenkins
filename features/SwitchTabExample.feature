Feature: Switch Tab Example

  Scenario: Switch Tab Example
    Given I can see "Chrome" browser
    When I enter the RahulShettyAcademy Practise link "https://rahulshettyacademy.com/AutomationPractice/"
    And Verify the title of the page "Practice Page"
    Then I can click on Switch Tab
    And I can navigate to new tab
    Then Verify the title of the page "Rahul Shetty Academy"
    And I can close the browser
