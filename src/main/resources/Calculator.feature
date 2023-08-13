Feature: Calculator

  Scenario Outline: Sum of the two numbers

    Given two numbers <a> and <b>

    When we try to find the multiplication of numbers

    Then result should be <result>

    Examples:

      | a | b | result |

      | 3 | 2 | 6      |

      | 3 | 5 | 15     |