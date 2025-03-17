package org.steps;

import java.io.IOException;
import org.pojo.classes.AccountCreationPOJO;
import org.utilities.BaseClass;
import io.cucumber.java.en.When;

public class CreateAccountFeature extends BaseClass{
	
	AccountCreationPOJO a;

	@When("To clicks on the Create an Account button")
	public void to_clicks_on_the_Create_an_Account_button() {
	    
		implicitWait();
		a = new AccountCreationPOJO();
		buttonClick(a.getCreateAccountButton());
	}

	@When("To enters valid First Name")
	public void to_enters_valid_First_Name() throws IOException {
		
		sendData(a.getFirstName(), excelData("Sheet1", 0, 0));
	}

	@When("To enters valid Last Name")
	public void to_enters_valid_Last_Name() throws IOException {

		sendData(a.getLastName(), excelData("Sheet1", 1, 0));
	}

	@When("To enters valid Email on email feild")
	public void to_enters_valid_Email_on_email_feild() throws IOException {
		   
			sendData(a.getEmailId(), excelData("Sheet1", 2, 0));
	}

	@When("To enters valid password on password feild")
	public void to_enters_valid_password_on_password_feild() throws IOException {
		   
			sendData(a.getPassword(), excelData("Sheet1", 3, 0));
	}

	@When("To enters valid Confirm Password on Confirm Password feild")
	public void to_enters_valid_Confirm_Password_on_Confirm_Password_feild() throws IOException {
		
		sendData(a.getConfirmPassword(), excelData("Sheet1", 4, 0));
	}

	@When("To click the Create an Account button")
	public void to_click_the_Create_an_Account_button() {
		   
			buttonClick(a.getCrreateButton());
	}
	
}
