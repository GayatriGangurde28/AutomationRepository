package methodofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// launch the chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		
		//launch the web application using navigate();
		// store it in one reference variable i.enav
		 Navigation nav = driver.navigate();
		 nav.to("https://www.selenium.dev");
		 // delay for 2sec
		 Thread.sleep(2000);
		// to perform backward operation
		 nav.back();
		 Thread.sleep(2000);
		 // to perform forward operation
		 nav.forward();
		 Thread.sleep(2000);
		 // to perform refresh operation
		 nav.refresh();
		 
		 
		
		

	}

}
