Feature: API - Food

  Scenario: Find an existing category
    Given a category has already been created
    When the category identifier is received
    Then the category details are returned