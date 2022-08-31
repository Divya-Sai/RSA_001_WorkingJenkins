Feature: Switch TO Alert Example

  Scenario: Switch TO Alert 1 Example
    Given I can see "Chrome" browser
    When I enter the RahulShettyAcademy Practise link "https://rahulshettyacademy.com/AutomationPractice/"
    And Verify the title of the page "Practice Page"
    Then I can enter the name in the text box as "Divya"
    And I can click on Alert button
    Then I can click Ok
    And I can close the browser

  Scenario: Switch TO Alert 2 Example
    Given I can see "Chrome" browser
    When I enter the RahulShettyAcademy Practise link "https://rahulshettyacademy.com/AutomationPractice/"
    And Verify the title of the page "Practice Page"
    Then I can enter the name in the text box as "Divya"
    And I can click on Confirm button
    Then I can click Ok
    And I can close the browser
