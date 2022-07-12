

  Feature: Login with parameters

    Scenario: Login as librarian
      Given  I am on the login page
      When I enter username "librarian11@library"
      And I enter password "I61FFPPf"
      And click the sign in button
      Then dashboard should be displayed


      Scenario: Login as student
        Given I am on the login page
        When I enter username "student1@library"
        And I enter password "d5fv9BtX"
        And click the sign in button
        Then dashboard should be displayed

        Scenario: Login as librarian same line
          Given I am on the login page
          When user login using "librarian26@library" and "g2X4lxZz"
          Then dashboard should be displayed
          And there should be "144" users
