package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		   // to launch the chrome browser
		   WebDriver driver =new ChromeDriver();
		   // to maximize the browser
		   driver.manage().window().maximize();
		   //apply implicit wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
           //to launch the application
		   driver.get("http://gayatri-laptop:8080/login.do");
		   //identify the usnTB and pass input as admin
		  // driver.findElement(By.name("username")).sendKeys("admin");
		   //identify passTB and pass input
		   //driver.findElement(By.name("pwd")).sendKeys("manager");
		  // Thread.sleep(2000);
		   //identify checkbox and click
		   WebElement LoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		   //check the checkbox is selected
		   System.out.println(LoggedInCheckBox.isSelected());
		   
		   //select the checkbox and verify the status
		   LoggedInCheckBox.click();
		   boolean status1 = LoggedInCheckBox.isSelected();
		   System.out.println(status1);

	} 

}
