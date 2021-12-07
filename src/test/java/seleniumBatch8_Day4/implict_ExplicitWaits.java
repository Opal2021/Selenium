package seleniumBatch8_Day4;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implict_ExplicitWaits {

WebDriver driver;
	
	@Before
	
	public void openBrowers() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://test.rubywatir.com/index.php");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@Test
    public void ExplicitWaitTask() {
        
        //clicks on 'Checkbox' link under Level1 tab on left
		
        driver.findElement(By.xpath("//div[@id='recent4']/ul/li[2]/a")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, 30);
        
        
        WebElement waitAndClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By
                
        		.xpath("//input[@value='soccer']")));
        
//        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/form/input[1]")).click();
    
        waitAndClick.click();
        
        
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
