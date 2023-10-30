package actionsclasspackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) throws InterruptedException {
		// To launch the browser
		  WebDriver driver = new ChromeDriver();
		  //to maximize the browser
		  driver.manage().window().maximize();
		  //to apply implicit wait
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  // to launch the web application
		  driver.get("http://demoapps.qspiders.com/");
		  //identify drag and drop and click
		  driver.findElement(By.xpath("//section[text()='Drag And Drop']")).click();
		  Thread.sleep(2000);
		 ////identify drag and drop and click
		  driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		  //store all the drag elements
		  WebElement src1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		  WebElement src2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
          WebElement src3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
          WebElement src4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
          
          //store all the drop element
         WebElement tar1 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[1]"));  
         WebElement tar2 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[1]")); 
         WebElement tar3 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[2]"));
         WebElement tar4 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[2]"));
         
         //perform drag and drop for mobile
         Actions act = new Actions(driver);
         act.dragAndDrop(src1, tar1).perform();
         Thread.sleep(2000);
         act.dragAndDrop(src2, tar2).perform();
         
       //perform drag and drop for laptop
         act.dragAndDrop(src3, tar3).perform();
         Thread.sleep(2000);
         act.dragAndDrop(src4, tar4).perform();
         
         driver.close();
	}

}
