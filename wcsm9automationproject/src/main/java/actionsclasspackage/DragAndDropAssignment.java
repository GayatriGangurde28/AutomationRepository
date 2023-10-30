package actionsclasspackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAssignment {

	public static void main(String[] args) throws InterruptedException {
		// To launch the browser
		  WebDriver driver = new ChromeDriver();
		  //to maximize the browser
		  driver.manage().window().maximize();
		  //to apply implicit wait
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  // to launch the web application
		  driver.get("https://demo.guru99.com/test/drag_drop.html");
		  //identify the source/drag elements
		  WebElement src1 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		  WebElement src2 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		  WebElement src3 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		  WebElement src4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		  //identify the drag elements
		  
		  WebElement tar1 = driver.findElement(By.xpath("//div[@id='shoppingCart3']"));
		  WebElement tar2 = driver.findElement(By.xpath("(//div[@id='shoppingCart4'])[2]"));
		  WebElement tar3 = driver.findElement(By.xpath("//div[@id='shoppingCart1']"));
		  WebElement tar4 = driver.findElement(By.xpath("//div[@id='shoppingCart4']"));
		  
		  Actions act = new Actions(driver);
		  Thread.sleep(2000);
		  act.dragAndDrop(src1, tar1).perform();
		  Thread.sleep(2000);
		  act.dragAndDrop(src2, tar2).perform();
		  Thread.sleep(2000);
		  act.dragAndDrop(src3, tar3).perform();
		  Thread.sleep(2000);
		  act.dragAndDrop(src4, tar4).perform();
		  
           driver.close();
	}

}
