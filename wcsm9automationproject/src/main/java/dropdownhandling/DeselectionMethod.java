package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeselectionMethod {

	public static void main(String[] args) {
		// to launch the chrome browser
		   WebDriver driver =new ChromeDriver();
		   // to maximize the browser
		   driver.manage().window().maximize();
		   //apply implicit wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   //

	}

}
