package synchronizationpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersStack {

	public static void main(String[] args) {
		// To launch the chrome browser
	WebDriver driver = new ChromeDriver();
	// to maximize the browser
	driver.manage().window().maximize();
	
	//to apply implicit wait  
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	// we cane use explicit wait instead of implicit wait
	
	
	// to launch the web application
	driver.get("https://www.shoppersstack.com/");
	// to identify the product 
	driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']")).click();
	//to identify the check delivery checkbox and click on it
	driver.findElement(By.id("Check Delivery")).sendKeys("411033");
	
	//apply explicit wait
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	 WebElement ele= wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
	 ele.click();
    // to identify check button
	driver.findElement(By.id("Check")).click();
	}

}
