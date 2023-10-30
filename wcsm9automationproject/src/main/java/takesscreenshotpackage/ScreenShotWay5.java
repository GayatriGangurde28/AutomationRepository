package takesscreenshotpackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay5 {

	public static void main(String[] args) throws IOException {
		// To launch the browser
		WebDriver driver = new ChromeDriver();
		// to maximize the browser
		driver.manage().window().maximize();
		// to apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// to launch the web application
		driver.get("https://www.selenium.dev/");

		// Take screenshot of the webpage
		TakesScreenshot ts = (TakesScreenshot) driver;
		// call the method
		File src = ts.getScreenshotAs(OutputType.FILE);
		// define way for storing ss
		File dest = new File("./Screenshots/seleniumss.png");

		// store ss into dest
		Files.copy(src, dest);

		driver.close();
	}

}
