package Stepdefinations;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import com.tollgate.BrowserFactory.BaseDriver;
import com.tollgate.signinpage.SignInPage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepSteps extends BaseDriver{

	SignInPage page = new SignInPage(Driver);
	@Given("you are on the Login Page of Amazon app")
	public void you_are_on_the_login_page_of_amazon_app() {
		// BaseDriver will launch Amazon app
		
	}
	
	@When("Email field is Empty")
	public void email_field_is_empty() {
		page.getEnterUserId("");
	  page.clickContinueBtn();
	}

	@Then("should give message, Enter your email or mobile phone number")
	public void should_give_message_enter_your_email_or_mobile_phone_number() {
		assertEquals(page.getmsg(),"enter email or mobile number");
	    
	}

	@When("user Enters email and clicks on Continue")
	public void user_enters_email_and_clicks_on_continue() {
		page.getEnterUserId("mishrarohit497@gmail.com");
	    page.clickContinueBtn();
	}

	@Then("should display page to enter password")
	public void should_display_page_to_enter_password() {
	    assertEquals(page.getTitle(),"Password-page");
	}

	@When("user Enters wrong phone number and clicks on Continue")
	public void user_enters_wrong_phone_number_and_clicks_on_continue() {
		page.getEnterUserId("646466");
	   page.clickContinueBtn();
	}

	@Then("should give message, No account found with mobile number")
	public void should_give_message_no_account_found_with_mobile_number() {
		assertEquals(page.getmsg(),"No accounts found with this mobile number");
	}

	@When("user Enters wrong email address and clicks on Continue")
	public void user_enters_wrong_email_address_and_clicks_on_continue() {
		
		page.getEnterUserId("me.mlksdf");
		   page.clickContinueBtn();
	  
	}

	@Then("should give message, No account found with email address")
	public void should_give_message_no_account_found_with_email_address() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(page.getmsg(),"No accounts found with this email");
	}

	@Given("you are on the Sign in Page of Amazon app")
	public void you_are_on_the_sign_in_page_of_amazon_app() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters password and clicks on Sign in")
	public void user_enters_password_and_clicks_on_sign_in() {
	    page.EnterPassword("Rohit@4343");
	    page.clickLogInBtn();
	}

	@Then("User is redirected to Home Page of Amazon")
	public void user_is_redirected_to_home_page_of_amazon() {
	    assertEquals(page.getTitle(),"amazon");
	}


}
