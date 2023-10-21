package methodofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

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

	}

}
