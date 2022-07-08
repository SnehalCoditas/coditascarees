Feature: Apply for various job
#1
  Scenario: Consider a user who applies for Technology and Engineering related job
    Given User open web browser and navigates to Careers page
    When User selects Technology and Engineering field and selects a job he wants to  apply
    Then User selects apply for job
    And User fills personal details
    And User fills contact details
    And User fills previous experience details
    And User upload resume and submit

#2
  Scenario: Consider a user who applies for User Experience Design related job
    Given User open web browser and navigates to Careers page
    When User selects User Experience Design and selects a job he wants to  apply
    Then User selects apply for job
    And User fills personal details
    And User fills contact details
    And User fills previous experience details
    And User upload resume and submit

#3
  Scenario: Consider a user who applies for position not listed
    Given User open web browser and navigates to Careers page
    When User selects Apply for the position not listed
    And User fills personal details
    And User fills contact details
    And User fills previous experience details
    And User upload resume and submit
