package org.umssdiplo.automationv01.core.managepage.pumapage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class MenuHombre extends BasePage {
    @FindBy(className = "header-sticky-wrapper header-sticky-selfservice-wrapper-main")
    private WebElement menuContainer;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/div/div[3]/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a")
    private WebElement futbolOption;

    public MenuHombre() {
        CommonEvents.waitMenuVisible(menuContainer);
    }

    public void clickOnFutbol() {
        CommonEvents.clickButton(futbolOption);
    }
}
