Feature: Login

  Scenario: user can successfully login with valid user name and valid passowrd
    Given user launch chrome browser
    And user open url "http://admin-demo.nopcommerce.com/login"
    When user enters email as "admin@yourstore.com" and password as "admin"
    And click on login
    Then page Title should be "Dashboard/nopCommerce administration"
    When user click on log out link
    And close the browser
