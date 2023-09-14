package com.tollgate.BrowserFactory;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseDriver {
	
	public static AndroidDriver<AndroidElement> Driver;
	DesiredCapabilities capabilities=new DesiredCapabilities();
	    
	    //Setting desired capabilities
	public void setcapability() {
		capabilities.setCapability("Device","emulator1");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","10");
		capabilities.setCapability("appPackage","com.amazon.mShop.android.shopping");
		capabilities.setCapability("appActivity","com.amazon.mShop.home.HomeActivity");
		capabilities.setCapability("appName","Amazon_shopping.apk");
		capabilities.setCapability("androidInstallTimeout",1000000);
		
	}
	public void getDriver() {
	    try {
			Driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	

}
