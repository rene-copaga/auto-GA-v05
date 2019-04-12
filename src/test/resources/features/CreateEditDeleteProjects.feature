Feature: Test Create, Edit and Delete Projects

  Background: Projects page is loaded
    Given 'Projects' page is loaded


  Scenario Outline: Create Project
    And click on 'plus' button in 'Projects' page
    And insert "<ProjectName>" project name field in 'Dialog Project' page
    And insert "<ProjectDescription>" project description field in 'Dialog Project' page
    And click on 'save' button in 'Dialog Project' page
    Then verify "<ProjectNameCreated>" project is displayed in 'Project' page
    Examples:
      | ProjectName | ProjectDescription | ProjectNameCreated |
      | project1    | description1       | project1           |


  Scenario Outline: Edit Project
    And click on 'plus' button in 'Projects' page
    And insert "<ProjectName>" project name field in 'Dialog Project' page
    And insert "<ProjectDescription>" project description field in 'Dialog Project' page
    And click on 'save' button in 'Dialog Project' page
    And click edit project "<ProjectName>" in 'Projects' page
    And edit "<ProjectNameUpdated>" project name field in 'Edit Dialog Project' page
    And click on 'save' button in 'Edit Dialog Project' page
    Then verify "<ProjectNameUpdated>" project is displayed in 'Project' page
    Examples:
      | ProjectName | ProjectDescription | ProjectNameUpdated |
      | project2    | description2       | project2updated    |


  Scenario Outline: Delete Project
    And click on 'plus' button in 'Projects' page
    And insert "<ProjectName>" project name field in 'Dialog Project' page
    And insert "<ProjectDescription>" project description field in 'Dialog Project' page
    And click on 'save' button in 'Dialog Project' page
    And delete project "<ProjectName>" in 'Projects' page
    Examples:
      | ProjectName | ProjectDescription |
      | project3    | description3       |
