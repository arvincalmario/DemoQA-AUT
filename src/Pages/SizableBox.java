package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SizableBox {
	
	public void resizableBox (WebDriver driver) throws InterruptedException {
		
		System.out.println("Starts resizing");
		Actions action = new Actions(driver);
		
		WebElement resizeRestriction = driver.findElement(By.xpath("//*[@id=\"resizableBoxWithRestriction\"]/span"));
		action.clickAndHold(resizeRestriction).moveByOffset(400, 300).perform();

		System.out.println("Resizing complete");
		Thread.sleep(500);
	}

}
