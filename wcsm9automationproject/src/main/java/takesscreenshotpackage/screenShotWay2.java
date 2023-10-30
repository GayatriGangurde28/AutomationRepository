package takesscreenshotpackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class screenShotWay2 {

	public static void main(String[] args) throws IOException {
		// upcast into remotewebdriver class
		RemoteWebDriver driver = new ChromeDriver();
		// To launch the browser
		// WebDriver driver = new ChromeDriver();
		// to maximize the browser
		driver.manage().window().maximize();
		// to apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// to launch the web application
		driver.get("https://www.selenium.dev/");
		// upcast into remote webdriver class

		// call the method
		File src = driver.getScreenshotAs(OutputType.FILE);
		// define way/path for storing ss
		File dest = new File("./Screenshots/selenium2ss.png");
		// storing ss in dest
		Files.copy(src, dest);

		driver.close();

	}

}
