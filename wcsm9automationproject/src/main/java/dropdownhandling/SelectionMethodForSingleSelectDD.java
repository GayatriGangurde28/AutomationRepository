package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethodForSingleSelectDD {

	public static void main(String[] args) throws InterruptedException {
		// to launch the chrome browser
		   WebDriver driver =new ChromeDriver();
		   // to maximize the browser
		   driver.manage().window().maximize();
		   //apply implicit wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
           //to launch the application
		   driver.get("http://demoapps.qspiders.com/");
		   //identify dropdown link and click 
		   driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		   //identify phone no dropdown
		   WebElement dropdown1 = driver.findElement(By.xpath("//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring  ease-linear transition-all duration-150 w-5/12']"));
		   
		   Select sel1 = new Select(dropdown1);
		   Thread.sleep(2000);
		   //select option
		   sel1.selectByIndex(2);
		   
		   //identify country dropdown
		  WebElement dropdown2 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		 
		  Select sel2 = new Select(dropdown2);
		  Thread.sleep(2000);
		  sel2.selectByValue("India");
		  
		  //identify state dropdown
		  WebElement dropdown3 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
		   
		   Select sel3 = new Select(dropdown3);
		   Thread.sleep(2000);
		   sel3.selectByVisibleText("Maharashtra");
		   

	}

}
