package takesscreenshotpackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay1 {

	public static void main(String[] args) throws IOException {
		//to launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
        //to maximize the browser
		driver.manage().window().maximize();
		//to apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to launch the web application
		driver.get("https://www.selenium.dev/");
		//call the method
		File src = driver.getScreenshotAs(OutputType.FILE);
		//define the destination 
		File dest = new File("./Screenshots/selenium3ss.png");
		//store ss in destination
		Files.copy(src, dest);
				
		driver.close();	
	}

}
