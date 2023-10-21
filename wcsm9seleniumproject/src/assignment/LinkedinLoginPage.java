package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedinLoginPage {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver(); 
		// maximize the browser
		driver.manage().window().maximize();
		// launch the login Page
		driver.get("https://www.linkedin.com/home?original_referer=https%3A%2F%2Fwww.linkedin.com%2Ffeed%2F");
		
			Thread.sleep(2000);
			// identify usernameTB and pass input as mobile number
			driver.findElement(By.id("session_key")).sendKeys("9876543210");
			Thread.sleep(2000);
			// identify passwordTB and pass input as abcd123
			driver.findElement(By.id("session_password")).sendKeys("abcd123");
			
			

	}

}
