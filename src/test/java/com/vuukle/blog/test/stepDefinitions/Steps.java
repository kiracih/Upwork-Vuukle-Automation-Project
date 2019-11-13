package com.vuukle.blog.test.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import com.vuukle.blog.framework.driver.Driver;
import com.vuukle.blog.framework.page.actions.PostPageActions;
import com.vuukle.blog.framework.page.assertions.Assertions;

public class Steps {

	PostPageActions actions = new PostPageActions();
	Assertions assertions = new Assertions();
	
	@Given("^I navigate to \"([^\"]*)\" page on URL \"([^\"]*)\"$")
	public void i_navigate_to_page_on_URL(String websiteName, String websiteUrl) throws Throwable {
		Driver.goToURL(websiteUrl);
	}
	
	@Then("^I should see \"([^\"]*)\" title$")
	public void i_should_see_title(String websiteTitle) throws Throwable {
		assertions.assertTitle(websiteTitle);
	}
	
	@Given("^I'm already logged in$")
	public void im_already_logged_in() throws Throwable {
		actions.login();
	}
	
	@When("^I enter comment \"([^\"]*)\"$")
	public void i_enter_comment(String comment) throws Throwable {
		actions.enterComment(comment);
	}
		
	@When("^I click \"([^\"]*)\" button$")
	public void i_click_button(String buttonName) throws Throwable {
		actions.clickButton(buttonName);
	}
	
	@Then("^I see \"([^\"]*)\" message$")
	public void i_see_message(String message) throws Throwable {
		assertions.assertCommentSuccessfulMessage(message);
	}
}
