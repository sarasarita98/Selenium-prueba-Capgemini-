Feature: edureka

    @test
  Scenario: goes to edureka page
      Given user is logged in
      When user goes to My Profile
      And user changes professional and personal data "1"
      And user goes to blogs and goes back to home page
      Then user log out
