package amazontest;

import amazon.AmazonLogin;
import amazon.homepage;
import amazon.productsearching;

public class homescreen {
public static void main(String[] args) throws Exception {
	
	//login 
	AmazonLogin poc=new AmazonLogin();
	poc.openAmazon();
	System.out.println("Application started.................");
	poc.notificationpopup();
	System.out.println("Successfully selected the option from notifiction popup");
	poc.selectLanguage();
	
	//home page
	
	
	homepage HP=new homepage("Programs and Features");
		homepage.homescreen();
	
	// Product searching
	productsearching PS= new productsearching();
	PS.product();
	
}
}
