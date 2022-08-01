Feature: validate amazon application using parameterization

  Background: prerequisite to launch application
    Given the browser is invoked
    Then the url for amazon is entered

  #MultipleInputTesting : step in a scenario will be iterated with several inputs
  @ParameterizeStep
  Scenario: Validate the amazon application for new user registration
    Given The user is on amazon home page
    When the user does mouseover on Account and list element
    Then click the start here hyperlink
    Then the user should be navigated to new user registration page
    Then type name in your name text field
      | Kim Smith  |
      | King Blake |
      | Roger      |
    And the browser should be closed

  #MultipleInputTesting : Whole scenarion will be iterated with several inputs
  @ParameterizeScenario
  Scenario Outline: Search items in amazon website
    Given The user is on amazon home page
    Then select "<Category>" from all categories list
    Then type "<ItemName>" into the search text field
    When the maginifier button is clicked
    Then the items related to search team should be loaded
    And the browser should be closed

    Examples: 
      | Category    | ItemName         |
      | Books       | Da vinci code    |
      | Electronics | Mobile phones    |
      | Appliances  | Washing machines |
