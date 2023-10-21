package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		// launch the chrome browser
		WebDriver driver= new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// launch the simplelogin Page
		driver.get("file:///C:/Users/Dell/Desktop/wcsm9webelement/SimpleLoginPage.html");
			
			
			Thread.sleep(2000);
			// identify usernameTB and pass input as admin
			driver.findElement(By.tagName("input")).sendKeys("admin");
			// identify passwordTB and pass input as manager
			Thread.sleep(2000);
			driver.findElement(By.tagName("input")).sendKeys("manager");
			
			
		

	}

}
