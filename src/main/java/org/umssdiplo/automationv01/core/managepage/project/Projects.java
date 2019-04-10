package org.umssdiplo.automationv01.core.managepage.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.dialogo.RegistroDialogo;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Projects extends BasePage {

    @FindBy(xpath = "/html/body/app-root/app-projects/div/mat-table/mat-header-row/mat-header-cell[5]/button")
    private WebElement newProjectBtn;

    @FindBy(xpath = "/html/body/app-root/app-projects/div/mat-table/mat-row[2]/mat-cell[5]/button[1]")
    private WebElement editProjectBtn;

    @FindBy(xpath = "/html/body/app-root/app-projects/div/mat-table/mat-row[2]/mat-cell[5]/button[2]")
    private WebElement deleteProjectBtn;

    @FindBy(xpath = "//mat-dialog-container")
    private WebElement containerMat;

    @FindBy(name = "name")
    private WebElement projectNameInput;

    public RegistroDialogo clickPlusIcon() {
        CommonEvents.clickButton(newProjectBtn);
        return new RegistroDialogo();
    }

    public RegistroDialogo clickEditIcon() {
        CommonEvents.clickButton(editProjectBtn);
        return new RegistroDialogo();
    }

    public void clickDeleteIcon() {
        CommonEvents.clickButton(deleteProjectBtn);
    }
}
