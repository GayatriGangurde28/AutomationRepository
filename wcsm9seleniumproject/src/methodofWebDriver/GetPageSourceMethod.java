package methodofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {

	public static void main(String[] args) throws InterruptedException {
		// Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		// to maximize the browser
		driver.manage().window().maximize();
		// to launch the webapplication
		driver.get("https://omayo.blogspot.com/");
        // to stop the execution for 2sec
		Thread.sleep(2000);
		System.out.println(driver.getPageSource());
		// close the browser
		driver.close();
		
	}
	

}
