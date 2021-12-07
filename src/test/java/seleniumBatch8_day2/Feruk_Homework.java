package seleniumBatch8_day2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Feruk_Homework {

	        //Go to Amazon.com
			//Max the Browser
			//Search "anything"
		    //click the search button	
		    //navigate to youtube
		    //search your favorite video/song
			//and get the tittle
	
	
	WebDriver driver;
	
	@Before
	
	public void openBrowers() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://amazon.com/");
		
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	
	public void search() {
	
	WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	
	WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	
	String word = "ipad";
	
	searchBox.sendKeys(word);
	
	searchButton.click();
	
	
	driver.navigate().to("https://www.youtube.com/");
	
	String word2 = "billboard top 50";
	
	WebElement searchYoutubeBox  = driver.findElement(By.xpath("//input[@id='search']"));
	
	searchYoutubeBox.sendKeys(word2);
	
	WebElement youtubeSearchBox = driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-searchbox']"));
	
	youtubeSearchBox.click();
	
	}
	
	
	@After
	
	public void closeBrowser() {
		
		driver.quit();
	}
	
}
