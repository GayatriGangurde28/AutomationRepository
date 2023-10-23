package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		// tO launch the chrome browser
	    WebDriver driver =new ChromeDriver();
	   // to maximize the browser
	   driver.manage().window().maximize();
		//apply implicit wait
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to launch the web application 
		driver.get("http://gayatri-laptop:8080/login.do");
		
		//identify usnTb and pass input as admin
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("admin");
		
		//identify passTb and pass input as manager
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys("manager");
		
		Thread.sleep(2000);
		
		usnTB.clear();
		passTB.clear();
	}

}
