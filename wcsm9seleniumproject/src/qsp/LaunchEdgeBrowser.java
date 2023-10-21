package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// to launch Edge browser we need to create object of EdgeDriver();
        
		WebDriver driver=new EdgeDriver();
		
		// to maximize the edge Browser
		driver.manage().window().maximize();
        System.out.println("Edge is Open!!");
        
        //to stop execution for 2sec
        Thread.sleep(2000);
       
        //How to close Edge Browser
        driver.close();

	}

}
