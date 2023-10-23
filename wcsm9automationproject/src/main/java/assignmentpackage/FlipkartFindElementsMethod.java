package assignmentpackage;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		// 
		WebDriver driver =new ChromeDriver();
		//
		driver.manage().window().maximize();
		//
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//
		driver.get("https://www.flipkart.com/");
		//handle pop up
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		//search for laptop in search box
		driver.findElement(By.name("q")).sendKeys("laptops");
		//search icon
		driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
		//identify brand
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		//pass input hp
		driver.findElement(By.xpath("//div[(@class='_3879cV'and text()='HP')]")).click();
		Thread.sleep(2000);
		
		
		//click on core i7
		driver.findElement(By.xpath("//div[@class='_3879cV']")).click();
		
		//operating system and select windows 11
		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']/descendant::div[text()='Operating System']")).click();
		//driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		driver.findElement(By.xpath("//div[@class='_3879cV' and text()='Windows 11']")).click();
		
		//select 4 and above rating 
		driver.findElement(By.xpath("//div[@class='_3879cV' and text()='4★ & above']")).click();
		
		//identify the name of the laptops
	       List<WebElement> allLaptops = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
	    
	    //identify the price of laptops
	       List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for(int i=0; i<allLaptops.size();i++)
		{
			String laptop =  allLaptops.get(i).getText();
			Thread.sleep(2000);
			for(int j=i; j<=i; j++)
			{
				String Price = allPrices.get(j).getText();
				Thread.sleep(2000);
				System.out.println(laptop+" :"+Price);
			}
		}
		
		

	}

}
