package actionsclasspackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActitimeDoubleclickScenario {

	public static void main(String[] args) throws InterruptedException, AWTException {
		  // To launch the browser
		  WebDriver driver = new ChromeDriver();
		  //to maximize the browser
		  driver.manage().window().maximize();
		  //to apply implicit wait
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  // to launch the web application
		  driver.get("http://gayatri-laptop:8080/login.do");
		  //identify username and enter input admin
		  driver.findElement(By.name("username")).sendKeys("admin");
		  //identify password and enter input manager
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  //identify login button and click
		  driver.findElement(By.xpath("//a[text()='Login']")).click();
		  Thread.sleep(2000);
		  //identify setting module 
		  driver.findElement(By.xpath("(//img[@class='sizer'])[5]")).click();
		  Thread.sleep(2000);
		  //identify logo and color sub module and click
		  driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		  Thread.sleep(2000);
		  //identify radiobutton and click
		  driver.findElement(By.id("uploadNewLogoOption")).click();
		  //identify choose files and double click
		  WebElement choosefiles = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		  Thread.sleep(2000);
		  Actions act = new Actions(driver);
		  act.doubleClick(choosefiles).perform();
		  Thread.sleep(2000);
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_CANCEL);
		  driver.quit();

	}

}
