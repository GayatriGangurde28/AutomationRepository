package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		// 
		// launch the chrome browser
				WebDriver driver= new ChromeDriver();
				// maximize the browser
				driver.manage().window().maximize();
				//launch the webpage 
				driver.get("file:///C:/Users/Dell/Desktop/wcsm9webelement/Link.html");
				// stop execution for 2 sec
				Thread.sleep(2000);
				// identify the link by using partiallinktext
				driver.findElement(By.partialLinkText("seleniumLink")).click();

	}

}
