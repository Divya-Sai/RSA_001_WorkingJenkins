Feature: Mouse Hover  Example

  Scenario Outline: Mouse Hover Example
    Given I can see "Chrome" browser
    When I enter the RahulShettyAcademy Practise link "https://rahulshettyacademy.com/AutomationPractice/"
    And Verify the title of the page "Practice Page"
    Then I click on Mouse Hover
    And I can click on Top  <MouseAction> button
    And I can close the browser

    Examples: 
      | MouseAction |
      | Top         |
      | Reload      |
