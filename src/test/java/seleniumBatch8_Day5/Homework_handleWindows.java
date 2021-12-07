package seleniumBatch8_Day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homework_handleWindows {

//	1. open URL
//	2. click and open each child window (there are 4)
//	3. store all windowhandles in Set<String>
//	4. iterate/loop and if its equal to 'Supplier Login', Login using valid credential
//	
	
	
	WebDriver driver;
	
	@Before
	
	public void OpenBroswer() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://phptravels.com/demo");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}
	
	@Test
	
	public void   OpenAllWindows() {
		
		String parentTab = driver.getWindowHandle();

        System.out.println("Parent Tab Id is: " + parentTab);

    WebElement CustomerFrontEnd = driver.findElement(By.xpath("//*[@id=\"Main\"]/section[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/a/small"));	
	
	CustomerFrontEnd.click();
	
	WebElement AgentFrontEnd = driver.findElement(By.xpath("//*[@id=\"Main\"]/section[1]/div/div/div[3]/div/div/div[2]/div/div/div[1]/div/a/small"));	
	
	AgentFrontEnd.click();
	
	WebElement AdminBackEnd = driver.findElement(By.xpath("//*[@id=\"Main\"]/section[1]/div/div/div[4]/div/div/div[2]/div/div/div[1]/div/a/small"));	
	
	AdminBackEnd.click();
	
	WebElement SupplierBackEnd = driver.findElement(By.xpath("//*[@id=\"Main\"]/section[1]/div/div/div[5]/div/div/div[2]/div/div/div[1]/div/a/small"));	
	
	SupplierBackEnd.click();
	
	
	Set <String> allTabs = driver.getWindowHandles();
	
	System.out.println(allTabs.size());
	
	
	Iterator<String> iterator = allTabs.iterator();

   String Tab2 = iterator.next();

   driver.switchTo().window(Tab2);

   String tap2Title = driver.getTitle();
   
    String Tab3 = iterator.next();
    
   driver.switchTo().window(Tab3);

   String tap3Title = driver.getTitle();
   
   String Tab4 = iterator.next();
   
   driver.switchTo().window(Tab4);

   String tap4Title = driver.getTitle();
   
    String Tab5 = iterator.next();
    
   driver.switchTo().window(Tab5);

   String tap5Title = driver.getTitle();
   
   List <String> allTapsTitel = new ArrayList<String>();
   
   allTapsTitel.add(tap2Title);
   allTapsTitel.add(tap3Title);
   allTapsTitel.add(tap4Title);
   allTapsTitel.add(tap5Title);
   
   String expectTitle = "Supplier Login";
   
   
   for(String allsTaps : allTapsTitel) {
	   
	 System.out.println(allsTaps);
	   
	 driver.switchTo().window(Tab3);   
	 }
   
	}
}
	
	
	
	

	
