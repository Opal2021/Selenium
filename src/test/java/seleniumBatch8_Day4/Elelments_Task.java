package seleniumBatch8_Day4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elelments_Task {

WebDriver driver;
	
	@Before
	
	public void openBrowers() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
		
	 @Test
	    public void task1() {

	        // logs in
	        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	        driver.findElement(By.id("btnLogin")).click();

	        // navigate to nationalities
	        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	        driver.findElement(By.id("menu_admin_nationality")).click();

	        List<WebElement> nationalities = driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr"));
	        
	        List<WebElement> nationalitiesCheckbox = driver
	                .findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[1]"));

//	        for(WebElement nation:nationalities) {
//	            System.out.println(nation.getText());
//	            
//	            if(nation.getText().contains("American")) {
//	                nation.click();
//	            }
//	        }

	        for (int i = 0; i < nationalities.size(); i++) {

	            System.out.println(nationalities.get(i).getText());

	            if (nationalities.get(i).getText().contains("Hungarian")) {

	                nationalitiesCheckbox.get(i).click();

	            }

	        }

	        // checkbox xpath -- //*[@id="resultTable"]/tbody/tr/td[1]

	    }
	
	
	
	
}
