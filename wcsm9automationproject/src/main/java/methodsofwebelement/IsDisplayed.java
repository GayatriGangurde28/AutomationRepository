package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) 
	{ 
		   // to launch the chrome browser
		   WebDriver driver =new ChromeDriver();
		   // to maximize the browser
		   driver.manage().window().maximize();
		   //apply implicit wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            // to launch the application
		   driver.get("http://gayatri-laptop:8080/login.do");
		   //identify the usnTB and pass input as admin
		   driver.findElement(By.name("username")).sendKeys("admin");
		   //identify passTB and pass input
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   // identify login button and click
		   driver.findElement(By.id("loginButton")).click();
		   // identify logout link to verify
		  WebElement logoutLinkElement = driver.findElement(By.xpath("//a[@class='logout']"));
		   
		   //check for logout link element is displayed or not
		  boolean status = logoutLinkElement.isDisplayed();
		  System.out.println(status);
		  driver.close();
		   
	}

}
