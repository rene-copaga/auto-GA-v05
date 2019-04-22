Feature: TestCasePuma

  Background: : Home page is displayed
    Given 'adidas' page is loaded

  Scenario: Add to cart
    And Sobreponer en opcion 'HOMBRE' y presionar en 'FUTBOL'
    And Presionar en opcion 'FUTBOL'


  #Scenario: POSTMAN- GET using java-cucumber-restassure

   # Given GET "/headers" postman endpoint is configured
   # Then the status code should be 200
