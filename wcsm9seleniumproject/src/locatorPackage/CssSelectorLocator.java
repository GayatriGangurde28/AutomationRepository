package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		// launch the chrome browser
		WebDriver driver= new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// launch the OrangeHrMlogin Page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// stop execution for 2sec
		Thread.sleep(2000);
		//identify usernameTB by using css selector
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		// identify the passwordTB by using css selector
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
        // identify login button  by using css selector
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        //stop execution for 2sec
        Thread.sleep(2000);
        driver.quit();
        
	}

}
