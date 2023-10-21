package methodofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		// launch the chrome browser
		WebDriver driver = new ChromeDriver();
        // maximize the chrome browser
		driver.manage().window().maximize();
		//launch the webapplication
		driver.get("https://omayo.blogspot.com/");
		// to stop the execution for 2sec
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		// to close the browser
		driver.close();
		
		
	}

}
