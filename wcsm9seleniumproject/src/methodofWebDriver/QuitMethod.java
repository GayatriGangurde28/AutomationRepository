package methodofWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//maximize the chrome browser
		driver.manage().window().maximize();
		//launch the web application
		driver.get("http://omayo.blogspot.com/");
		// stop the execution of script for 2 sec
		Thread.sleep(2000);
		// click on open a pop up window link...
		driver.findElement(By.partialLinkText("Open a popup window"));
		Thread.sleep(2000);
		// close the parent as well as child browser
		driver.quit();
		

	}

}
