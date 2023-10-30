package robotclasspackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePrintPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TO launch the chrome browser
		WebDriver driver = new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
	    //to apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// to launch the web application
		driver.get("https://www.selenium.dev/");
		//to generate print popup 
		
        Robot robot = new Robot();
        //press ctrl+P
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_P);
        //release key
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_P);
        Thread.sleep(2000);
        //handle the print popup
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        
        Thread.sleep(2000);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        Thread.sleep(2000);
        driver.quit();
        
        
	}

}
