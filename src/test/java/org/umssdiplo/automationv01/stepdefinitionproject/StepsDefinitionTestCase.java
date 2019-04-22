package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.pumapage.MainPage;
import org.umssdiplo.automationv01.core.managepage.pumapage.MenuHombre;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionTestCase {
    private MainPage mainPage;
    private MenuHombre menuHombre;
/*
    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        //login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        //login.setCredentials();
    }*/

    @Given("^'adidas' page is loaded$")
    public void httpsUsPumaComPageIsLoaded() {
        mainPage = LoadPage.mainPage();
    }

    @And("^Sobreponer en opcion 'HOMBRE' y presionar en 'FUTBOL'$")
    public void sobreponerEnOpcionHOMBREYPresionarEnFUTBOL() {
        menuHombre = mainPage.hoverOnAndClick();
    }

    @And("^Presionar en opcion 'FUTBOL'$")
    public void presionarEnOpcionFUTBOL() {
        menuHombre.clickOnFutbol();
    }
}
