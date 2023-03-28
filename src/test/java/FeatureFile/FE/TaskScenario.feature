Feature: As tester i want to validate the Search functionality using specific criteria

  @TestScenario
#    Update scenario outline description
  Scenario Outline: Search for user with specific user name and find all his posts and validate the emails mentioned in these posts
    Given AutoHero search URL
#    When User send request to get userId for the test user
#    And Send request to get Posts that's posted by this UserId
#    And Send request to get Comment that's mentioned into these posts
#    Then Validate the emails formats
    Examples:
      | UserName     |
      | Delphine     |
#      | NotExistName |

