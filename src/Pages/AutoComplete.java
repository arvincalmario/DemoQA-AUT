package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AutoComplete {
	
	public void autoCompleteTest(final WebDriver driver) throws InterruptedException {
		
		System.out.println("Start Auto-Complete page");
		
		driver.findElement(By.xpath("//*[@id=\"autoCompleteMultipleContainer\"]/div")).click();
		Thread.sleep(500);
			
		driver.findElement(By.xpath("//*[@id=\"autoCompleteSingleContainer\"]/div/div[1]")).click();
		Thread.sleep(500);
		
		System.out.println("Auto-Complete page done");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/span/div")).click();
		Thread.sleep(500);
	}

}
