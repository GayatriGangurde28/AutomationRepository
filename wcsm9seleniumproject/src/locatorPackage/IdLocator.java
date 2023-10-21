package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		//// launch the chrome browser
		WebDriver driver= new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// launch the simplelogin Page
		driver.get("file:///C:/Users/Dell/Desktop/wcsm9webelement/SimpleLoginPage.html");
		Thread.sleep(2000);
		//identify usernameTB and pass value as admin by using id
		driver.findElement(By.id("id1")).sendKeys("admin");
		Thread.sleep(2000);
		//identify passwordTB and pass value as manager by using id
		driver.findElement(By.id("id2")).sendKeys("manager");
		
		

	}

}
