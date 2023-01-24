package com.stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LoginPage;
import page.objects.PageObjects;

public class stepDefinations extends Utility {

	public stepDefinations(WebDriver driverInstance) {
		super(driverInstance);
	}

	public stepDefinations() {
	}

	//Title Verification	

	@Given("User is on {string} Login Page")
	public void user_is_on_login_page(String string) throws Exception {
		try {
			LoginPage.launchApp("Nop Commerce");
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) throws Exception {
		try{
			String actualTitle=driver.getTitle();
			//System.out.println("Actual Title is:-------------"+actualTitle);
			if(actualTitle.equals(expectedTitle))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}

		}catch (Exception e) {
			throw e;
		}

		//		Assert.assertEquals("Your store. Login", driver.getTitle());
		//		System.out.println(driver.getTitle());
		//		explicitWait(2);
	}


	//Valid Login

	@When("user enters the correct email and password")
	public void user_enters_the_correct_email_and_password() throws Exception {
		try {
			PageObjects.email.clear();
			PageObjects.password.clear();
			LoginPage.submitCorrectDetails();
		} catch (Exception e) {
			throw e;
		}
	}

	@When("clicks on login button")
	public void clicks_on_login_button() throws Exception {
		try {
			LoginPage.clickLogin();
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("Home Page should be displayed.")
	public void home_page_should_be_displayed() throws Exception {
		try {
			LoginPage.isHomepageDisplayed();
		} catch (Exception e) {
			throw e;
		}
	}


	//Invalid Login

	@When("user enters the incorrect email and password")
	public void user_enters_the_incorrect_email_and_password() throws Exception {
		try {
			PageObjects.email.clear();
			PageObjects.password.clear();
			LoginPage.submitIncorrectDetails();
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("error message should be displayed.")
	public void error_message_should_be_displayed() throws Exception{
		try {
			LoginPage.checkErrorMessage();
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	
	//Add new customer
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() throws Exception {
		try {
			LoginPage.launchApp("Nop Commerce");
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() throws Exception {
		try {
			LoginPage.showHomePage();
		} catch (Exception e) {
			throw e;
		}
	}

	@When("User click on customers Menu")
	public void user_click_on_customers_menu() throws Exception {
		try {
			LoginPage.clickOnCustomersMenu();
		} catch (Exception e) {
			throw e;
		}
	}

	@When("click on customers Menu Item")
	public void click_on_customers_menu_item() throws Exception {
		try {
			LoginPage.clickOnCustomersMenuItem();
		} catch (Exception e) {
			throw e;
		}
	}

	@When("click on Add new button")
	public void click_on_add_new_button() throws Exception {
		try {
			LoginPage.clickOnAddnew();
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() throws Exception {
		try {
			Assert.assertEquals("Add a new customer / nopCommerce administration", driver.getTitle());
		} catch (Exception e) {
			throw e;
		}
	}

	@When("User enter customer info")
	public void user_enter_customer_info() {
		try {
			LoginPage.enterEmail("user1@gmail.com");
			LoginPage.enterPassword("user");
			LoginPage.enterFirstName("Sachin");
			LoginPage.enterLastName("Patil");
			LoginPage.enterGender("Male");
			LoginPage.enterDob("6/13/1988");
			LoginPage.enterCompanyName("XYZ");
			LoginPage.enterAdminComment("Admin comment");
			LoginPage.enterManagerOfVendor("Vendor 1");
		}catch (Exception e) {
			throw e;
		}
	}

	@When("click on Save button")
	public void click_on_save_button() throws Exception {
		try {
			LoginPage.clickOnSave();;
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("User can view confirmation message")
	public void user_can_view_confirmation_message() throws Exception {
		try{
			String bodyTagText = driver.findElement(By.tagName("Body")).getText();
			Assert.assertTrue(bodyTagText.contains("The new customer has been added successfully."));
		}catch (Exception e) {
			throw e;
		}
	}


	//search customer by Email
	
	@When("Enter customer EMail")
	public void enter_customer_e_mail() throws Exception {
		try {
			LoginPage.enterEmailAdd("admin@yourStore.com");
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("Click on search button")
	public void click_on_search_button() throws Exception {
		try {
			LoginPage.clickOnSearchButton();
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	//search customer by name
	
	@When("Enter customer FirstName")
	public void enter_customer_first_name() throws Exception {
		try {
			LoginPage.enter_FirstName("Victoria");
		} catch (Exception e) {
			throw e;
		}
	}

	@When("Enter customer LastName")
	public void enter_customer_last_name() throws Exception {
		try {
			LoginPage.enter_LastName("Terces");
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	//Accessing online customers
	
	@When("click on online customers Menu Item")
	public void click_on_online_customers_menu_item() throws Exception {
		try {
			LoginPage.clickOnOnlineCustomersMenuItem();
		} catch (Exception e) {
			throw e;
		}
	}
	
	//Accessing activity logs
	
	@When("click on activity types Menu Item")
	public void click_on_activity_types_menu_item() throws Exception {
		try {
			LoginPage.clickOnActivityTypesMenuItem();
		} catch (Exception e) {
			throw e;
		}
	}
	
	//Accessing available stores
	
	@When("User click on configuration Menu")
	public void user_click_on_configuration_menu() throws Exception {
		try {
			LoginPage.clickOnConfigurationMenu();
		} catch (Exception e) {
			throw e;
		}
	}

	@When("click on stores Menu Item")
	public void click_on_stores_menu_item() throws Exception {
		try {
			LoginPage.clickOnStoresMenuItem();
		} catch (Exception e) {
			throw e;
		}
	}
	
	//Accessing available payment methods
	
	@When("click on payment methods Menu Item")
	public void click_on_payment_methods_menu_item() throws Exception {
		try {
			LoginPage.clickOnPaymentMethodsMenuItem();
		} catch (Exception e) {
			throw e;
		}
	}





}
