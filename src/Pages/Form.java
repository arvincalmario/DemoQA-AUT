package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Form {
	
	public void formfill(WebDriver driver) throws InterruptedException {
		
		System.out.println("Fill out form starts");
		//FIRST / LAST /EMAIL
		driver.findElement(By.id("firstName")).sendKeys("ArvinTest");
		driver.findElement(By.id("lastName")).sendKeys("TestData");
		driver.findElement(By.id("userEmail")).sendKeys("testdata@contoso.com");
		
		//GENDER
		WebElement radio1 = driver.findElement(By.id("gender-radio-1"));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radio1);
		Thread.sleep(500);		
		WebElement radio2 = driver.findElement(By.id("gender-radio-2"));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radio2);
		Thread.sleep(500);	
		WebElement radio3 = driver.findElement(By.id("gender-radio-3"));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radio3);
		Thread.sleep(500);	
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radio1);
		
		//DATE OF BIRTH
		driver.findElement(By.id("userNumber")).sendKeys("1234567890");
		driver.findElement(By.id("dateOfBirthInput")).click();		
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/button[2]")).click();		
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/button[1]")).click();

		driver.findElement(By.className("react-datepicker__year-select")).click();
		driver.findElement(By.cssSelector("option[value='1901']")).click();
		Thread.sleep(500);
		driver.findElement(By.className("react-datepicker__month-select")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("option[value='10']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[6]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body")).click();
		Thread.sleep(500);
		
		//SUBJECTS
		driver.findElement(By.cssSelector(".subjects-auto-complete__value-container.subjects-auto-complete__value-container--is-multi.css-1hwfws3")).click();
		Thread.sleep(500);
		driver.findElement(By.id("subjectsInput")).sendKeys("s");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("div#react-select-2-option-0")).click();
		Thread.sleep(500);
		driver.findElement(By.id("subjectsInput")).sendKeys("e");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("div#react-select-2-option-5")).click();
		driver.findElement(By.id("subjectsInput")).sendKeys("physics");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("div#react-select-2-option-0")).click();
		Thread.sleep(500);
		
		//HOBBIES
		WebElement hobby1 = driver.findElement(By.id("hobbies-checkbox-1"));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", hobby1);
		Thread.sleep(500);	
		WebElement hobby2 = driver.findElement(By.id("hobbies-checkbox-2"));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", hobby2);
		Thread.sleep(500);
		WebElement hobby3 = driver.findElement(By.id("hobbies-checkbox-3"));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", hobby3);
		Thread.sleep(500);	
		
		//UPLOAD
		driver.findElement(By.cssSelector("input#uploadPicture")).sendKeys("C:\\Users\\Arvin Almario\\eclipse-workspace\\DemoQA AUT\\file\\dog.jpg");
		Thread.sleep(500);
		
		//ADDRESS
		driver.findElement(By.id("currentAddress")).sendKeys("This is a test data for automation purposes");
		Thread.sleep(500);
		
		//STATE AND CITY
		driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"react-select-3-option-0\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"react-select-4-option-0\"]")).click();
		Thread.sleep(1000);
		
		System.out.println("Form complete");
		
		//BUG IN THE SUBMIT BUTTON AND NOT USERFRIENDLY
//		driver.findElement(By.xpath("//*[@id=\"userForm\"]/div[11]/div")).click();
//		Thread.sleep(500);
//		
//		WebElement closeModal = driver.findElement(By.cssSelector("button#closeLargeModal"));
//		closeModal.click();
		
		Thread.sleep(500);
	}

}
