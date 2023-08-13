Feature: Students

  Scenario: check age of students
    Given we have a list of students

      | name | age | course |

      | Ivan | 18  | 2      |

      | Anna | 23  | 5      |

      | Olha | 28  | 3      |
    When sort students by age

    Then check that the youngest student is over 18