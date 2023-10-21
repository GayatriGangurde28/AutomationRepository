package methodofWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {

	public static void main(String[] args) throws InterruptedException {
		// launch the chrome browser
				WebDriver driver = new ChromeDriver();
				//handle the properties of chrome browser
				//maximize
				//mimimize
				//fullscreen
				//set size
				//set position
				
				//maximize the browser
				driver.manage().window().maximize();
				//delay of 2 sec
				//Thread.sleep(2000);
				//minimize the browser
				//driver.manage().window().minimize();
				Thread.sleep(2000);
				//fullscreen the browser
				//driver.manage().window().fullscreen();
				
				// set size of browser
		        Dimension targetsize = new Dimension(350, 450);
				driver.manage().window().setSize(targetsize);
				Thread.sleep(2000);
				//set position of browser
				Point targetposition = new Point(450, 250);
				driver.manage().window().setPosition(targetposition);
				
				
				
				

	}

}
