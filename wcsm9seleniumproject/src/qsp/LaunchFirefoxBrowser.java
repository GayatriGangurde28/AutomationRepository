package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		// to launch firefox browser we need to create object of FirefoxDriver();
        
				WebDriver driver=new FirefoxDriver();
				
				// to maximize the Firefox Browser
				driver.manage().window().maximize();
				
		        System.out.println("Firefox is Open!!");
		        
		        //to stop execution for 2 sec
		        Thread.sleep(2000);
		        
		        //How to stop Firefox Browser
		       driver.close();
		       System.out.println("Firefox is Closed!!");

	}

}
