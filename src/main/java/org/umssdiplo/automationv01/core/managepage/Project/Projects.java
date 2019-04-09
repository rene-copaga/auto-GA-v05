package org.umssdiplo.automationv01.core.managepage.Project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Projects extends BasePage {

    @FindBy(xpath = "/html/body/app-root/app-projects/div/mat-table/mat-header-row/mat-header-cell[5]/button")
    private WebElement newProjectBtn;

    public void openNewProjectDialog() {
        CommonEvents.clickButton(newProjectBtn);
    }

    public void clickRegistrarMaquinariaTab() {
        CommonEvents.clickButton(newProjectBtn);
    }
}
