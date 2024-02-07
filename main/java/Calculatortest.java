import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
//import io.appium.java_client.AppiumBy; 
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Calculatortest {

	public static void main(String[] args) throws Exception {
		openCalculator();

	}

	public static void openCalculator() throws Exception {

		UiAutomator2Options Dcap = new UiAutomator2Options();
		Dcap.setCapability("deviceName", "udid");// Redmi Note 12 Pro 5G
		Dcap.setCapability("udid", "a6fuugukwcwseekv");// a6fuugukwcwseekv //a6fuugukwcwseekv
		Dcap.setCapability("platformName", "android");
		Dcap.setCapability("platformVersion", "13 "); // TP1A.220624.014
		Dcap.setCapability("newCommandTimeout", "10");
		Dcap.setCapability("appPackage", "com.miui.calculator");// com.miui.calculator
		Dcap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");// com.miui.calculator.cal.CalculatorActivity

		URL url = new URL("http://0.0.0.0:4723");
		AndroidDriver driver = new AndroidDriver(url, Dcap);

		// driver.quit();

		// AndroidDriver driver1 = new AndroidDriver(url,Dcap);

		System.out.println("Application started.................");

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement one = driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_1_s"));// com.miui.calculator:id/btn_5_s
		one.click();
		// WebElement one =
		// driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[3]"));one.click();
//			WebElement Pluse = driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));//com.miui.calculator:id/btn_plus_s
//			Pluse.click();
//			WebElement two = driver.findElement(By.id("com.miui.calculator:id/btn_2_s"));//com.miui.calculator:id/btn_5_s
//
//			two.click();
//			
//			 WebElement EQL =
//			 driver.findElement(By.id("com.oneplus.calculator:id/img_eq"));//com.miui.
//			

		// System.out.println("Addtion result: " + Result);

	}
}
