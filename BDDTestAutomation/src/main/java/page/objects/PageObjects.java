package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.Utility;

public class PageObjects extends Utility{
	public static WebDriver driver;


	public PageObjects(WebDriver driverInstance) {
		PageFactory.initElements(driverInstance, this);
		driver = driverInstance;
	}

	//login page
	
	@FindBy(id = "Email")
	public static WebElement email;
	
	@FindBy(id="Password")
	public static WebElement password;

	@FindBy(xpath = "//button[@class='button-1 login-button']")
	public static WebElement loginButton;
	
	@FindBy(linkText = "Logout")
	public static WebElement logout;
	
	@FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
	public static WebElement errorMessage;
	
	//add new customer page
	
	@FindBy(xpath="//a[@href='#']//p[contains(text(),'Customers')]")	 
	public static WebElement lnkCustomers_menu;


	@FindBy(xpath="//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	public static WebElement lnkCustomers_menuitem;
	
	@FindBy(xpath="//p[normalize-space()='Online customers']")
	public static WebElement online_customers;
	
	@FindBy(xpath="//p[normalize-space()='Activity Types']")
	public static WebElement activity_types;
	
	@FindBy(xpath="//p[normalize-space()='Configuration']")
	public static WebElement configuration_menu;
	
	@FindBy(xpath="//p[normalize-space()='Stores']")
	public static WebElement stores_menuitem;
	
	@FindBy(xpath="//p[normalize-space()='Payment methods']")
	public static WebElement paymentmethods_menuitem;

	@FindBy(xpath = "//a[@class='btn btn-primary']")	 
	public static WebElement btnAddnew;


	@FindBy(xpath = "//input[@id='Email']")
	public static WebElement txtEmail;


	@FindBy(xpath = "//input[@id='Password']")
	public static WebElement txtPassword;

	@FindBy(xpath = "//div[@class='k-multiselect-wrap k-floatwrap']")
	public static WebElement txtCustomerRoles;


	@FindBy(xpath = "//li[contains(text(),'Administrators')]")
	public static WebElement listItemAdministrators;


	@FindBy(xpath = "//li[contains(text(),'Registered')]")
	public static WebElement listItemRegistered;

	@FindBy(xpath = "//li[contains(text(),'Guests')]")
	public static WebElement listItemGuests;


	@FindBy(xpath = "//li[contains(text(),'Guests')]")
	public static WebElement listItemVendors;

	@FindBy(xpath = "//*[@id='VendorId']")
	public static WebElement dropdownVendorMgr;

	@FindBy(id = "Gender_Male")
	public static WebElement MaleGender;


	@FindBy(id = "Gender_Female")
	public static WebElement FeMaleGender;


	@FindBy(xpath = "//input[@id='FirstName']")
	public static WebElement txtFirstName;


	@FindBy(xpath = "//input[@id='LastName']")
	public static WebElement txtLastName;

	@FindBy(xpath = "//input[@id='DateOfBirth']")
	public static WebElement txtDob;

	@FindBy(xpath = "//input[@id='Company']")
	public static WebElement txtCompanyName;

	@FindBy(xpath = "//textarea[@id='AdminComment']")
	public static WebElement txtAdminComment;


	@FindBy(xpath = "//button[@name='save']")
	public static WebElement btnSave;
	
	
	//search customer
	
	@FindBy(id="SearchEmail")
	public static WebElement emailAdd;

	@FindBy(id="search-customers")
	public static WebElement searchBtn;

	@FindBy(id="SearchFirstName")
	public static WebElement firstName;

	@FindBy(id="SearchLastName")
	public static WebElement lastName;
	
	
}
