import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Accordian;
import Pages.Form;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]")));
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//NAVIGATE TO FORMS PAGE
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]")).click();	
		wait.until(ExpectedConditions.urlToBe("https://demoqa.com/forms"));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li/span")).click();
		wait.until(ExpectedConditions.urlToBe("https://demoqa.com/automation-practice-form"));
		
		Form form = new Form();
		form.formfill(driver);
		
		//NAVIGATE TO ACCORDION
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/span/div")).click();
		driver.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();
		
		Accordian accordion = new Accordian();
		accordion.accordionTest(driver);
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
