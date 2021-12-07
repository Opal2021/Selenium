package seleniumBatch8_Day4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	
	WebDriver driver;

    @Before
    public void openBrowser() {

        WebDriverManager.chromedriver().setup();
        
        driver = new ChromeDriver();
        
        driver.get("https://www.spicejet.com/");
        
        driver.manage().window().maximize();
       

    }
    
    @Before
    
    @Ignore
    @Test
    
    public void staticDropdownTest() {
    
    driver.findElement(By.xpath("//input[@autocapitalize='sentences']")).click();
	
	driver.findElement(By.xpath("")).click();
	
	
	
     }
	
    @Ignore
     @Test
     public void staticDropdowTest2() {
        driver.get("https://www.amazon.com");
       
        WebElement allDropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        
        Select select = new Select(allDropdown);
        
        select.selectByIndex(5); // index start from 0
       
        select.selectByValue(null);
       
        select.selectByVisibleText("Baby");
        
       
        
     }
	
	@Ignore
     @Test
     public void dynamicSelect() {
       
    	 driver.get("https://www.makemytrip.com/");
       
    	 By fromCity = By.xpath("//input[@data-cy='fromCity']");
       
    	 By inputFormCity = By.xpath("//input[@placeholder='From']");
       
    	 String cityName = "indonesia";
        
    	 By airport = By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']//div[@class='makeFlex hrtlCenter']");
        
    	 driver.findElement(fromCity).click();
       
    	 driver.findElement(inputFormCity).sendKeys(cityName);
       
    	 driver.findElement(airport).click();
     }
	
	 @Test
	   public void verifySearchBtn() {
	      driver.get("https://www.makemytrip.com/");
	      WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a"));
	      Assert.assertEquals("SEARCH",button.getText());
	      Assert.assertTrue(button.getText().equalsIgnoreCase("search"));
	      Assert.assertFalse(4<0);
	      System.out.println("This is the end of the test");
	   }

	   @Test
	   public void softAssert() {
	      driver.get("https://www.makemytrip.com/");
	      WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a"));
	      if (button.getText().equals("foo"))
	         System.out.println("this test is pass");
	      else System.out.println("This is failed Test");
	      System.out.println("This is the end of the test");
	   }


	 @Test
	   public void selectClass() {
	      driver.get("https://www.amazon.com/");
	      WebElement allDropdown = driver.findElement(
	         By.xpath("//select[@id='searchDropdownBox']"));
	      Select select = new Select(allDropdown);
	      select.selectByIndex(5); // index start from 0
	      select.selectByValue("search-alias=mobile-apps");
	      select.selectByVisibleText("Baby");
	   }
	
}
