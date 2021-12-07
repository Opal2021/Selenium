package seleniumBatch8_Day3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes_Task {

	
WebDriver driver;
	
	@Before
	
	public void openBrowers() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		
	}
	
	
	@Test
	
	public void RadioButtonTask() {
		
		WebElement checkboxes = driver.findElement(By.xpath("//*[text()='Checkboxes']"));
		
		checkboxes.click();
		
		Boolean checkBox1 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).isSelected();
		
		System.out.println("Checkbox number 1 should return  FALSE ======"+ checkBox1);
		
        Boolean checkBox2 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).isSelected();
		
		System.out.println("Checkbox number 2 should return  TRUE ======"+ checkBox2);
		
		
		
		
	}
	
	
	
	
	
	
	}
