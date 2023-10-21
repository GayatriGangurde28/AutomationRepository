package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipcartXpathLocator {

	public static void main(String[] args) throws InterruptedException {
		
		// TO launch the browser
		WebDriver driver =new ChromeDriver();
		// To maximize the browser
		driver.manage().window().maximize();
		// To launch the web application
		driver.get("https://www.flipkart.com/");
		// To stop execution for 2 sec
		Thread.sleep(2000);
	    // To handle the login pop up
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		// To stop execution for 2 sec
		Thread.sleep(2000);
		// To identify search box pass mobile as input
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobile");
		//identify search icon and click
		driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
		// To stop execution for 2 sec
		Thread.sleep(2000);
		//String price = driver.findElement(By.xpath("(//div[@class=\"_4rR01T\"]/ancestor::div[@class="_3pLy-c-row"]/descendant::div[@class=\"_30jeq3 _1_WHN1\"])[2]")).getText();
		System.out.println("price");
		
       
	}

}
