package seleniumBatch8_day2;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation_Task {

	
	WebDriver driver;

	@Before
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Index.html");
		
		driver.manage().window().maximize();

	}
	
	
//	@Test
//	
//	public void 
//	
//	
	
	
	
	
	
	
	
}
