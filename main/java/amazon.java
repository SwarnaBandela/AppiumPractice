import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class amazon {
	static AndroidDriver driver;
   // static String selectlanguage = "English";
	public static void main(String[] args) throws Exception {
		
		amazon poc=new amazon();
		
		poc.openAmazon();
		System.out.println("Application started.................");
		poc.notificationpopup();
		System.out.println("Successfully selected the option from notifiction popup");
		selectLanguage();
		poc.homescreen();
		 
	}

	@SuppressWarnings("unused")
	public static void openAmazon() throws Exception {
		
            UiAutomator2Options Dcap = new UiAutomator2Options();
            Dcap.setCapability("deviceName", "udid");
            Dcap.setCapability("udid", "a6fuugukwcwseekv");
            Dcap.setCapability("platformName", "android");
            Dcap.setCapability("platformVersion", "13 ");
            Dcap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
            Dcap.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");

            URL url = new URL("http://0.0.0.0:4723");
            driver = new AndroidDriver(url, Dcap);
           
    }
	
	public static void notificationpopup() throws InterruptedException {
		Thread.sleep(3000);
        //Notification access popup
        WebElement notificationdeny=driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button"));
        
        WebElement notificationallow=driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button"));

        if (notificationdeny.isDisplayed()) {
        	notificationdeny.click();
        	System.out.println("Notifications denied");
        } else {
        	notificationallow.click();
        }		
	}
	
	public static void selectLanguage() {
	   
	    String[] languages = {"English", "Spanish", "French", "German"};
	   // String selectedLanguage = "English";
	    
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter the language");
	    String selectedLanguage = input.nextLine();
	    
	    	    
	    for (String language : languages) {
	        if (selectedLanguage.equals("English")) {
	        WebElement english = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Continue in English\"]"));
	        english.click();
	        System.out.println("Successfully selected english language");
	        break;
	        }
	    }
	    
	    WebElement skipsignin = driver.findElement(By.id("in.amazon.mShop.android.shopping:id/skip_sign_in_button"));
	    skipsignin.click();
	    System.out.println("Skip sign in");
    }
	public void homescreen() {
		 WebElement menu = driver.findElement(By.id("in.amazon.mShop.android.shopping:id/chrome_action_bar_burger_icon"));
		 menu.click();
	}
}
