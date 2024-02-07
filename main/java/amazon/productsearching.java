package amazon;


import java.util.List;

import org.openqa.selenium.By;
import amazon.AmazonLogin;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.remote.RemoteWebElement;





public class productsearching<TouchAction> {



	public void product() throws InterruptedException {
		
		 WebElement search = AmazonLogin.driver.findElement(By.id("in.amazon.mShop.android.shopping:id/chrome_action_bar_search"));
		 search.click();
		 System.out.println("Search for product");
		 WebElement searchInput = AmazonLogin.driver.findElement(By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text"));
		 searchInput.click();
		 searchInput.sendKeys("Tops for womens");
		 System.out.println("Enter the text in search field");
		 
		 //selecting value from the list 
		 
		 List<WebElement> searchResults = AmazonLogin.driver.findElements(By.className("android.widget.LinearLayout"));
		 while (!searchResults.isEmpty()) {
	
		     WebElement selectValue = searchResults.get(0); // Replace 0 with the index of the desired element
		     selectValue.click();
		     System.out.println("Clicked on auto suggestion value");
		     break;
      	 } 
	     
		 
		 //Horizontal scroll         
		
     By horizontalscroll = AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)"
             + ".xpath(\"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]\")).setAsHorizontalList()"
             + ".scrollIntoView(new UiSelector().textContains(\"Beauty\")).click()");   
          
        System.out.println("Horizontal scrolling and clicked on Beauty option");
        
     
     //Full screen vertical scroll
     
     Actions actions = new Actions(AmazonLogin.driver);
     actions.perform();
     AmazonLogin.driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
	 + "new UiSelector().textContains(\"Clothing\").instance(0))")).click();
     System.out.println("Clicked on Tops");
     
     //Select Size and Add to cart
     
     AmazonLogin.driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
    		 + "new UiSelector().textContains(\"Clothing\").instance(0))")).click();
     
     WebElement Trackshoot=AmazonLogin.driver.findElement(AppiumBy.className("	\r\n"
     		+ "android.widget.TextView"));
     Trackshoot.click();
     
     //     WebElement sizeS= AmazonLogin.driver.findElement(By.id("")).click();
     
     
     // Assuming 'elementToScrollTo' is a WebElement representing the element you want to scroll to
//     WebElement elementToScrollTo = AmazonLogin.driver.findElement(By.id("your_element_id"));

     // Scroll to the element
//     elementToScrollTo(AmazonLogin.driver, elementToScrollTo);

     // After scrolling, find and click the button
//     WebElement  sizeS=AmazonLogin.driver.findElement(By.id("your_button_id"));
//     sizeS.click();
     
     
     
     
 }


    
	 }		 

