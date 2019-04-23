Feature: Verify price Adidas item

  Background: : Home page is displayed
    Given 'adidas' page is loaded

  Scenario: Add to cart
    And Hover "HOMBRE" link HEADER in main page
    And Click "Fútbol" link sub menu in menu HOMBRE
    And Get Price "Calzado de Fútbol X 18.3 TF" in 'Futbol' page
    And Click on "Calzado de Fútbol X 18.3 TF" in 'Futbol' page
    And Select ELIGE TU TALLA "MX 9.5" in item page
    And Click 'AÑADIR AL CARRITO' button in item page
    Then Verify CANTIDAD is "1" in carrito dialog
    And Click "VER CARRITO" link in carrito dialog
    Then Verify "CALZADO DE FÚTBOL X 18.3 TF" title is displayed in carrito page
    Then Verify Price should be "$1,329.00" in carrito page
    Then Verify Total should be "$1,428.00" in carrito page
