Feature: User can apply to job

  Scenario Outline: Apply to job through apply form.
    Given Open the browser
    And Navigate to "https://beta.amazjobs.com/job/384305215-58108"
    When Apply with Name as "<name>" and Email as "<email>" and PhoneNo as "<phone>"
    Then Click on apply button

    Examples: 
      | name    | email                            | phone       |
      | Rutuja  | rutujachankeshwara12@gmail.com   |  1234568790 |
      | rutu    | rutujachankeshwara1              |  1234567890 |
      | 23jkjkj | rutujachankeshwaraas12@gmail.com |  1234523230 |
      | rutu    | rutujachankeshwara12@gmail.com   |      123456 |
      | !@kjds  | r@gmail.com                      | 838njkj9090 |
