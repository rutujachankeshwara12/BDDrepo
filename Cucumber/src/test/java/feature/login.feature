Feature: Login in application
@sanity
  Scenario Outline: Login with valid and invalid creaditionals
    Given Open the browser
    And Navigate to "https://beta.synkdup.com/user/login/jobseeker"
    When Login with Email as "<emailid>" and Password as "<password>"
    Then Click on login button

    Examples: 
      | emailid                          | password     |
      | rutujachankeshwara12@gmail.com   |    123456879 |
      | rutujachankeshwara1              |       123456 |
      | rutujachankeshwaraas12@gmail.com | 123452323KJl |
      | rutujachankeshwara12@gmail.com   |       123456 |
