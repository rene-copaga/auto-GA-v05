package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.dialogo.ProjectDialog;
import org.umssdiplo.automationv01.core.managepage.project.Projects;
import org.umssdiplo.automationv01.core.utils.LoadProjectsPage;

public class StepsDefinitionPHPtravel {
    private Projects projects;
    private ProjectDialog registerDialog;
    private ProjectDialog editDialog;


    @Given("^'Projects' page is loaded$")
    public void projectsPageIsLoaded() throws Throwable {
        projects = LoadProjectsPage.projectPage();
    }

    @And("^click on 'plus' button in 'Projects' page$")
    public void clickOnPlusButtonInProjectsPage() {
        registerDialog = projects.clickPlusIcon();
    }

    @And("^insert \"([^\"]*)\" project name field in 'Dialog Project' page$")
    public void insertProjectNameFieldInDialogProjectPage(String nameProject) throws Throwable {
        registerDialog.insertProjectName(nameProject);
    }

    @And("^insert \"([^\"]*)\" project description field in 'Dialog Project' page$")
    public void insertProjectDescriptionFieldInDialogProjectPage(String descriptionProject) throws Throwable {
        registerDialog.insertProjectDescription(descriptionProject);
    }

    @And("^click on 'save' button in 'Dialog Project' page$")
    public void clickOnSaveButtonInDialogProjectPage() {
        registerDialog.clickSave();
    }

    @And("^edit \"([^\"]*)\" project name field in 'Edit Dialog Project' page$")
    public void editProjectNameFieldInDialogProjectPage(String projectName) throws Throwable {
        editDialog.insertProjectName(projectName);
    }

    @And("^edit \"([^\"]*)\" project description field in 'Dialog Project' page$")
    public void editProjectDescriptionFieldInDialogProjectPage(String projectDescription) throws Throwable {
        editDialog.insertProjectDescription(projectDescription);
    }

    @And("^click on 'save' button in 'Edit Dialog Project' page$")
    public void clickOnEditButtonInDialogProjectPage() {
        editDialog.clickSave();
    }

    @And("^click edit project \"([^\"]*)\" in 'Projects' page$")
    public void clickEditProjectInProjectsPage(String projectName) throws Throwable {
        editDialog = projects.clickEditIcon(projectName);
    }

    @And("^delete project \"([^\"]*)\" in 'Projects' page$")
    public void deleteProjectInProjectsPage(String projectName) throws Throwable {
        projects.clickDeleteIcon(projectName);
    }

    @Then("^verify \"([^\"]*)\" project is displayed in 'Project' page$")
    public void verifyProjectIsDisplayedInProjectPage(String expectedProjectName) throws Throwable {
        String actualProjectName = projects.getLastProject();
        Assert.assertEquals(actualProjectName, expectedProjectName);
    }
}
