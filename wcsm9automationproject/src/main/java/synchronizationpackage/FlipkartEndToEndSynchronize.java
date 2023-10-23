package synchronizationpackage;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartEndToEndSynchronize {

	public static void main(String[] args) {
		// // tO launch the chrome browser
		WebDriver driver =new ChromeDriver();
		// to maximize the browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to launch the flipkart web application
		driver.get("https://www.flipkart.com/");
		// To handle the login pop up
	    driver.findElement(By.xpath("//span[text()='✕']")).click();
	    //To identify search box pass iphone as input
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Iphone");
		//identify search icon and click
		driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
		// get the address of parent window
		String parentHandle = driver.getWindowHandle();
		//identify second iphone and click
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
		// get address of all windows
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
			if (!parentHandle.equals (wh)) {
				driver.switchTo().window(wh);
			}
		}
		
		//identify color and click
		driver.findElement(By.xpath("//ul[@class='_1q8vHb']/descendant::li[@id='swatch-2-color']")).click();
		//identify storage and click
		driver.findElement(By.xpath("//a[text()='256 GB']")).click();
		// identify pincode
		driver.findElement(By.id("pincodeInputId")).click();
		// enter pincode
		driver.findElement(By.id("pincodeInputId")).sendKeys("411033");
		
		// identify add to cart button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		// we can use javascriptexecutor interface
		//identify remove button
		driver.findElement(By.xpath("//div[text()='Remove']")).click();
		//identify remove popup
		driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();
	}

}
