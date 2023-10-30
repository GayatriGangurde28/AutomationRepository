package actionsclasspackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

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
		  // identify watch jewellery
		  WebElement watchjewellerytarget = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		  Actions act = new Actions(driver);
		  Thread.sleep(2000);
		  act.moveToElement(watchjewellerytarget).perform();
		  Thread.sleep(2000);
		  //identify band option
		  driver.findElement(By.xpath("//a[text()='Band']")).click();
		  //use is displayed method
		   WebElement watchbandjewellery = driver.findElement(By.xpath("//span[text()='WATCH BAND JEWELLERY']"));
		  
		  
		   Boolean status = watchbandjewellery.isDisplayed();
		  System.out.println(status);
          driver.close();		  

	}

}
