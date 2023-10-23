package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_GetSize_GetRectMethod {


	public static void main(String[] args) {
		//to launch the chrome browser
	WebDriver driver = new ChromeDriver();
	// to maximize the browser
	driver.manage().window().maximize();
	// apply implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	// to launch the web application
	driver.get("http://demoapps.qspiders.com/");
	
	//identify the email textbox 
	WebElement emailTextBox = driver.findElement(By.cssSelector("input#email"));
	
	//get the location of email TB
	Point loc = emailTextBox.getLocation();
	
	int xaxis = loc.getX();
	int yaxis = loc.getY();
	
	System.out.println("location of email textbox :"+xaxis+" "+yaxis);
	
	//getsize of EmailTB
	Dimension size = emailTextBox.getSize();
	
	int height = size.getHeight();
	int width = size.getWidth();
	 
	System.out.println("size of email textbox:"+height+" "+width);
	
	//get position and size of email textbox by using getrect method
	Rectangle rect = emailTextBox.getRect();
	System.out.println(rect.getX()+ ":" +rect.getY());
	System.out.println(rect.getHeight()+ ":" +rect.getWidth());
	
	

	}

}
