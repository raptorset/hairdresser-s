#Author: <jmtousm>
Feature: search cruises to The Bahamas
  
  
  In order To buy cheap cruise tickets to the Bahamas
  As a tourist who saves money
  I want to see the results of my search with the cheapest rate.

  @tag1
  Scenario: checking all results
    When the tourist performs the search with a duration
    Then he would visualize the results with a grid style

  @tag2
  Scenario: checking all results date
    When the tourist performs the search with a duration 6 - 9 Days
    Then he would visualize the results with a grid style
