package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.CareerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseClass;

import java.util.List;

public class CareerPage_stepDefination extends BaseClass {



    @Given("^User open web browser and navigates to Careers page$")
    public void user_open_web_browser_and_navigates_to_careers_page() throws Throwable {
      openBrowser();
    }

    @When("^User selects Technology and Engineering field and selects a job he wants to  apply$")
    public void user_selects_technology_and_engineering_field_and_selects_a_job_he_wants_to_apply() throws Throwable {
        CareerPage careerPage = new CareerPage(driver);
        careerPage.view_Opening1();
        careerPage.available_openings1();
    }

    @Then("^User selects apply for job$")
    public void user_selects_apply_for_job() throws Throwable {
        CareerPage careerPage = new CareerPage(driver);
        careerPage.apply_For_Job();
    }

    @And("^User fills personal details$")
    public void user_fills_personal_details() throws Throwable {
        CareerPage careerPage = new CareerPage(driver);
        careerPage.fill_PersonalDetails();
    }

    @And("^User fills contact details$")
    public void user_fills_contact_details() throws Throwable {
        CareerPage careerPage = new CareerPage(driver);
        careerPage.fill_ContactDetails();
    }

    @And("^User fills previous experience details$")
    public void user_fills_previous_experience_details() throws Throwable {
        CareerPage careerPage = new CareerPage(driver);
        careerPage.previous_Exp();
    }

    @And("^User upload resume and submit$")
    public void user_upload_resume_and_submit() throws Throwable {
        CareerPage careerPage = new CareerPage(driver);
        careerPage.upload_File();
        careerPage.submit_Form();
        careerPage.takeScreenshot("Screenshot");
        careerPage.quit();

    }
    @When("^User selects User Experience Design and selects a job he wants to  apply$")
    public void user_selects_user_experience_design_and_selects_a_job_he_wants_to_apply() throws Throwable {
        CareerPage careerPage = new CareerPage(driver);
        careerPage.view_Opening2();
        careerPage.available_openings2();
    }
    @When("^User selects Apply for the position not listed$")
    public void user_selects_apply_for_the_position_not_listed() throws Throwable {
        CareerPage careerPage = new CareerPage(driver);
        careerPage.view_Opening3();
    }

}
