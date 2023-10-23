package synchronizationpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartSynchronize {

	public static void main(String[] args) throws InterruptedException {
		// tO launch the chrome browser
		WebDriver driver =new ChromeDriver();
		// to maximize the browser
		driver.manage().window().maximize();
		//apply implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to launch the flipkart web application
		driver.get("https://www.flipkart.com/");
		// To handle the login pop up
	    driver.findElement(By.xpath("//span[text()='✕']")).click();
	    //cart
		driver.findElement(By.xpath("//a[@class='_1krdK5' and (@title='Cart')]")).click();
		//Thread.sleep(2000);
		//login button
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		// quit
		//driver.quit();
		
	}

}
