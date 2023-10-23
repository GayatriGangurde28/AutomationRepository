package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) {
		  //to launch the chrome browser
		   WebDriver driver =new ChromeDriver();
		   // to maximize the browser
		   driver.manage().window().maximize();
		   //apply implicit wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
           //to launch the application
		   driver.get("https://www.instagram.com");
		   //identify username textbox and pass input
		   driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number, username, or email')]")).sendKeys("admin");
		   //identify password textbox and pass input
		   driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("admin123");
		   // identify login button
		   WebElement loginbuttonElement = driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]"));
		   //verify login button is disabled or enabled
		   boolean status = loginbuttonElement.isEnabled();
		   System.out.println(status);

	}

}
