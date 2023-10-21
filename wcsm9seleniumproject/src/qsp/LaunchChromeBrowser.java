package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// to launch chrome browser we need to create object of ChromeDriver();
        
		WebDriver driver=new ChromeDriver();
		
		// to maximize the chrome Browser
		driver.manage().window().maximize();
		
        System.out.println("Chrome is Open!!");
        
        //to stop execution for 2 seconds
        Thread.sleep(2000);
        
      //How to close chrome browser
        driver.close();
        System.out.println("Chrome is Closed!!");
        
        
	}

}
