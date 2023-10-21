package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver(); 
		// maximize the browser
		driver.manage().window().maximize();
		// launch the login Page
		driver.get("https://www.instagram.com/");
		//stop execution for 2 sec
		Thread.sleep(2000);
		//identify username textbox and pass input
		driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number, username, or email')]")).sendKeys("admin");
		Thread.sleep(2000);
		// identify password textbox and pass input
		driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("admin123");
		//identify login button and click
		driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]")).click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
