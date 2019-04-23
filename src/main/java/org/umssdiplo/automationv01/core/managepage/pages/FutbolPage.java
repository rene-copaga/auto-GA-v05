package org.umssdiplo.automationv01.core.managepage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class FutbolPage extends BasePage {
    @FindBy(xpath = "//h1[contains(text(), 'Calzado De Fútbol para Hombre')]")
    private WebElement container;

    public static final String PATH_ITEM = "//a[.//text()='%s']";

    public static final String PATH_ITEM_PRICE = "//a[.//text()='%s']//div[contains(@class, 'gl-price')]/span";


    public FutbolPage() {
        CommonEvents.waitMenuVisible(container);
    }

    public String getSalePrice(String item) {
        By by = By.xpath(String.format(PATH_ITEM_PRICE, item));
        String price = CommonEvents.getTextContent(by);
        return String.format("%s.00", price.trim());
    }

    public ItemPage clickOnItem(String item) {
        By by = By.xpath(String.format(PATH_ITEM, item));
        CommonEvents.clickButton(by);

        return new ItemPage();
    }
}
