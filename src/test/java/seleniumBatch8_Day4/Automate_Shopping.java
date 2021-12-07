package seleniumBatch8_Day4;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate_Shopping {

	WebDriver driver;

    @Before
    public void openBrowser() {

        WebDriverManager.chromedriver().setup();
        
        driver = new ChromeDriver();
        
        driver.get("http://automationpractice.com");
        
          driver.manage().window().maximize();
       
      //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
  
    
    
    @Test
    public void testTask() {
    	
    	WebDriverWait wait = new WebDriverWait(driver,5); 
      
    	//or ElementToBeClickable
    	
    	                                                                              
    	
    	WebElement dressButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='block_top_menu']/ul/li[2]/a")));
    	
    	dressButton.click();
    	
    	WebElement item = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='replace-2x img-responsive']")));
    	
    	item.click();
    	
    	WebElement addToCartButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='box-cart-bottom']/div/p/button/span")));
    	
    	addToCartButton.click();
    	
    	WebElement checkOut1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='button-container']/a")));
    	
    	checkOut1.click();
    	
    	WebElement checkOut2 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='cart_navigation clearfix']/a")));
    	
    	checkOut2.click();
    	
	String element1 = driver.findElement(By.xpath("//*[text()='Authentication']")).getText();
        
   System.out.println(element1);
        
        
     }
    
 }//end class
	
	