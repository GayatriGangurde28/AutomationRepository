package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namelocator {


		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver(); 
			// maximize the browser
			driver.manage().window().maximize();
			// launch the actitimelogin Page
			driver.get("http://gayatri-laptop:8080/login.do");
			
				Thread.sleep(2000);
				// identify usernameTB and pass input as admin
				driver.findElement(By.name("username")).sendKeys("admin");
				Thread.sleep(2000);
				// identify PasswordTB and pass input as manager
				driver.findElement(By.name("pwd")).sendKeys("manager");

	}

}
