package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {

	public static void main(String[] args) {
		// launch the chrome browser
				WebDriver driver= new ChromeDriver();
				// maximize the chrome browser
				driver.manage().window().maximize();
				//apply implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//single select dropdown
				
				//launch the web application 
				driver.navigate().to("file:///C:/Users/Dell/Desktop/wcsm9webelement/Singleselectdropdown.html");
                // identify the dropddown
				WebElement dropdown1 = driver.findElement(By.id("iddd"));
				
				//handle the dropdown 
				Select sel = new Select(dropdown1);

				// select the option
				sel.selectByValue("v4");
			    WebElement firstOpt = sel.getFirstSelectedOption();
			    //get the text of webelement
				System.out.println(firstOpt.getText()); 
				
				//multiselectDD
				
				driver.navigate().to("file:///C:/Users/Dell/Desktop/wcsm9webelement/MultiselectDD.html");
				WebElement dropdown2 = driver.findElement(By.id("iddd"));
				Select sel2 = new Select(dropdown2);
				
				for(int i=3; i<8; i++)
				{
					sel2.selectByIndex(i);
					
				}
				//get option which is selected first
				System.out.println(sel2.getFirstSelectedOption().getText());
				
				driver.close();
				
	}	 
	}


