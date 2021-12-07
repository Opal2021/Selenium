package seleniumBatch8_Day4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Park_Assert {

		WebDriver driver;

	//	@BeforeTest
		
		public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		}

	//	@Test (enabled = false)
		public void hardAssertion() throws InterruptedException {
		
			WebElement womenTab = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		
			String expectedResult = womenTab.getText();
			
		    String actualResult = "WOMEN";
		
			Assert.assertEquals(actualResult,expectedResult);
			
	//	Assert.assertTrue(womenTab.isDisplayed(),"Women tab is not visible");
		
		Thread.sleep(3000);

		}

		@Test
		public void softAssertion() {
		//instanciate
	
//				SoftAssert softAssertion = new SoftAssert();
		
			//System.out.println("softAssert");
		
			WebElement signInBtn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")); // given a wrong locator!
	
//			softAssertion.assertTrue(signInBtn.isDisplayed(), "Sign in button is not visible");
		
			System.out.println("Eventhough an assertion fails, soft-assertion is allowing the program to execute the entire script");
	
//				softAssertion.assertAll();

		}


	//	@AfterTest(enabled = true)
		public void afterMethod() {
		driver.close();
		}


		}// end class
		
	
