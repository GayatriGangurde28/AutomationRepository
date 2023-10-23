package synchronizationpackage;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		// tO launch the chrome browser
		WebDriver driver =new ChromeDriver();
		// to maximize the browser
		driver.manage().window().maximize();
		//
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to launch the instagram web application
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		// to identify username TB and pass input 
	   driver.findElement(By.name("username")).sendKeys("admin123");
	   // to identify password TB and pass input
	   driver.findElement(By.name("password")).sendKeys("admin456");
	   // to identify login button by using x path and click
	   
	   driver.findElement(By.xpath("//div[text()='Log in']")).click();

	}

}
