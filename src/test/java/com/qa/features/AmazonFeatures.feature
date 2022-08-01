Feature: Validate amazon website of its functionality and UI

  Background: prerequisite to launch application
    Given the browser is invoked
    Then the url for amazon is entered

@End2EndTest
  Scenario: Search an item in amazon website
    Given The user is on amazon home page
    Then select books as category
    Then type da vinci code in search text field
    When the maginifier button is clicked
    Then the items related to search team should be loaded
    And the browser should be closed
    
@UITest
  Scenario: validate the hyperlinks in the footer section of amazon home page
    Given The user is on amazon home page
    Then fetch all the footer link to check
    Then validate total no of hyperlinks present
    And the browser should be closed
    
@UITest
  Scenario: Validate the amazon application for new user registration
    Given The user is on amazon home page
    When the user does mouseover on Account and list element
    Then click the start here hyperlink
    Then the user should be navigated to new user registration page
    Then type kim smith in your name text field
    And the browser should be closed