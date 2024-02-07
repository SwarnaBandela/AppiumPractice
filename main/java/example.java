import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class example {
	  public static void main(String[] args) throws Exception {
	        AppiumDriverLocalService service = startAppiumServer();
	        AndroidDriver<AndroidElement> driver = openSoundRecorder();
	        System.out.println("Application started.................");
	        Thread.sleep(2000);
	        WebElement record = driver.findElement(AppiumBy.id("com.android.soundrecorder:id/btn_preview_record"));
	        record.click();
	        WebElement access = driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
	        access.click();
	        WebElement Allow = driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button"));
	        Allow.click();
	        WebElement stoprecord = driver.findElement(AppiumBy.id("com.android.soundrecorder:id/btn_preview_stop"));
	        stoprecord.click();
	        driver.pressKeyCode(AndroidKeyCode.BACK);
	        driver.pressKey(new KeyEvent(AndroidKey.HOME));
	        driver.quit();
	        service.stop();
	    }

	    public static AppiumDriverLocalService startAppiumServer() {
	        AppiumServiceBuilder builder = new AppiumServiceBuilder();
	        builder.withIPAddress("0.0.0.0");
	        builder.usingPort(4723);
	        AppiumDriverLocalService service = AppiumDriverLocalService.buildService(builder);
	        service.start();
	        return service;
	    }

	    public static AndroidDriver<AndroidElement> openSoundRecorder() throws Exception {
	        DesiredCapabilities Dcap = new DesiredCapabilities();
	        Dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "udid");
	        Dcap.setCapability(MobileCapabilityType.UDID, "a6fuugukwcwseekv");
	        Dcap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
	        Dcap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13 ");
	        Dcap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "10");
	        Dcap.setCapability("appPackage", "com.android.soundrecorder");
	        Dcap.setCapability("appActivity", "com.android.soundrecorder.RecordPreviewActivity");
	        URL url = new URL("http://0.0.0.0:4723/wd/hub");
	        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url, Dcap);
	        return driver;
	    }
}
