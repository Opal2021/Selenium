package seleniumBatch8_Day4;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Explicit {

WebDriver driver;
	
	@Before
	
	public void openBrowers() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@Test
    public void ExplicitWaitTask() {
        
       
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
       
        
        
//        String word = "ipad";
//        
//        searchBox.sendKeys(word);
        
        WebDriverWait wait=new WebDriverWait(driver, 30);
        
        
        WebElement waitAndClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//a[@data-csa-c-id='m3u2q4-oee9ja-ayrpmn-gr4f2']")));
        

        waitAndClick.click();
        
        
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
