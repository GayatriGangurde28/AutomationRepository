
package methodofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {
		// launch the chrome browser
		WebDriver driver=new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// launch the web application 
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		// get the title of current webpage
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);
		System.out.println(driver.getTitle());

	}

}
