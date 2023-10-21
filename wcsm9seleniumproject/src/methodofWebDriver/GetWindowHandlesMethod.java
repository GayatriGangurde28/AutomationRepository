package methodofWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {

	public static void main(String[] args) throws InterruptedException {
		// launch the chrome browser
		WebDriver driver = new ChromeDriver();
		// maximize the chrome browser
		driver.manage().window().maximize();
		// launch the web application
		driver.get("https://omayo.blogspot.com/");
		// to stop the execution for 2 sec
		Thread.sleep(2000);
		// take the address of current window or browser
		//parent browser...{the browser or window handle controls }
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
        System.out.println("address of parent browser or window" + parentHandle);
        // to stop execution for 2sec
        Thread.sleep(2000);
        // click on open a popup link
        driver.findElement(By.partialLinkText("Open a popup window")).click();
        // get the address of parent as well as child browser
          Set<String> allHandles = driver.getWindowHandles();
       // print the address of browser use for each loop
       for(String Wh:allHandles)
       {
    	   if(!parentHandle.equals(Wh))
    	   {
    		   System.out.println("address of child window :" + Wh);
    		   
    	   }
    	   else {
    		   System.out.println("address of parent window :" + Wh);
    	   }
    	   
    	   
    	   
    	   }
       }
       
}
