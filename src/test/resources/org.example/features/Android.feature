Feature: Android Feature

  @Android
  Scenario: Finding some cheese
    Given [Android] I am on the Google search page
    When [Android] I search for "Cheese!"
    Then [Android] Text in search box changes into "cheese cake"