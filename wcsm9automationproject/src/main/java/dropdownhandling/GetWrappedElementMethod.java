package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) {
		// TO launch the browser
       WebDriver driver = new ChromeDriver();
       // to maximize the browser
       driver.manage().window().maximize();
       // to apply implicit wait
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       // to lauch single select dropdown page
       driver.get("file:///C:/Users/Dell/Desktop/wcsm9webelement/Singleselectdropdown.html");
       //identify single select dropdown
       WebElement dropdown1 = driver.findElement(By.id("iddd"));
       //handle the dropdown
       Select sel = new Select(dropdown1);
       //get all options from dropdown by using getwrapped 
       WebElement allopts = sel.getWrappedElement();
       System.out.println(allopts.getText());
       
      driver.close();
       
	}

}
