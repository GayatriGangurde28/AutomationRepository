package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeMethod {

	public static void main(String[] args) {
		// tO launch the chrome browser
	    WebDriver driver =new ChromeDriver();
	   // to maximize the browser
	   driver.manage().window().maximize();
		//apply implicit wait
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to launch the orange hrm web application 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //get the attribute value of usnTB i.e name attribute
		 WebElement usnTB = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		 
		  String attributeValue = usnTB.getAttribute("class");
		  System.out.println(attributeValue);
		  
		  
	}

}
