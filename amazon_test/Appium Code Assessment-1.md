public static void main(String[] args) throws Exception
{

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("deviceName", "LGD7229bf02741");
    capabilities.setCapability("platformVersion", "5.0.2");
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("app", "in.amazon.mShop.android.shopping.apk");
    capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
    capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
    AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
}
