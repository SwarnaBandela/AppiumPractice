import java.net.URL;

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

 
//import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.android.AndroidDriver;

public class Test 
	{
	public static AndroidDriver driver;
		public static void main(String[] args) throws Exception {
			
			openCalculator();

		}
		
		public static void openCalculator() {
			try {
			UiAutomator2Options Dcap = new UiAutomator2Options();
			Dcap.setCapability("deviceName", "udid");
			Dcap.setCapability("udid", "a6fuugukwcwseekv");
			Dcap.setCapability("platformName", "android");
			Dcap.setCapability("platformVersion", "13 ");
			Dcap.setCapability("newCommandTimeout", "10");
			Dcap.setCapability("appPackage", "com.android.soundrecorder");
			Dcap.setCapability("appActivity", "com.android.soundrecorder.RecordPreviewActivity");
			
//			URL url = ;
//			System.out.println("Application started.................");
//			
			AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723"),Dcap);
			System.out.println("Application started.................");
			
//			Thread.sleep(2000);
			
			WebElement record=driver.findElement(By.id("com.android.soundrecorder:id/btn_preview_record"));
			record.click();
			WebElement access=driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
			access.click();
			WebElement Allow=driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
			Allow.click();
			
			WebElement stoprecord=driver.findElement(By.id("com.android.soundrecorder:id/btn_record_stop"));
			stoprecord.click();
		}catch (Exception e) {
e.printStackTrace();
		}
		}
	}
