Feature:



@Sign_outline
  Scenario Outline:
    Given I goto URL as "http://automationpractice.com/index.php"
    When I click on sign in button
    Given I enter Email address as "<emailId>"
    Given I enter password as "<password>"
    When Click on sign in button on signin page
    Then I should see error message <"erroreMessage">

    Examples:
    |emailId| password |errorMessage |
    |test1@test.com|password123|Authentication failed.|
    |test2@test.com|password123|Authentication failed.|
    |test3@test.com|password123|Authentication failed.|
    |test4@test.com|password123|Authentication failed.|
    |test5@test.com|password123|Authentication failed.|



