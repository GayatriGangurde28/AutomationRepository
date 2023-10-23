package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethodForMultiselectDD {

	public static void main(String[] args) {
		// to launch the chrome browser
		   WebDriver driver =new ChromeDriver();
		   // to maximize the browser
		   driver.manage().window().maximize();
		   //apply implicit wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
           //navigate to the file
		   driver.navigate().to("file:///C:/Users/Dell/Desktop/wcsm9webelement/MultiselectDD.html");
		   //identify dropdown
		   
		   WebElement dropdown4 = driver.findElement(By.id("iddd"));

		   Select sel4 = new Select(dropdown4);
		   
		   for(int i=0; i<=5; i++)
		   {
			   sel4.selectByIndex(i);
			   
		   }
		
		   driver.get("http://demoapps.qspiders.com/");  
		   driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		   driver.findElement(By.partialLinkText("Multi Select")).click();
		   
	}

}
