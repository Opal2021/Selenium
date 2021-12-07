package seleniumBatch8_Day4;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandleTask {

WebDriver driver;
	
	@Before
	
	public void openBrowers() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.phptravels.com/demo");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
	}
	 @Test
	    public void windoHandleTask() throws InterruptedException {

	        //get title
	       
		    System.out.println("Before switching to child Window -- " + driver.getTitle());

	        Thread.sleep(2000);

	        //get text to verify
	        String agentFrontEnd_text = driver
	                .findElement(By.xpath("//div[3]//div[1]//div[1]//div[2]//h3[1]")).getText();


	        System.out.println(" Text of the agent title -- "+agentFrontEnd_text);
	        
	        //clicking agent button
	        driver.findElement(By.xpath("//body[1]/div[2]/main[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
	        

	        
	        //setting up window handles
	        Set<String> ids = driver.getWindowHandles();

	        Iterator<String> iterator = ids.iterator();

	        String parentTab = iterator.next();
	        String secondTab = iterator.next();

	        
	        //switching to child window
	        driver.switchTo().window(secondTab);

	        System.out.println("After Switching to second/child Tab -- " + driver.getTitle());

	        
	        //switching back to parent window
	        driver.switchTo().window(parentTab);
	        
	        
	        Thread.sleep(2000);
	        //trying to retrieve the same text on parent window
	        agentFrontEnd_text = driver
	                .findElement(By.xpath("//*[@id=\"Main\"]/section[1]/div/div/div[3]/div/div/div[2]/h3")).getText();

	        System.out.println(" Text of the agent title -- "+agentFrontEnd_text);
	        
	        System.out.println("After switching back to Parent -- " + driver.getTitle());


	    }
 }
	
