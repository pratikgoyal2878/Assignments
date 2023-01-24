package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.utilities.AutomationBase;
import com.utilities.Utility;

public class LoginPage extends Utility {

	public LoginPage(WebDriver driverInstance) {
		driver = driverInstance;

	}

	public static void explicitWait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void launchApp(String app) throws Exception {
		AutomationBase.launchApp(getAppUrl(app));
		explicitWait(2);
		logger.info("Site is launched");
	}

	public static void submitCorrectDetails() throws Exception {

		PageObjects.email.sendKeys("admin@yourstore.com");
		PageObjects.password.sendKeys("admin");
		explicitWait(2);
	}

	public static void clickLogin() {

		PageObjects.loginButton.click();
		explicitWait(2);

	}

	public static void submitIncorrectDetails() {
		PageObjects.email.sendKeys("admin@yourstore.com");
		PageObjects.password.sendKeys("admin123");
		explicitWait(2);

	}

	public static void isHomepageDisplayed() {
		Assert.assertEquals("Dashboard / nopCommerce administration", driver.getTitle());
		System.out.println(driver.getTitle());
		explicitWait(2);
	}


	public static void navigateToLoginPage() throws Exception {
		launchApp("Nop Commerce");	
	}

	public static void showHomePage() throws Exception {
		Assert.assertEquals("Dashboard / nopCommerce administration", driver.getTitle());		
	}

	public static void checkErrorMessage() {
		String msg = PageObjects.errorMessage.getText().toString();

		Assert.assertTrue(msg.contains("Login was unsuccessful."));


		//Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.The credentials provided are incorrect",
		//	PageObjects.errorMessage.getText().toString());

		//System.out.println("Error mssgggg--------"+PageObjects.errorMessage.getText().toString());
		explicitWait(2);
	}



	//add new customer page

	public static String getPageTitle()
	{
		return driver.getTitle();
	}

	public static void clickOnCustomersMenu() {
		PageObjects.lnkCustomers_menu.click();
	}

	public static void clickOnCustomersMenuItem() {
		PageObjects.lnkCustomers_menuitem.click();
	}

	public static void clickOnAddnew() {
		PageObjects.btnAddnew.click();
	}

	public static void enterEmail(String email)
	{
		PageObjects.txtEmail.sendKeys(email);
	}

	public static void enterPassword(String password)
	{
		PageObjects.txtPassword.sendKeys(password);
	}

	public static void enterFirstName(String firstName)
	{
		PageObjects.txtFirstName.sendKeys(firstName);
	}

	public static void enterLastName(String lastName)
	{
		PageObjects.txtLastName.sendKeys(lastName);
	}

	public static void enterDob(String dob)
	{
		PageObjects.txtDob.sendKeys(dob);
	}

	public static void enterCompanyName(String coName)
	{
		PageObjects.txtCompanyName.sendKeys(coName);
	}

	public static void enterAdminComment(String comment)
	{
		PageObjects.txtAdminComment.sendKeys(comment);
	}

	public static void enterManagerOfVendor(String value)
	{
		Select drp=new Select(PageObjects.dropdownVendorMgr);
		drp.selectByVisibleText(value);
	}

	public static void enterGender(String gender)
	{
		if(gender.equals("Male"))
		{
			PageObjects.MaleGender.click();
		}
		else if(gender.equals("Female"))
		{
			PageObjects.FeMaleGender.click();
		}
		else
		{
			PageObjects.MaleGender.click();
		}

	}


	public static void clickOnSave()
	{
		PageObjects.btnSave.click();
	}




	public static void clickOnOnlineCustomersMenuItem() {
		PageObjects.online_customers.click();
	}

	public static void clickOnActivityTypesMenuItem() {
		PageObjects.activity_types.click();
	}

	public static void clickOnConfigurationMenu() {
		PageObjects.configuration_menu.click();
	}

	public static void clickOnStoresMenuItem() {
		PageObjects.stores_menuitem.click();
	}

	public static void clickOnPaymentMethodsMenuItem() {
		PageObjects.paymentmethods_menuitem.click();
	}


	//search customer

	public static void enterEmailAdd(String email)
	{
		PageObjects.emailAdd.sendKeys(email);
	}


	public static void clickOnSearchButton()
	{
		PageObjects.searchBtn.click();
	}


	//search customer by name

	public static void enter_FirstName(String firstNameText)
	{
		PageObjects.firstName.sendKeys(firstNameText);
	}


	public static void enter_LastName(String LastNameText)
	{
		PageObjects.lastName.sendKeys(LastNameText);
	}

}































