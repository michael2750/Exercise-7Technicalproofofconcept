Feature: Are theese days weekdays?
  Everybody wants to know if they should go to work

  Scenario: Sunday and Saturday are'nt a weekday
    Given today is either Sunday or Saturday
    When I ask whether it is a weekday
    Then I should be told "Nope"

  Scenario: Monday and Saturday
    Given today is either Monday or Saturday
    When I ask wether it's a weekday
    Then I should bee told "Yep"