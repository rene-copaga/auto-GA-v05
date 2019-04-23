package org.umssdiplo.automationv01.core.managepage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class CarritoDialog extends BasePage {
    @FindBy(xpath = "//div[@role='dialog']")
    private WebElement container;

    @FindBy(xpath = "//div[@role='dialog']//span[contains(text(), 'Cantidad')]")
    private WebElement cantidad;


    public static final String PATH_VER_CARRITO = "//a[.//text()='%s']";


    public CarritoDialog() {
        CommonEvents.waitMenuVisible(container);
    }

    public String getCantidad() {
        String cantidadText = CommonEvents.getTextContent(cantidad).split(":")[1];
        return cantidadText.trim();
    }

    public CarritoPage clickButton(String textButton) {
        By by = By.xpath(String.format(PATH_VER_CARRITO, textButton));
        CommonEvents.clickButton(by);

        return new CarritoPage();
    }
}
