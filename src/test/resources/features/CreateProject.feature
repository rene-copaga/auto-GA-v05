# Login feature review the behavior in thie feature
Feature: Projects

  Background: Edicion Creacion Eliminacion de Incidentest
    Given 'Project' page is loaded


  Scenario: Create Project
    And click on 'new project' button in 'Project' page
    And insert "ABC project" project name field in 'Dialog Project' page
    And insert "Description project" project description field in 'Dialog Project' page
    And click on 'save' button in 'Dialog Project' page


  Scenario: Edit Project
    And click on 'edit project' button in 'Project' page
    And edit "ABCD project updated" project name field in 'Dialog Project' page
    And click on 'edit' button in 'Dialog Project' page


  Scenario: Delete Project
    And click on 'delete project' button in 'Project' page

