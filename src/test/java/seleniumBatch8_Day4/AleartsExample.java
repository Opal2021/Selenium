package seleniumBatch8_Day4;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AleartsExample {

WebDriver driver;
	
	@Before
	
	public void openBrowers() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
		
		   @Test
		    public void aleartBox1() {
		    
	WebElement custIdInputBox = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
	
	WebElement submitButton = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
	
	String custId = "4567898656";
	
	custIdInputBox.sendKeys(custId);
	
	submitButton.click();
	
	driver.switchTo().alert().accept();
	
	String  aleartText = driver.switchTo().alert().getText();
	
	System.out.println(aleartText);
	
	driver.switchTo().alert().accept();
	
		   }
	
	
	}
