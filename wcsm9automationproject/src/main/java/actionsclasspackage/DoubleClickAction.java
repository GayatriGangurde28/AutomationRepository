package actionsclasspackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		// To launch the browser
		  WebDriver driver = new ChromeDriver();
		  //to maximize the browser
		  driver.manage().window().maximize();
		  //to apply implicit wait
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  // to launch the web application
		  driver.get("http://demoapps.qspiders.com/");
		  //identify button and click
		  driver.findElement(By.xpath("//section[text()='Button']")).click();
		  Thread.sleep(2000);
		  //identify double click and click
		  driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		  Thread.sleep(2000);
		  //identify yes button and click
		  WebElement yestarget = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
		  
		  WebElement notarget = driver.findElement(By.xpath("(//button[text()='No'])[2]"));
		  Thread.sleep(2000);
		  WebElement fivetarget = driver.findElement(By.xpath("//button[text()='5']"));
		  Thread.sleep(2000);
		  
		  Actions act = new Actions(driver);
		  Thread.sleep(2000);
		  act.doubleClick(yestarget).perform();
		  Thread.sleep(2000);
		  act.doubleClick(notarget).perform();
		  Thread.sleep(2000);
		  act.doubleClick(fivetarget).perform();
		  
          System.out.println(yestarget.isDisplayed());
          System.out.println(notarget.isDisplayed());
          System.out.println(fivetarget.isDisplayed());
          
          driver.close();
	}

}
