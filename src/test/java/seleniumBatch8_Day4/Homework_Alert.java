package seleniumBatch8_Day4;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homework_Alert {
	
//	Task B
//	1. find any website that has alert pop up box
//	2. using the alert lecture from today - take care of the alert using 'accept', ' dismiss', 'gettext'

	

WebDriver driver;
	
	@Before
	
	public void openBrowers() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
	}
		
		   @Test
		    public void aleartBox1() throws InterruptedException {
		    
	WebElement ClickMe1 = driver.findElement(By.xpath("//button[@id='alertButton']"));		   
			   
	ClickMe1.click();
	
	Thread.sleep(3000);
	
    String  aleartText = driver.switchTo().alert().getText();
	
	System.out.println(aleartText);
	
	driver.switchTo().alert().accept();
	
	Thread.sleep(5000);
		   }
	
	 @Test
	    public void aleartBox2() throws InterruptedException {
	    
	
	WebElement ClickMe2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
	
	ClickMe2.click();
	
	Thread.sleep(6000);
	
	driver.switchTo().alert().accept();
	
	Thread.sleep(5000);
	
	 }
	 
	 @Test
	    public void aleartBox3() throws InterruptedException {
		 
	WebElement ClickMe3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
	
	ClickMe3.click();
	
	Thread.sleep(3000);
	
	driver.switchTo().alert().dismiss();
	
	Thread.sleep(5000);
	
	 }
	
	 @Test
	    public void aleartBox4() throws InterruptedException {
		 
	WebElement ClickMe4 = driver.findElement(By.xpath("//button[@id='promtButton']"));
	
	ClickMe4.click();
	
	Thread.sleep(3000);
	
	driver.switchTo().alert().sendKeys("Opal");
	
	driver.switchTo().alert().accept();
	
 }
	
	 @After
	
            public void afterMethod() {
	
	            driver.close();
	
           }
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

