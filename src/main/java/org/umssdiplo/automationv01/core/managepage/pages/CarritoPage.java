package org.umssdiplo.automationv01.core.managepage.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class CarritoPage extends BasePage {
    @FindBy(xpath = "//h1[contains(text(), 'Tu carrito')]")
    private WebElement container;

    @FindBy(xpath = "//div[@class='product']/a")
    private WebElement tituloLink;

    @FindBy(xpath = "//div[@data-ci-test-id='orderTotalProductsDeliveryValue']")
    private WebElement priceDiv;

    @FindBy(xpath = "//div[@data-ci-test-id='orderTotalCartValue']")
    private WebElement totalDiv;


    public CarritoPage() {
        CommonEvents.waitMenuVisible(container);
    }


    public String getTitle() {
        String title = CommonEvents.getTextContent(tituloLink);
        return title.trim();
    }

    public String getPrice() {
        String price = CommonEvents.getTextContent(priceDiv);
        return price.trim();
    }

    public String getTotal() {
        String total = CommonEvents.getTextContent(totalDiv);
        return total.trim();
    }
}
