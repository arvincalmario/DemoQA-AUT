package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Accordian {
	
	public void accordionTest (WebDriver driver) throws InterruptedException {
		
		System.out.println("Starts Accordion");
		
		driver.findElement(By.id("section1Heading")).click();
		Thread.sleep(500);
		driver.findElement(By.id("section2Heading")).click();
		Thread.sleep(500);
		driver.findElement(By.id("section3Heading")).click();
		Thread.sleep(500);
		
		System.out.println("Accordion page done");
	}

}
