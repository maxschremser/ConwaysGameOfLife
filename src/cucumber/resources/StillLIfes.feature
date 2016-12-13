Feature: Still Lifes



  Scenario: 4x4: still life in a block
    Given the following grid
      | . | . | . | . |
      | . | x | x | . |
      | . | x | x | . |
      | . | . | . | . |
    And using a DiagonalRule
    When it evolves the board
    Then the result should be
      | . | . | . | . |
      | . | x | x | . |
      | . | x | x | . |
      | . | . | . | . |




  Scenario: 6x5: still life in a boat
    Given the following grid
      | . | . | . | . | . | . |
      | . | . | x | x | . | . |
      | . | x | . | . | x | . |
      | . | . | x | x | . | . |
      | . | . | . | . | . | . |
    And using a DiagonalRule
    When it evolves the board
    Then the result should be
      | . | . | . | . | . | . |
      | . | . | x | x | . | . |
      | . | x | . | . | x | . |
      | . | . | x | x | . | . |
      | . | . | . | . | . | . |
    When it evolves the board
    Then the result should be
      | . | . | . | . | . | . |
      | . | . | x | x | . | . |
      | . | x | . | . | x | . |
      | . | . | x | x | . | . |
      | . | . | . | . | . | . |






  Scenario: 6x6: still life in a loaf
    Given the following grid
      | . | . | . | . | . | . |
      | . | . | x | x | . | . |
      | . | x | . | . | x | . |
      | . | . | x | . | x | . |
      | . | . | . | x | . | . |
      | . | . | . | . | . | . |
    And using a DiagonalRule
    When it evolves the board
    Then the result should be
      | . | . | . | . | . | . |
      | . | . | x | x | . | . |
      | . | x | . | . | x | . |
      | . | . | x | . | x | . |
      | . | . | . | x | . | . |
      | . | . | . | . | . | . |
    When it evolves the board
    Then the result should be
      | . | . | . | . | . | . |
      | . | . | x | x | . | . |
      | . | x | . | . | x | . |
      | . | . | x | . | x | . |
      | . | . | . | x | . | . |
      | . | . | . | . | . | . |






  Scenario: 5x5: still life in a boat
    Given the following grid
      | . | . | . | . | . |
      | . | x | x | . | . |
      | . | x | . | x | . |
      | . | . | x | . | . |
      | . | . | . | . | . |
    And using a DiagonalRule
    When it evolves the board
    Then the result should be
      | . | . | . | . | . |
      | . | x | x | . | . |
      | . | x | . | x | . |
      | . | . | x | . | . |
      | . | . | . | . | . |
    When it evolves the board
    Then the result should be
      | . | . | . | . | . |
      | . | x | x | . | . |
      | . | x | . | x | . |
      | . | . | x | . | . |
      | . | . | . | . | . |







  Scenario: 5x5: still life in a tub
    Given the following grid
      | . | . | . | . | . |
      | . | . | x | . | . |
      | . | x | . | x | . |
      | . | . | x | . | . |
      | . | . | . | . | . |
    And using a DiagonalRule
    When it evolves the board
    Then the result should be
      | . | . | . | . | . |
      | . | . | x | . | . |
      | . | x | . | x | . |
      | . | . | x | . | . |
      | . | . | . | . | . |
    When it evolves the board
    Then the result should be
      | . | . | . | . | . |
      | . | . | x | . | . |
      | . | x | . | x | . |
      | . | . | x | . | . |
      | . | . | . | . | . |
