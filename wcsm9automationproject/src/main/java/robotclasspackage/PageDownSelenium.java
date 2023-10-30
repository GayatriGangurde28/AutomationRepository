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

public class PageDownSelenium {

	public static void main(String[] args) throws AWTException, InterruptedException {
	    // TO launch the chrome browser
		WebDriver driver = new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
	    //to apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// to launch the web application
		driver.get("https://www.selenium.dev/");
		//identify news button and right click
		WebElement gettingstarted = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
		
		Actions act = new Actions(driver);
		act.contextClick(gettingstarted).perform();
		//press pageDown and go till inspect
		Robot robot = new Robot();
		for(int i=0; i<10; i++)
		{
			Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
		//hit enter button
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.close();

	}

}
