# Login feature review the behavior in thie feature
Feature: Projects

  Background: Edicion Creacion Eliminacion de Incidentest
    Given 'Project' page is loaded


  Scenario: crear
    And click on 'new project' button in 'Project' page
    And insert "ABC project" project name field in 'Dialog Project' page


  Scenario: editar
    And click on 'new project' button in 'Project' page
    And insert "4/07/19" project name field in 'Dialog Project' page

