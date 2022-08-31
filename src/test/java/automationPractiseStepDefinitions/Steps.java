package automationPractiseStepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automationPraticesPages.AutomationPractisePage;
import automationPraticesPages.basePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class Steps {

	basePage basePg;
	WebDriver driver;
	AutomationPractisePage app;
	Logger logger; // //for logging

	@Before
	public void setup(){
		//for logging
		logger= LogManager.getLogger(this.getClass());
	}


	@Given("I can see {string} browser")
	public void i_can_see_browser(String browsername) {
		basePg = new basePage();
		basePg.setBrowser(browsername);
		driver = new ChromeDriver();
	}

	@When("I enter the RahulShettyAcademy Practise link {string}")
	public void i_enter_the_rahul_shetty_academy_practise_link(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		logger.info("logged into url");
	}

	@When("Verify the title of the page {string}")
	public void verify_the_title_of_the_page(String title) {

		if(driver.getTitle().equals(title)) {
			org.junit.Assert.assertTrue(true);
			logger.info("Successfull verified the title of the page");
		}
		else {
			org.junit.Assert.assertTrue(false);
			logger.info("Failed to verify the title of the page");
		}
	}

	@Then("I can click on Check Box option1 Example")
	public void i_can_click_on_check_box_option1_example() {
		app = new AutomationPractisePage(driver);
		app.isCheckedOption1();
	}

	@Then("I can click on Check Box option2 Example")
	public void i_can_click_on_check_box_option2_example() {
		app = new AutomationPractisePage(driver);
		app.isCheckedOption2();
	}

	@Then("I can click on Check Box option3 Example")
	public void i_can_click_on_check_box_option3_example() throws InterruptedException {
		app = new AutomationPractisePage(driver);
		Thread.sleep(5000);
		app.isCheckedOption3();
	}

	@Then("I can close the browser")
	public void i_can_close_the_browser() {
		driver.quit();
		logger.info("Successfully closed the browser");
	}

	@Then("I can select options Option1 from drop down example")
	public void i_can_select_options_option1_from_drop_down_example() {

	}

	@Then("I can select options Option2 from drop down example")
	public void i_can_select_options_option2_from_drop_down_example() {

	}

	@Then("I can select options Option3 from drop down example")
	public void i_can_select_options_option3_from_drop_down_example() {

	}

	@Then("I click on Mouse Hover")
	public void i_click_on_mouse_hover() {

	}

	@Then("I can click on Top  Top button")
	public void i_can_click_on_top_top_button() {

	}

	@Then("I can click on Top  Reload button")
	public void i_can_click_on_top_reload_button() {

	}
	@Then("I can click on Radio button {int}")
	public void i_can_click_on_radio_button(Integer int1) {

	}
	@Then("I can type a country name {string} and select it")
	public void i_can_type_a_country_name_and_select_it(String string) {

	}
	@Then("I can click on Switch Tab")
	public void i_can_click_on_switch_tab() {

	}

	@Then("I can navigate to new tab")
	public void i_can_navigate_to_new_tab() {

	}

	@Then("I can enter the name in the text box as {string}")
	public void i_can_enter_the_name_in_the_text_box_as(String string) {

	}

	@Then("I can click on Alert button")
	public void i_can_click_on_alert_button() {

	}

	@Then("I can click Ok")
	public void i_can_click_ok() {

	}

	@Then("I can click on Confirm button")
	public void i_can_click_on_confirm_button() {

	}




}
