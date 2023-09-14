package com.tollgate.signinpage;

import org.openqa.selenium.support.PageFactory;

import com.tollgate.BrowserFactory.BaseDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignInPage extends BaseDriver {
	

	
	public SignInPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//methods
	@AndroidFindBy(id="com.amazon.mShop.android.shopping:id/sign_in_button")
	private AndroidElement signInBtn;
	public  void clickSignInBtn() {
		signInBtn.click();
	}
	@AndroidFindBy(id="ap_email_login")
	private AndroidElement enterUserId;
	public void getEnterUserId(String email) {
		enterUserId.sendKeys(email);
	}
	@AndroidFindBy(id="continue")
	private AndroidElement continueBtn;
	public  void clickContinueBtn() {
		continueBtn.click();
	}
	@AndroidFindBy(id="ap_password")
	private AndroidElement enterPassword;
	public void EnterPassword(String password) {
		enterPassword.sendKeys(password);
	}
	
	@AndroidFindBy(id="alert-msg")
	private AndroidElement msg1;
	public String getmsg() {
		return msg1.getText();
	}
	
	@AndroidFindBy(id="signInSubmit")
	private AndroidElement logInBtn;
	public void clickLogInBtn() {
		logInBtn.click();
	}
	
	public String getTitle() {
		return Driver.getTitle();
	}

}
