Feature: Oscillators




  Scenario: 5x5: blinker
    Given the following grid
      | . | . | . | . | . |
      | . | . | x | . | . |
      | . | . | x | . | . |
      | . | . | x | . | . |
      | . | . | . | . | . |
    And using a DiagonalRule
    When it evolves the board
    Then the result should be
      | . | . | . | . | . |
      | . | . | . | . | . |
      | . | x | x | x | . |
      | . | . | . | . | . |
      | . | . | . | . | . |
    When it evolves the board
    Then the result should be
      | . | . | . | . | . |
      | . | . | x | . | . |
      | . | . | x | . | . |
      | . | . | x | . | . |
      | . | . | . | . | . |







  Scenario: 6x6: toad
    Given the following grid
      | . | . | . | . | . | . |
      | . | . | . | x | . | . |
      | . | x | . | . | x | . |
      | . | x | . | . | x | . |
      | . | . | x | . | . | . |
      | . | . | . | . | . | . |
    And using a DiagonalRule
    When it evolves the board
    Then the result should be
      | . | . | . | . | . | . |
      | . | . | . | . | . | . |
      | . | . | x | x | x | . |
      | . | x | x | x | . | . |
      | . | . | . | . | . | . |
      | . | . | . | . | . | . |
    When it evolves the board
    Then the result should be
      | . | . | . | . | . | . |
      | . | . | . | x | . | . |
      | . | x | . | . | x | . |
      | . | x | . | . | x | . |
      | . | . | x | . | . | . |
      | . | . | . | . | . | . |







  Scenario: 6x6: beacon
    Given the following grid
      | . | . | . | . | . | . |
      | . | x | x | . | . | . |
      | . | x | . | . | . | . |
      | . | . | . | . | x | . |
      | . | . | . | x | x | . |
      | . | . | . | . | . | . |
    And using a DiagonalRule
    When it evolves the board
    Then the result should be
      | . | . | . | . | . | . |
      | . | x | x | . | . | . |
      | . | x | x | . | . | . |
      | . | . | . | x | x | . |
      | . | . | . | x | x | . |
      | . | . | . | . | . | . |
    When it evolves the board
    Then the result should be
      | . | . | . | . | . | . |
      | . | x | x | . | . | . |
      | . | x | . | . | . | . |
      | . | . | . | . | x | . |
      | . | . | . | x | x | . |
      | . | . | . | . | . | . |
