package actionsclasspackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDevRightClick {

	public static void main(String[] args) throws InterruptedException {
		// To launch the browser
		  WebDriver driver = new ChromeDriver();
		  //to maximize the browser
		  driver.manage().window().maximize();
		  //to apply implicit wait
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  // to launch the web application
		  driver.get("https://www.selenium.dev/");
		  // identify downloads and right
		 WebElement rightclick = driver.findElement(By.xpath("//span[text()='Downloads']"));

		 Actions act = new Actions(driver);
		 Thread.sleep(2000);
		 act.contextClick(rightclick).perform();
		 
		 driver.close();
	}

}
