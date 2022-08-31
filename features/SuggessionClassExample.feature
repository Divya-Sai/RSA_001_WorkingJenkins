Feature: Suggession Class Example feature

  Scenario: Type to select a country
    Given I can see "Chrome" browser
    When I enter the RahulShettyAcademy Practise link "https://rahulshettyacademy.com/AutomationPractice/"
    And Verify the title of the page "Practice Page"
    Then I can type a country name "China" and select it
    And I can close the browser
