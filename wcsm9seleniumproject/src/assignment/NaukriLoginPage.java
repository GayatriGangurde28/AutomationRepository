package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriLoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TO launch chrome browser
		WebDriver driver=new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// to launch the webapplication
		driver.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(2000);
		//identify usernameTB and pass the value as gayatri
		driver.findElement(By.id("usernameField")).sendKeys("gayatri");
		Thread.sleep(2000);
		// identify passwordTB and pass the value as gayatri123
		driver.findElement(By.id("passwordField")).sendKeys("gayatri123");

	}

}
