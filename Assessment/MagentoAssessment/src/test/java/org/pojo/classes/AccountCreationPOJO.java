package org.pojo.classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class AccountCreationPOJO extends BaseClass {

	public AccountCreationPOJO() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@title='First Name']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@title='Last Name']")
	private WebElement lastName;
	
	@FindBy(xpath = "(//a[text()='Create an Account'])[1]")
	private WebElement createAccountButton;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@title='Email']")
	private WebElement emailId;

	@FindBy(xpath = "(//span[text()='Create an Account'])[1]")
	private WebElement createButton;

	@FindBy(xpath = "//input[@id='password-confirmation']")
	private WebElement confirmPassword;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getCrreateButton() {
		return createButton;
	}

	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}

}
