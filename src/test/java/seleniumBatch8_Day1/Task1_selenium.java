package seleniumBatch8_Day1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1_selenium {

	
WebDriver driver;
	
	@Before
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		// Using get() method to open a webpage
		driver.manage().window().maximize();

	}

	@Test
	public void test1() {
//		.get(URL);
//		.getTitle();
//		.getCurrentUrl();
//		.getPageSource();
//		.chrome.manage().window().maximize();


		String title = driver.getTitle();
		System.out.println("This is the title of the Page -- " + title);
		
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("This is the current URL of the page -- " + currentURL);
		
		String techCircleSchoolURL = "https://www.techcircleschool.com";
		driver.navigate().to(techCircleSchoolURL);
		
		title = driver.getTitle();
		System.out.println("This is the title of the Page -- " + title);
		
		driver.navigate().back(); //navigate back to youtube
		System.out.println("we are here at this page for the secondTime");
		
		driver.navigate().forward(); //navigate me again to techcircle site
		System.out.println("we went forward to techcircle site again");
		
		
//		.navigate().back();
//		.navigate().forward();
//
//		driver.close(); //closes current browser
//		driver.quit();  
		
	}

	@After
	public void closeBrowser() {
		driver.close();
	}
	
}
