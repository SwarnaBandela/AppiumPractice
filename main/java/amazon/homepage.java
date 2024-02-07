package amazon;
import org.openqa.selenium.By;
import amazon.AmazonLogin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.appium.java_client.AppiumBy;


public class homepage {
	
	 static String option;
	 //constructor
	 public homepage(String option) {
		 this.option=option;
	 }
	
		public static void homescreen() throws InterruptedException {
			
			WebElement menu = AmazonLogin.driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Navigation panel, button, double tap to open side panel\"]"));
			 menu.click();
			 System.out.println("List of menu");
			 System.out.println("Select Programs and Feature option from list of options");
			 
			Thread.sleep(30);
			 
			 switch (option) {
			 
			   case "Home":
    			 
				 WebElement home = AmazonLogin.driver.findElement(By.xpath("	\r\n"
				 		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]"));
				 home.click();
				 
			    break;
			 
		        case "Programs and Features":
		            			 
				 WebElement programsandfeatures = AmazonLogin.driver.findElement(By.xpath("	\r\n"
				 		+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[11]"));
				 programsandfeatures.click();
				 
				 System.out.println("clicked on Programs and Feature option");
				 
			    break;
			    
		        default:
		        	 WebElement settings = AmazonLogin.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[14]"));
						 settings.click();  
			    
			 }
			    
			 
			 //Vertical scroll
			 Actions actions = new Actions(AmazonLogin.driver);
		     actions.perform();
		     AmazonLogin.driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
			 + "new UiSelector().textContains(\"Local Shops on Amazon\").instance(0))")).click();
		    System.out.println("Clicked on Local Shops on Amazon option from Programs and Features");
		    
		    
		
	
}}