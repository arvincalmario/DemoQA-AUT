import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Accordian;
import Pages.AutoComplete;
import Pages.Form;
import Pages.SizableBox;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		
		// REMOVES INFORBAR SO THAT THE BUTTONS CAN BE CLICKED	
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		WebDriver driver = new ChromeDriver(options);
		
		//START
		//WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]")));
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//FORMS DROPDOWN LIST
		//NAVIGATE TO FORMS PAGE
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]")).click();	
		wait.until(ExpectedConditions.urlToBe("https://demoqa.com/forms"));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li/span")).click();
		wait.until(ExpectedConditions.urlToBe("https://demoqa.com/automation-practice-form"));
		
		Form form = new Form();
		form.formfill(driver);
		
		//WIDGETS DROPDOWN LIST
		//NAVIGATE TO ACCORDION
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/span/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[1]")).click();
		wait.until(ExpectedConditions.urlToBe("https://demoqa.com/accordian"));
		
		Accordian accordion = new Accordian();
		accordion.accordionTest(driver);
		
		//NAVIGATE TO AUTOCOMPLETE
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[2]")).click();
		wait.until(ExpectedConditions.urlToBe("https://demoqa.com/auto-complete"));
		
		AutoComplete autoComplete = new AutoComplete();
		autoComplete.autoCompleteTest(driver);
		
		//INTERACTIONS DROPDOWN LIST
		//NAVIGATE TO RESIZEABLE
		WebElement interact = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[5]/span/div"));
		Actions actions = new Actions(driver);
		actions.moveToElement(interact);
		Thread.sleep(500);
		interact.click();
		Thread.sleep(3000);
		
		WebElement dragabble = driver.findElement(By.xpath("//*[@id=\"item-4\"]"));
		actions.moveToElement(dragabble);
		Thread.sleep(500);
		System.out.println("Checking draggable complete");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[5]/div/ul/li[3]")).click();
		wait.until(ExpectedConditions.urlToBe("https://demoqa.com/resizable"));
		
		SizableBox sizableBox = new SizableBox();
		sizableBox.resizableBox(driver);
		
		//CLOSES THE TEST
		Thread.sleep(3000);
		driver.close();

	}

}
