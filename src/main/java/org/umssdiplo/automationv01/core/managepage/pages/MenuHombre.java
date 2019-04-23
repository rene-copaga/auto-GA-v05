package org.umssdiplo.automationv01.core.managepage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class MenuHombre extends BasePage {
    @FindBy(xpath = "//div[contains(@class, 'header-sticky-wrapper header-sticky-selfservice-wrapper-main open')]")
    private WebElement menuContainer;

    public static final String PATH_SUBITEM = "//a[.//text()='%s']";

    public MenuHombre() {
        CommonEvents.waitMenuVisible(menuContainer);
    }

    public FutbolPage clickOnSubItem(String subItem) {
        By by = By.xpath(String.format(PATH_SUBITEM, subItem));
        CommonEvents.clickButton(by);

        return new FutbolPage();
    }
}
