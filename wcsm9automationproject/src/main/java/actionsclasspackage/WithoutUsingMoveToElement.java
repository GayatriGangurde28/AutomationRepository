package actionsclasspackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithoutUsingMoveToElement {

	public static void main(String[] args) throws InterruptedException {
		// To launch the browser
		  WebDriver driver = new ChromeDriver();
		  //to maximize the browser
		  driver.manage().window().maximize();
		  //to apply implicit wait
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  // to launch the webapllication
		  driver.get("https://www.bluestone.com/");
		  // handle the popup
		  driver.findElement(By.id("denyBtn")).click();
		  //identify coins and click
		 WebElement coinstarget = driver.findElement(By.xpath("//a[text()='Coins ']"));
		  Actions act = new Actions(driver);
		  act.moveToElement( coinstarget).perform();
		  Thread.sleep(2000);
		  //identify coins by design and click
		  driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		  
 WebElement lakshmigoldcoins = driver.findElement(By.xpath("//h1[@class='page-title title-14']"));
	
	boolean status = lakshmigoldcoins.isDisplayed();
	System.out.println(status);
	}

}
