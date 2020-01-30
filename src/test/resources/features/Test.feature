@tag
Feature: Teste cases for app FasTip

Scenario: Calculate tip percentage
   Given Init Fastip App
    When Enter Bill Amount "150000"
     And Click in button Calculate Tip
    Then Validate Tip Amount
     And Validate Total Amount