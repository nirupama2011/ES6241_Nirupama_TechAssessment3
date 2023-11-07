Feature: Register in demo webshop application

Background: Given url to launch the demo webshop application

Scenario: Register with the new credentials 
Given User clicking register button to give the credentials
When User clicking radio button to select the gender
And User entering firstname,Lastname,email,password and also confirm password
    | FirstName      | LastName    |            Email              | Password    | Confirm Password |
    | Aroghya        | Ganesh      | aroganesh4@gmail.com          | Aro@1234    |  Aro@1234        |
      
Then User clicks register button

    
    