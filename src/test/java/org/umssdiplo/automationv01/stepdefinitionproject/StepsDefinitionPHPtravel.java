package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Project.Projects;
import org.umssdiplo.automationv01.core.managepage.dialogo.RegistroDialogo;
import org.umssdiplo.automationv01.core.utils.LoadPage;
import org.umssdiplo.automationv01.core.utils.LoadProjectsPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Projects projects;
    private RegistroDialogo registroDialogo;

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
}
