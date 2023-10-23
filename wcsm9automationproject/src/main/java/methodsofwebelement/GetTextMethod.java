package methodsofwebelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		// tO launch the chrome browser
		WebDriver driver =new ChromeDriver();
		// to maximize the browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to launch the google 
		driver.get("https://www.google.com");
		// switch to active element
		driver.switchTo().activeElement().sendKeys("Iphone");
		 List<WebElement> allIphone = driver.findElements(By.className("container"));  
				 for(WebElement phone:allIphone)
				 {
					 System.out.println(phone.getText());
				 }

	}

}
