Feature: features of gherkin test
  Scenario Outline: client makes call to GET hello
    When the client named '<name>' calls hello
    Then the client receives status code of 200
    And the client with name '<name>' receives server hello message
    Examples:
      | name |
      | Diego |
      | Sofia |
      | Pepe |
  Scenario Outline: client makes call to GET to sum numbers
    When the client call sum with <a> and <b>
    Then the client receives status code of 200
    And check results of sum correspond with expected result <result>
    Examples:
      | a | b | result |
      | 2 | 3 | 5      |
      | 2 | 4 | 6      |
      | 2 | 5 | 7      |