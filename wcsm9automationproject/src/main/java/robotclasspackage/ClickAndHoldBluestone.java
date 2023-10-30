package robotclasspackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldBluestone {

	public static void main(String[] args) throws InterruptedException, AWTException {
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
		  //identify filtered by
		 WebElement filteredby = driver.findElement(By.xpath("//span[@class='f-by']"));
		 Thread.sleep(2000);
		 for(int i=1; i<=2; i++)
		 {
		 act.doubleClick(filteredby).perform();
		 act.clickAndHold(filteredby).perform();
		 }
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
		//identify search box
		driver.findElement(By.xpath("//input[@name='search_query']")).click();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		
		//identify search button and click
		driver.findElement(By.xpath("//input[@name='submit_search']")).click();
		
		driver.close();
	
		  

	}

}
