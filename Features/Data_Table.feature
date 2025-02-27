Feature: Data Table Feature
  I want to use this template to test Data Table

  Scenario: Data Table Test
    Given open browser
    When I enter list of animals
      | cow   |
      | horse |
      | sheep |
    And I enter map of all pesonal datas
      | name    | jackson   |
      | age     |        46 |
      | city    | new port  |
      | country | Australia |
    And I enter list of map book datas
      | book_title     | author      |
      | the White City | Erik Larson |
      | the Lion       | C.S. Lewis  |
      | the Garden     | Erik Larson |
    And I enter list of list datas
      | the White City | Erik Larson |
      | the Lion       | C.S. Lewis  |
      | the Garden     | Erik Larson |
