package actionsclasspackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

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
		  //identify right click and click
		  driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		  //identify right click
		  WebElement rightclicking1 = driver.findElement(By.xpath("(//button[text()='Right Click'])[1]"));
		  WebElement rightclicking2 = driver.findElement(By.xpath("(//button[text()='Right Click'])[1]"));
		  WebElement rightclicking3 = driver.findElement(By.xpath("(//button[text()='Right Click'])[1]"));
		  
          Actions act = new Actions(driver);
          act.contextClick(rightclicking1).perform();
          Thread.sleep(2000);
          act.contextClick(rightclicking2).perform();
          Thread.sleep(2000);
          act.contextClick(rightclicking3).perform();
          //isdisplayed
          System.out.println(rightclicking1.isDisplayed());
          
          System.out.println(rightclicking2.isDisplayed());
          
          System.out.println(rightclicking3.isDisplayed());
          
          
        
        
	}

}
