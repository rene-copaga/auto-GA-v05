package org.umssdiplo.automationv01.core.managepage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ItemPage extends BasePage {
    @FindBy(xpath = "//h1[contains(text(), 'Calzado de Fútbol X 18.3 TF')]")
    private WebElement container;

    @FindBy(xpath = "//button[@title='Elige tu talla']")
    private WebElement selectTalla;

    @FindBy(xpath = "//button[@title='MX 9.5']")
    private WebElement talla;

    @FindBy(xpath = "//button[contains(text(), 'Añadir al carrito')]")
    private WebElement carritoButton;

    public static final String PATH_TALLA = "//button[@title='%s']";


    public ItemPage() {
        CommonEvents.waitMenuVisible(container);
    }

    public void clickSelectTalla() {
        CommonEvents.clickButton(selectTalla);
    }

    public void clickTalla(String talla) {
        By by = By.xpath(String.format(PATH_TALLA, talla));
        CommonEvents.clickButton(by);
    }

    public CarritoDialog clickAniadirAlCarritoButton() {
        CommonEvents.clickButton(carritoButton);

        return new CarritoDialog();
    }
}
