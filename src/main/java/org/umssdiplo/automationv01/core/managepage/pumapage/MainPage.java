package org.umssdiplo.automationv01.core.managepage.pumapage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class MainPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/div/div[3]/div/div[1]/div[1]/a")
    private WebElement hombreMenu;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/div/div[3]/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a")
    private WebElement futbolOption;

    public MenuHombre hoverOnAndClick() {
        CommonEvents.hoverOnAndClick(hombreMenu, futbolOption);
        return new MenuHombre();
    }

    public void clickOnFutbol() {
        CommonEvents.clickButton(futbolOption);
    }
}
