package seleniumBatch8_day2;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangeHRM_Locator {

	
WebDriver driver;
	
	@Before
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();

	}

	
	
	
	@Test
	public void loginToHRM() {
		
		
		// Username : Admin | Password : admin123 )

		//input username
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//input password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//press login button
		driver.findElement(By.id("btnLogin")).click();
			
	
	
	//click on PIM tab
			driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
				//						//*[@id="menu_pim_viewPimModule"]/b
			
			//click add button (green)
			
			driver.findElement(By.cssSelector("#btnAdd")).click();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
