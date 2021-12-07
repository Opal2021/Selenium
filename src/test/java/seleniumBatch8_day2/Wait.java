package seleniumBatch8_day2;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait {

	WebDriver driver;
	
	@Before
	
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		
	}
	
	
	@Test
	
	public void test1() throws InterruptedException {
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		
		searchBox.clear();
		
		searchBox.sendKeys(Keys.F5);
		
		String word = "Selenium";
		
		searchBox.sendKeys(word);
		
		Thread.sleep(5000);
		
		searchBox.sendKeys(Keys.ARROW_DOWN);
		
		searchBox.sendKeys(Keys.ARROW_DOWN);
		
		searchBox.sendKeys(Keys.ARROW_DOWN);
		
		searchBox.sendKeys(Keys.ENTER);
		
	    driver.navigate().refresh();
		
		//searchBox.sendKeys(Keys.F5);It will throw StaleException
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
