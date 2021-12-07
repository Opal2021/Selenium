package seleniumBatch8_Day4;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homework_FindElementsWithLoop {
	
//	Task A
//	1. go to https://phptravels.com/demo
//	2. login using Agent Front End credentials
//	3. Using List 'WebElements' -- store the left Unordered list tab and loop through
//	to find element that contains "Logout" text. and click on it to logou
//	4. Confirm, user is logged out
//
//	Task B
//	1. find any website that has alert pop up box
//	2. using the alert lecture from today - take care of the alert using 'accept', ' dismiss', 'gettext'

	
	//*[@id="Main"]/section[1]/div/div/div[3]/div/div/div[2]/div/div/div[1]/div/a/small
	
//	agent@phptravels.com
//	Password demoagent
	
	//input[@name='email']
	
WebDriver driver;
	
	@Before
	
	public void openBrowers() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.phptravels.net/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}

	 @Test
	   
	 public void Login() throws InterruptedException {
	
	WebElement emailBox = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input"));
	
	emailBox.sendKeys("agent@phptravels.com");
	
	WebElement passwordBox = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input"));
	
	passwordBox.sendKeys("demoagent");
	
	WebElement submitBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
	
	submitBtn.click();
	
	
	List <WebElement>  dashBoard = driver.findElements(By.xpath("//div[@class='sidebar-menu-wrap']/ul/li[*]/a/i"));
	 
	Thread.sleep(3000);
	
	 for(int i = 0 ; i < dashBoard.size();i++) {
		 
		// System.out.println(findDB.getSize());
		 
		 //System.out.println(findDB.getText());
		 
	 if (dashBoard.get(i).getText().contains(" Logout")) {

		 dashBoard.get(i).click();
		  }
		 } 
	}
	
	@Test 
	 public void verifyLoginBtn() {	 
	
	WebElement logintext =   driver.findElement(By.xpath("//h5[text()='Login']"));
	
	String actualResult = logintext.getText();
	
	String expectResult = "Login";
	
	 Assert.assertEquals(actualResult, expectResult);
	
	 
	 }//end method
	
	 @After
		
	 public void afterMethod() {
		
		 driver.close();
		
	 }
}//end class
