package seleniumBatch8_Day4;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {

	WebDriver driver;

    @Before
    public void openBrowser() {

        WebDriverManager.chromedriver().setup();
        
        driver = new ChromeDriver();
        
        driver.get("http://automationpractice.com/index.php");
        
        driver.manage().window().maximize();
       

    }
    
     @Test
    public void testTask() {
    

    	//List<WebElement> elementName = driver.findElements(By.LocatorStrategy("LocatorValue"));
	
    	List <WebElement> dresslist = driver.findElements(By.xpath("//ul[@id='homefeatured']/li[*]/div/div[2]/h5/a"));
	
    	System.out.println("There are "+ dresslist.size());

	
    	for (int i = 0; i < dresslist.size();i++){
	
    		//System.out.println("The dress name : " + dresslist.get(i).getText());
	
    		if(dresslist.get(i).getText().startsWith("B")){
	
    			dresslist.get(i).click();

	          }
	       }
	
    }
}//end class
	
	