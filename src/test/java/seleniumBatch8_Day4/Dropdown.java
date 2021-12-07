package seleniumBatch8_Day4;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	
	//input[@id='fromCity']
	
	
	//*[@id="root"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input
	
	//*[@id="react-autowhatever-1-section-0-item-0"]/div/div[1]/p[1]
	
	
	
WebDriver driver;
	
	@Before
	
	public void openBrowers() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
		
		   @Test
		    public void dynamicDropDown() {
		    
	driver.findElement(By.xpath("//input[@id='fromCity']")).click();
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("NYC");
	
	driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")).click();
	
	
	
	
	
	
		   }
	
	
	
}
