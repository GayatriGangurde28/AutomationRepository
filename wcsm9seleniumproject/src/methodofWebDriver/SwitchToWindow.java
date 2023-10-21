package methodofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow {

	public static void main(String[] args) throws InterruptedException {
		// launch the chrome browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		//launch the web application
		driver.get("https://omayo.blogspot.com/");
		// stop execution for 2 sec
		Thread.sleep(2000);
		// take the address of current browser or window
	    String parentHandle = driver.getWindowHandle();
	    System.out.println(parentHandle);
	    System.out.println("address of parent browser" + parentHandle);
	    // stop the execution for 2 sec
	    Thread.sleep(2000);
	    
		
		

	}

}
