package seleniumBatch8_Day5;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class w3School_Task {
	
	

	// driver.switchTo().frame("value name of the frame or ID of the frame");
	// driver.switchTo().frame(WebElement);
	// driver.switchTo().frame(0);
	
	//driver.switchTo().defaultContent();
	//driver.switchTo().parenrFrame();
	
	WebDriver driver;
	
	@Before
	
	public void OpenBrowers() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	@Test
	
	public void iframe() {
		
		driver.switchTo().frame("iframeResult");
		
		String TextFrame1 = driver.findElement(By.xpath("/html/body/h1")).getText();
		
		System.out.println(TextFrame1);
		
	//	driver.switchTo().defaultContent();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
