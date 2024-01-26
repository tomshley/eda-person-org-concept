Feature: Legacy Person UUID to a Profile Entity

  Scenario: A user requests their profile data with an existing person UUID
    Given a user with a global login Tom
    When user requests their profile data
    And a legacy person entity UUID is matched
    Then the user name from legacy person entity will be in the data

  Scenario: A user requests their profile data with an organization membership
  Scenario: A user requests their profile data without a organization membership
  Scenario: A user consents to organization membership
  Scenario: A user removes consent to organization membership
  Scenario: A user visits their profile without an existing person UUID
