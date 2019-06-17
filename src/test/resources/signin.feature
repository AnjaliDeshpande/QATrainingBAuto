Feature: Registraion


  Background:
    Given I go to URL as "https://www.d3dsecurity.co.uk"
    When I click Register button


  @first
  Scenario: Submit with all valid fields
    Given Enter firstname as "testFirstname"
    Given Enter lastname as "testlastname"
    Given Enter emailid as "testFirstname@hotmail.com"
    Given Enter password as "password123"
    Given Enter confirm passwird as "password123"
    When Click Register button
    Then I should see My Account button
    Then I should see Logout button
    Then I should see firstname as a header
#  Then I should nmot see sign in button

#  @automation
#  Scenario: automation practice
#    Given I go to URL as "http//automationpractice.com/index.php"
#    When I click Contact Us button
#    Given I select "Customer Service" from the subject header drop down
#    And I enter valid email id as "test @hotmail.com"
#    And I enter order reference as "Order123"
##     And I attach "Test123.pdf"file
#    And I enter message as "Please help me with my query"
#    When I click Send button
#    Then I should see message"Your message has been successfully sent to our team"
#
#  @smoke @signin @regression
#  Scenario: automation practice
#    Given I go to URL as "http//automation practice.com/index.php"
##        When I click Contact Us button
##        Given I select "Webmaster"from the subject heading drop down
##        And I enter valid email id as "test@hotmail.com"
##        And I enter ordere reference as "Order123"
##        And I attach "Test123.pdf"file
##        And I enter message as "Please help me with this query"
##        When I click Send button
##        Then I should see something
##
