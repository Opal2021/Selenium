package seleniumBatch8_Day5;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_MakeMyTrip {

WebDriver driver;
	
	@Before
	
	public void OpenBrowers() {
		
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("https://www.makemytrip.com/");
		
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
		
	}
	
	@Test
	
	public void task1() {
	
	WebElement fromBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label/span"));
	
	fromBtn.click();
	
	WebElement cityInputField = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
	
	cityInputField.sendKeys("Seattle,United States");
	
	WebElement fristSuggestItem = driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]"));
	
	fristSuggestItem.click();
	
	WebElement toInputField = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
	
	toInputField.sendKeys("URUMQI,China");
	
	fristSuggestItem = driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]"));
	
	fristSuggestItem.click();
	
	WebElement date = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[5]/div/p"));
	
	date.click();
	
	WebElement returnDate = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[4]/label/p[1]"));
			
	returnDate.click();
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
