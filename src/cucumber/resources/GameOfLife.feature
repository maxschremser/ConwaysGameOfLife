Feature: Conway's Game Of Life


  Scenario: 3x3: board is dead
    Given the following grid
      | . | . | . |
      | . | . | . |
      | . | . | . |
    When it evolves the board
    Then the result should be
      | . | . | . |
      | . | . | . |
      | . | . | . |





  Scenario: 3x3: board all alive
    Given the following grid
      | x | x | x |
      | x | x | x |
      | x | x | x |
    When it evolves the board
    Then the result should be
      | x | x | x |
      | x | . | x |
      | x | x | x |





  Scenario: 3x3: with 2 neighbours
    Given the following grid
      | x | x | x |
      | x | . | x |
      | x | x | x |
    When it evolves the board
    Then the result should be
      | x | x | x |
      | x | . | x |
      | x | x | x |





  Scenario: 3x3: dead cell with 3 living neighbours test 0
    Given the following grid
      | x | x | x |
      | x | x | x |
      | x | . | x |
    When it evolves the board
    Then the result should be
      | x | x | x |
      | x | x | x |
      | . | x | . |





  Scenario: 3x3: dead cell with 3 living neighbours test 1
    Given the following grid
      | . | . | . |
      | x | . | x |
      | . | x | . |
    When it evolves the board
    Then the result should be
      | . | . | . |
      | . | x | . |
      | . | . | . |




