package seleniumBatch8_day2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homework_Automated {

//	1) Open the browser
//
//	2) Enter the URL "http://practice.automationtesting.in/"
//	3) Click on My Account Menu
//	-Register if do not have username/password
//	4) Enter registered username in username textbox
//	5) Enter password in password textbox
//	6) Click on login button
//	7) User must successfully login to the web page

	
	WebDriver driver;
	
	@Before
	
	public void openBrowser() {
	
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("http://practice.automationtesting.in/");
	
	driver.manage().window().maximize();
	
	
	
	}
	
	
	@Test
	
	public void loginToAT() {
		
		//driver.findElement(By.xpath("//a[text(My Account)")).click();
		
	driver.findElement(By.xpath("//a[@href='http://practice.automationtesting.in/my-account/']")).click();
	
	driver.findElement(By.xpath("//*[@id='username']")).sendKeys("abc2020@gmail.com");
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("comptes2022");
	
	driver.findElement(By.xpath("//input[@name='login']")).click();
	
	driver.findElement(By.xpath("//a[@href='http://practice.automationtesting.in/my-account/customer-logout/']")).click();
	
	
	
	}
	
	
	@After
	public void closeBrowser() {
		driver.close();
	}
}
