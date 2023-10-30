package takesscreenshotpackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay3 {

	public static void main(String[] args) throws IOException {
		// To launch the browser
		WebDriver driver = new ChromeDriver();
		// to maximize the browser

		driver.manage().window().maximize();
		// to apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// to launch the web application
		driver.get("https://www.selenium.dev/");
		// take the help of third party class
		EventFiringWebDriver ewf = new EventFiringWebDriver(driver);
		// call the method getscreenshotas
		File src = ewf.getScreenshotAs(OutputType.FILE);
		// define the destination to store ss
		File dest = new File("./Screenshots/selenium5ss.png");
		// store the ss into destination
		Files.copy(src, dest);

	}

}
