package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.project.Projects;
import org.umssdiplo.automationv01.core.managepage.dialogo.RegistroDialogo;
import org.umssdiplo.automationv01.core.utils.LoadPage;
import org.umssdiplo.automationv01.core.utils.LoadProjectsPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Projects projects;
    private RegistroDialogo registroDialogo;
    private RegistroDialogo editDialog;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @Given("^'Project' page is loaded$")
    public void ssiPageIsLoaded() throws Throwable {
        projects = LoadProjectsPage.projectPage();
    }

    @And("^click on 'new project' button in 'Project' page$")
    public void clickOnNewProjectButtonInProjectPage() {
        registroDialogo = projects.clickPlusIcon();
    }

    @And("^insert \"([^\"]*)\" project name field in 'Dialog Project' page$")
    public void insertProjectNameFieldInDialogProjectPage(String nameProject) throws Throwable {
        registroDialogo.insertProjectName(nameProject);
    }

    @And("^insert \"([^\"]*)\" project description field in 'Dialog Project' page$")
    public void insertProjectDescriptionFieldInDialogProjectPage(String descriptionProject) throws Throwable {
        registroDialogo.insertProjectDescription(descriptionProject);
    }

    @And("^click on 'save' button in 'Dialog Project' page$")
    public void clickOnSaveButtonInDialogProjectPage() {
        registroDialogo.clickSave();
    }

    @And("^click on 'edit project' button in 'Project' page$")
    public void clickOnEditProjectButtonInProjectPage() {
        editDialog = projects.clickEditIcon();
    }

    @And("^edit \"([^\"]*)\" project name field in 'Dialog Project' page$")
    public void editProjectNameFieldInDialogProjectPage(String projectName) throws Throwable {
        editDialog.insertProjectName(projectName);
    }

    @And("^edit \"([^\"]*)\" project description field in 'Dialog Project' page$")
    public void editProjectDescriptionFieldInDialogProjectPage(String projectDescription) throws Throwable {
        editDialog.insertProjectDescription(projectDescription);
    }

    @And("^click on 'edit' button in 'Dialog Project' page$")
    public void clickOnEditButtonInDialogProjectPage() {
        editDialog.clickSave();
    }

    @And("^click on 'delete project' button in 'Project' page$")
    public void clickOnDeleteProjectButtonInProjectPage() {
        projects.clickDeleteIcon();
    }
}
