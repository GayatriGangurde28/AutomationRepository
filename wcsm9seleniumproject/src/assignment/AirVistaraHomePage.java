package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVistaraHomePage {

	public static void main(String[] args) throws InterruptedException {
		//handle notification popup in chrome browser
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--disable-notifications");
		// launch the chrome browser
		WebDriver driver=new ChromeDriver(co);
		// maximize the browser
		driver.manage().window().maximize();
		// launch the airvistara home page
		driver.get("https://www.airvistara.com/in/en");
		// stop execution for 2 sec
		Thread.sleep(2000);
		driver.findElement(By.id("cookieModalCloseBtn")).click();
		// identify originTB by using css selector
		driver.findElement(By.cssSelector("div[id='departsfrom-div']")).sendKeys("PNQ");
		// identify destinationTB by using css selector
		driver.findElement(By.cssSelector("input[name='flightSearchTo']")).sendKeys("BOM");
		//
		
	}

}