package methodofWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		        // launch the chrome browser
				WebDriver driver = new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				// launch the web application
				driver.get("https://www.google.com");
				// stop the execution 
				Thread.sleep(2000);
				//switch the controls to activeElement
				driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
				

	}

}
