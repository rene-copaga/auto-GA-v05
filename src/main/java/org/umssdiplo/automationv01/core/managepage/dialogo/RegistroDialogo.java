package org.umssdiplo.automationv01.core.managepage.dialogo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class RegistroDialogo extends BasePage {
    @FindBy(xpath = "//mat-dialog-container")
    private WebElement containerDialog;

    @FindBy(name = "name")
    private WebElement projectNameField;

    @FindBy(name = "description")
    private WebElement descriptionField;

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-project/div/form/div[3]/button[1]")
    private WebElement saveBtn;

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-project/div/form/div[3]/button[2]")
    private WebElement cancelBtn;

    public RegistroDialogo() {
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
