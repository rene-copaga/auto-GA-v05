package org.umssdiplo.automationv01.core.managepage.pages;

import org.openqa.selenium.By;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class MainPage extends BasePage {

    public static final String PATH_MENU = "//a[contains(text(), '%s')]";

    public MenuHombre hoverOn(String menuName) {
        By hombreMenu = By.xpath(String.format(PATH_MENU, menuName));
        CommonEvents.hoverOn(hombreMenu);

        return new MenuHombre();
    }
}
