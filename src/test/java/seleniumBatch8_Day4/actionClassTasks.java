package seleniumBatch8_Day4;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionClassTasks {

WebDriver driver;
Actions action;
	
	@Before
	
	public void openBrowers() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
	}
		
		   @Test
		    
		   public void mouseOver() throws InterruptedException  {
			   
	//MouseOver		   
			   
    Actions action = new Actions(driver);
	
	WebElement accounts_ListsButton = driver.findElement(By.xpath(""));
	
	action.moveToElement(accounts_ListsButton).build().perform();
	
	
    //Context Click
	
	WebElement returns_OrderButton = driver.findElement(By.xpath(""));
	
	action.contextClick(returns_OrderButton).build().perform();
	
	//Search and keyboard interaction ENTER
	
	WebElement searchBox = driver.findElement(By.xpath(""));
	
	String searchItem ="Iphone";
	
	action.sendKeys(searchBox, searchItem,Keys.ENTER).build().perform();
	
	Thread.sleep(3000);
	
	searchBox = driver.findElement(By.xpath(""));
	
	searchBox.clear();
	
	searchBox.sendKeys("Android Phone",Keys.ENTER);
	
		   }
	
	@After
	
	public void afterMethod () {
		
		driver.close();
	}
	
}
