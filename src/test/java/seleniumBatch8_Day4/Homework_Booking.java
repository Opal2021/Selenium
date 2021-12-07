package seleniumBatch8_Day4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homework_Booking {

	WebDriver driver;
	
	@Before
	
	public void openBrowser() {
	
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("https://www.phptravels.net/");
	
	driver.manage().window().maximize();
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement flightsButton = driver.findElement(By.xpath("//a[text()='flights']"));
	
	flightsButton.click();   
	
	}
	//@Ignore
	@Test
	
//	#1
//	- Click on 'Flight'
//	- Verify user should be able to see option to select 
//	'Flying Form', 'To Destination', 'Departure Date',
//	'Passengers','Search' button 
	
	public void test1() {
		
		 
		WebElement flyingFrom = driver.findElement(By.xpath("//label[text()='Flying From']"));
		
		Assert.assertEquals("Flying From", flyingFrom.getText());
		
		System.out.println(flyingFrom.getText());
		
		
        WebElement toDestination = driver.findElement(By.xpath("//label[text()='To Destination']"));
		
		Assert.assertEquals("To Destination", toDestination.getText());
		
		System.out.println(toDestination.getText());
		
		
		 WebElement departtureDate = driver.findElement(By.xpath("//label[text()='Departure Date']"));
			
	     Assert.assertEquals("Departture Date", departtureDate.getText());
			
		 System.out.println(departtureDate.getText());
			
	    
		 WebElement Passengers = driver.findElement(By.xpath("//label[text()='Passengers']"));
				
		 Assert.assertEquals("Passengers", Passengers.getText());
				
		 System.out.println(Passengers.getText());
				
				
		 WebElement searchButton = driver.findElement(By.xpath("//button[@id='flights-search']"));
					
		 Assert.assertEquals("Search", searchButton.getText());
					
		 System.out.println(searchButton.getText());
							
	}
		
	@Ignore
	@Test
//	#2
//	- Verify that user should be able to see dropdown
//	that contains 'Economy', 'Bussiness','First'
//	- Then select 'First'
//	- Verify that 'First' should be selected
		
	
	public void selectClass() {
		
        
		
		WebElement allDropdown = driver.findElement(By.xpath("//select[@id='flight_type']"));
		
		allDropdown.click();
		
		Select select = new Select(allDropdown);
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		
//		wait.until(ExpectedConditions.visibilityOf(allDropdown)).getText();
//
//		System.out.println(allDropdown.getText());
//		
		
		select.selectByVisibleText("First");
		

		WebElement Economy = driver.findElement(By.xpath("//*[@id=\"flight_type\"]/option"));
		
		Economy.getText();
		
		String expectedText = "Economy"	;
		
		if(expectedText.equals(Economy.getText())) {
			
			System.out.println("Pass");
			
		}else
			
			System.out.println("Fail");
		
       
		WebElement Business = driver.findElement(By.xpath("//*[@id=\"flight_type\"]/option[2]"));
		
		Business.getText();
		
		String expectedText2 = "Business"	;
		
		if(expectedText2.equals(Business.getText())) {
			
			System.out.println("Pass");
			
		}else
			
			System.out.println("Fail");
		
       
		WebElement First = driver.findElement(By.xpath("//*[@id=\"flight_type\"]/option[3]"));
		
        First.getText();
		
		String expectedText3 = "First"	;
		
		if(expectedText3.equals(First.getText())) {
			
			System.out.println("Pass");
			
		}else
			
			System.out.println("Fail");
		

//		WebElement firstText= driver.findElement(By.xpath("//*[@id=\"flight_type\"]/option[3]"));
//		
//		firstText.sendKeys(Keys.ENTER);
//		
//		firstText.isSelected();
		
		}
	
	@Test
	
//	#3
//	- Create booking, then click 'Search'
//	- Click on the first result
//	- Verify search result contains airport initial 'LAX' and 'SEA'
//	- Verify the date is correct '12/24/21'
	
	public void createBooking() {
		
        WebElement flightsButton = driver.findElement(By.xpath("//a[text()='flights']"));
		
		flightsButton.click();
		
		WebElement flyingFromBtn = driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
		
		flyingFromBtn.click();
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//
//		wait.until(ExpectedConditions.visibilityOf(flyingFromBtn));
//		
		flyingFromBtn.sendKeys("LAX");
		
		WebElement lax = driver.findElement(By.xpath("//*[@id=\"onereturn\"]/div[1]/div/div[1]/div/div/div/div/div[1]/div[1]/b"));
		
		lax.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	   
}	//end class	
	
	
	
	 


	
	
	
	
	
	
	
	
	
	
	
	
	
	

