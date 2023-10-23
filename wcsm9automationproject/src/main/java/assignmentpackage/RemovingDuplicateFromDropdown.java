package assignmentpackage;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemovingDuplicateFromDropdown {

	public static void main(String[] args) throws InterruptedException {
		   // To launch the browser
		   WebDriver driver = new ChromeDriver();
	       // to maximize the browser
	       driver.manage().window().maximize();
	       // to apply implicit wait
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       //launch the webpage
	       driver.get("file:///C:/Users/Dell/Desktop/wcsm9webelement/MultiselectDD.html");
           //identify dropdown
	       WebElement dropdown1 = driver.findElement(By.id("iddd"));
	       //handle dropdown
	       Select sel = new Select(dropdown1);
	       List<WebElement> allopts = sel.getOptions();
	       //to eliminate duplicate
	     HashSet<String> hs = new HashSet<String>();
	     //read the list by using for loop and eliminate duplicates
	     for(int i=0; i<allopts.size(); i++)
	     {
	    	 WebElement op = allopts.get(i);
	    	 
	    	 //get the text of webelement
	    	 String dropDownOption = op.getText();
	    	 
	    	 //add the dropdownOption into hashset and remove duplicates
	    	 hs.add(dropDownOption);
	     }
	     Thread.sleep(2000);
	     for(String opts:hs)
	     {
	    	 
	    	 Thread.sleep(2000);
	    	 System.out.println(opts);

	     }        
	               
	       

	}

}
