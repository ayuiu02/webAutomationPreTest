@allLoginFeature
Feature: Feature to test login functionality

  @validCredential
  Scenario: User should succesfully login using valid credential
    Given browser is open
    And User is on BukaLapak landing page
    When User click on Login page navigation
    And User enter valid email in email field
    And User enter valid password in password field
    And User click on Login button
    Then User should be able to see Favorit page navigation
    And User should be able to see Transaksi page navigation
    And User should be able to see Pesan page navigation
    And User should be able to see Notifikasi page navigation
	
	@invalidPassword
  Scenario: User should be able to see an alert message if the combination of email and passwoard are invalid
    Given browser is open
    And User is on BukaLapak landing page
    When User click on Login page navigation
    And User enter valid email in email field
    And User enter invalid password in passsword field
    And User click on Login button
    Then User should be able to see alert message
    And User should still in Login page

  @invalidEmail
  Scenario: User should be able to see an alert message if the combination of email and passwoard are invalid
    Given browser is open
    And User is on BukaLapak landing page
    When User click on Login page navigation
    And User enter invalid email in email field
    And User enter valid password in password field
    And User click on Login button
    Then User should be able to see alert message
    And User should still in Login page

  @emailFieldEmpty
  Scenario: User should be able to see an alert message if email or password is empty
    Given browser is open
    And User is on BukaLapak landing page
    When User click on Login page navigation
    And User does not type any email in email field
    And User filled password field
    And User click on Login button
    Then User should be able to see alert message
    And User should still in Login page
	
	@passwordFieldEmpty
  Scenario: User should be able to see an alert message if email or password is empty
    Given browser is open
    And User is on BukaLapak landing page
    When User click on Login page navigation
    And User filled email field
    And User does not type any password in password field
    And User click on Login button
    Then User should be able to see alert message
    And User should still in Login page

	@allFieldsEmpty
  Scenario: User should be able to see an alert message if email or password is empty
    Given browser is open
    And User is on BukaLapak landing page
    When User click on Login page navigation
    And User does not type any email in email field
    And User does not type any password in password field
    And User click on Login button
    Then User should be able to see alert message that user is not detected
    And User should still in Login page
