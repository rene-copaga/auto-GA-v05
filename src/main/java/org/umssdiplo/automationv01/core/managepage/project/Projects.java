package org.umssdiplo.automationv01.core.managepage.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.dialogo.ProjectDialog;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Projects extends BasePage {

    public static final String PATH_EDIT_BUTTON_BY_PROJECT_NAME = "//mat-table/mat-row[mat-cell[contains(text(), '%s')]]/mat-cell/button[1]";
    public static final String PATH_DELETE_BUTTON_BY_PROJECT_NAME = "//mat-table/mat-row[mat-cell[contains(text(), '%s')]]/mat-cell/button[2]";
    public static final String PATH_LAST_PROJECT_NAME = "//mat-table/mat-row[last()]/mat-cell[2]";

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

    public ProjectDialog clickPlusIcon() {
        CommonEvents.clickButton(newProjectBtn);
        return new ProjectDialog();
    }

    public ProjectDialog clickEditIcon(String projectName) {
        By by = By.xpath(String.format(PATH_EDIT_BUTTON_BY_PROJECT_NAME, projectName));
        CommonEvents.clickElement(by);
        return new ProjectDialog();
    }

    public void clickDeleteIcon(String projectName) {
        By by = By.xpath(String.format(PATH_DELETE_BUTTON_BY_PROJECT_NAME, projectName));
        CommonEvents.clickElement(by);
    }

    public String getLastProject() {
        this.webDriver.get(PropertyAccessor.getInstance().getBaseUrl());
        By by = By.xpath(PATH_LAST_PROJECT_NAME);
        WebElement projectNameCell = this.webDriver.findElement(by);
        String projectName = "";

        if(projectNameCell != null) {
            projectName = CommonEvents.getTextContent(projectNameCell);
        }

        return projectName.trim();
    }
}
