package synchronizationpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersStackUsingMethod {

	public static void main(String[] args) {
		// // To launch the chrome browser
		WebDriver driver = new ChromeDriver();
		// to maximize the browser
		driver.manage().window().maximize();
		//to apply implicit wait  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		// to launch the web application
		driver.get("https://www.shoppersstack.com/");
		// to identify the product 
		driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']")).click();
		//to identify the check delivery checkbox and click on it
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		
		WebElement checkbutton = driver.findElement(By.id("Check"));
		explicitWait(driver, 30, checkbutton).click();
	}
		


	//explicit wait using method
	
	public static WebElement explicitWait (WebDriver driver,long sec,WebElement ele)
	{
          WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(sec));
          WebElement element= wait.until(ExpectedConditions.elementToBeClickable(ele));
          return element;
	}

}
