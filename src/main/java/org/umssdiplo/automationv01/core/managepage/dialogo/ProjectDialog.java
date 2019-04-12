package org.umssdiplo.automationv01.core.managepage.dialogo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ProjectDialog extends BasePage {
    @FindBy(xpath = "//mat-dialog-container")
    private WebElement containerDialog;

    @FindBy(xpath = "//input")
    private WebElement projectNameField;

    @FindBy(xpath = "//textarea")
    private WebElement descriptionField;

    @FindBy(xpath = "//mat-dialog-container/app-project/div/form/div/button[1]")
    private WebElement saveBtn;

    @FindBy(xpath = "//mat-dialog-container/app-project/div/form/div/button[2]")
    private WebElement cancelBtn;

    public ProjectDialog() {
        CommonEvents.waitWebElementVisible(containerDialog);
    }

    public void insertProjectName(String nameProject){
        CommonEvents.setInputField(projectNameField, nameProject);
    }

    public void insertProjectDescription(String descriptionProject) {
        CommonEvents.setInputField(descriptionField, descriptionProject);
    }

    public void clickSave() {
        CommonEvents.clickButton(saveBtn);
    }
}
