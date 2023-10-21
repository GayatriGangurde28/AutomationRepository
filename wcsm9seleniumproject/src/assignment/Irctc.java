package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		// handle notification pop up
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--disable-notifications");
		// launch the browser
		WebDriver driver= new ChromeDriver(co);
		// maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// launch the application
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		// switch to active element
		driver.switchTo().activeElement().sendKeys("pune",Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//input[contains(@class,'ng-tns-c57-9 ui-inputtext ui-widget ui-state')]')]")).sendKeys("Mumbai");
		//identify date by using xpath 
		//driver.findElement(By.xpath("//a[contains(@class,'ui-state-default')]"));

		
		

	}

}
