package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.pages.*;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionTestCase {
    private MainPage mainPage;
    private MenuHombre menuHombre;
    private FutbolPage futbolPage;
    private ItemPage itemPage;
    private CarritoDialog carritoDialog;
    private CarritoPage carritoPage;

    String salePrice;

    @Given("^'adidas' page is loaded$")
    public void httpsUsPumaComPageIsLoaded() {
        mainPage = LoadPage.mainPage();
    }

    @And("^Hover \"([^\"]*)\" link HEADER in main page$")
    public void hoverLinkHEADER(String menuName) throws Throwable {
        menuHombre = mainPage.hoverOn(menuName);
    }

    @And("^Click \"([^\"]*)\" link sub menu in menu HOMBRE$")
    public void clickLinkSubMenu(String subItem) throws Throwable {
        futbolPage = menuHombre.clickOnSubItem(subItem);
    }

    @And("^Get Price \"([^\"]*)\" in 'Futbol' page$")
    public void getPrice(String itemName) throws Throwable {
        salePrice = futbolPage.getSalePrice(itemName);
    }

    @And("^Click on \"([^\"]*)\" in 'Futbol' page$")
    public void clickOn(String itemName) throws Throwable {
        itemPage = futbolPage.clickOnItem(itemName);
    }

    @And("^Select ELIGE TU TALLA \"([^\"]*)\" in item page$")
    public void selectELIGETUTALLA(String talla) throws Throwable {
        itemPage.clickSelectTalla();
        itemPage.clickTalla(talla);
    }

    @And("^Click 'AÑADIR AL CARRITO' button in item page$")
    public void clickANADIRALCARRITOButton() {
        carritoDialog = itemPage.clickAniadirAlCarritoButton();
    }

    @Then("^Verify CANTIDAD is \"([^\"]*)\" in carrito dialog$")
    public void verifyCANTIDADIs(String cantidadExpected) throws Throwable {
        String cantidadActual = carritoDialog.getCantidad();
        Assert.assertEquals(cantidadActual, cantidadExpected);
    }

    @And("^Click \"([^\"]*)\" link in carrito dialog$")
    public void clickLink(String textButton) throws Throwable {
        carritoPage = carritoDialog.clickButton(textButton.toLowerCase());
    }

    @Then("^Verify \"([^\"]*)\" title is displayed in carrito page$")
    public void verifyTitleIsDisplayed(String titleExpected) throws Throwable {
        String titleActual = carritoPage.getTitle();
        Assert.assertEquals(titleActual, titleExpected);
    }

    @Then("^Verify Price should be \"([^\"]*)\" in carrito page$")
    public void verifyPriceShouldBe(String priceExpected) throws Throwable {
        String priceActual = carritoPage.getPrice();
        Assert.assertEquals(priceActual, priceExpected);
        Assert.assertEquals(priceActual, salePrice);
    }

    @Then("^Verify Total should be \"([^\"]*)\" in carrito page$")
    public void verifyTotalShouldBe(String totalExpected) throws Throwable {
        String totalActual = carritoPage.getTotal();
        Assert.assertEquals(totalActual, totalExpected);
    }
}
