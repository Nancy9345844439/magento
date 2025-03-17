package org.steps;

import org.utilities.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

	@Before
	public void preCondition(){

		launchBrowser();
		launchUrl("https://magento.softwaretestingboard.com/");
		maxBrowser();

	}

	@After
	public void postCondition(){

		closeBrowser();
	}

}
