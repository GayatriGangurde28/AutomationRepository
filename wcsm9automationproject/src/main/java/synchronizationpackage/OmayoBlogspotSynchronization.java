package synchronizationpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmayoBlogspotSynchronization {

	public static void main(String[] args) {
		// // To launch the chrome browser
		WebDriver driver = new ChromeDriver();
		// to maximize the browser
		driver.manage().window().maximize();
		
		//to apply implicit wait  
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// to launch the web application
		driver.get("https://omayo.blogspot.com/");
		
		 // identify dropdown button
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		
		// identify flipkart link
		driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
		
		//explicit wait
		//WebDriverWait wait = new WebDriverWait(driver, null);
        //wait.until(ExpectedConditions.elementToBeClickable(By.));
	}

}
