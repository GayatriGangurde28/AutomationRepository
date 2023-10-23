package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) {
		// tO launch the chrome browser
	    WebDriver driver =new ChromeDriver();
	   // to maximize the browser
	   driver.manage().window().maximize();
		//apply implicit wait
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to launch the web application 
		driver.get("http://gayatri-laptop:8080/login.do");
		//identify usnTb and pass input as admin
		driver.findElement(By.name("username")).sendKeys("admin");
		//identify passTb and pass input as manager
		driver.findElement(By.name("pwd")).sendKeys("manager");

	}

}
