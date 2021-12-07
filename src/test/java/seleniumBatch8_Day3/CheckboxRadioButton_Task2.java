package seleniumBatch8_Day3;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxRadioButton_Task2 {

	
WebDriver driver;
	
	@Before
	
	public void openBrowers() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://test.rubywatir.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
//	@Test
//	
//	public void CheckBoxTest() {
//		
//		   // verify each and every checkboxes
//        //and if they are selected, unselect them
//        // and if they are unselected, select them.
//
//    //note: by default, 4 should be selected and 4 other should be unselected. 
//
//		
//         WebElement checkboxes = driver.findElement(By.xpath("//a[text()='Checkboxes']"));
//		
//		 checkboxes.click();	
//		
//		 Boolean actualResultSoccer = driver.findElement(By.xpath("//input[@name='sports']")).isSelected();
//		 
//		 Boolean expectResultSoccer = true;
//		 
//		 if(actualResultSoccer.equals(expectResultSoccer)) {
//			 
//			System.out.println("The soccerbox is checked"); 
//			 
//		 }else
//			 System.out.println("The soccerbox is uncheck");
//			
//		 WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='sports']"));
//		 
//		 checkbox1.click();
//		
//		 //--------------------------------------------------------------------------
//		 
//        Boolean checkboxFootball = driver.findElement(By.xpath("//input[@value='football']")).isSelected();
//		 
		 
			
		@Test
		  public void CheckBoxesTask() {
				
				//checkbox
		    driver.findElement(By.xpath("//*[text()='Checkboxes']")).click();
		     

		    Boolean soccoer = driver.findElement(By.xpath("//*[@value='soccer']")).isSelected();//true
		    System.out.println("checkbox soccoer is selected. " + soccoer);
		    if (soccoer) {
		      driver.findElement(By.xpath("//*[@value='soccer']")).click();
		    }
		     
		     
		    Boolean Football = driver.findElement(By.xpath("//*[@value='football']")).isSelected();//false
		    System.out.println("checkbox Football is  selected" + Football);
		    if (Football) {
		      System.out.println("Football checkbox is SELECTED"+ Football);
		    }else 
		      driver.findElement(By.xpath("//*[@value='football']")).click();
		    
		     
		    Boolean baseball = driver.findElement(By.xpath("//*[@value='baseball']")).isSelected();//false
		    System.out.println("checkbox baseball is  selected" + baseball);
		    if (baseball) {
		      System.out.println("baseball checkbox is SELECTED "+baseball);
		    }else 
		      driver.findElement(By.xpath("//*[@value='baseball']")).click();
		    
		    
        Boolean basketball = driver.findElement(By.xpath("//*[@value='basketball']")).isSelected();//True
	    System.out.println("checkbox basketball is selected. " + basketball);
	    if (basketball) {
	      driver.findElement(By.xpath("//*[@value='basketball']")).click();
	    }
        
	    
	    Boolean snooker = driver.findElement(By.xpath("//*[@value='snooker']")).isSelected();
	    System.out.println("checkbox snooker is  selected" + snooker);
	    if (snooker) {
	      System.out.println("snooker checkbox is SELECTED");
	    }else 
	      driver.findElement(By.xpath("//*[@value='snooker']")).click();
	    
        
		    Boolean rugby = driver.findElement(By.xpath("//*[@value='rugby']")).isSelected();
		    System.out.println("checkbox rugby is selected" + rugby);
		    if (rugby) {
		    	System.out.println("rugby checkbox is SELECTED");
		    }else 
		      driver.findElement(By.xpath("//*[@value='rugby']")).click();
		    
		     
		    Boolean golf = driver.findElement(By.xpath("//*[@value='golf']")).isSelected();
		    System.out.println("checkbox golf is selected" + golf);
		    if (golf) {
		    	System.out.println("golf checkbox is SELECTED");
		    }else 
		      driver.findElement(By.xpath("//*[@value='golf']")).click();
		    
		     
		    Boolean netball = driver.findElement(By.xpath("//*[@value='netball']")).isSelected();
		    System.out.println("checkbox golf is selected" + netball);
		    if (netball) {
		    	System.out.println("netball checkbox is SELECTED");
		    }else 
		      driver.findElement(By.xpath("//*[@value='netball']")).click();
		    
		}
		     
		   
		@Test
			  public void radioButton() {
		     
		    //verify the first radio button is true
		    driver.findElement(By.xpath("//*[text()='Radio buttons']")).click();
		    
		    WebElement rb1 = driver.findElement(By.xpath("//*[@value='Radio1']"));
		    
		    Boolean radioButton1 = driver.findElement(By.xpath("//*[@value='Radio1']")).isSelected();//true
		    
		    if(radioButton1) {
		    	System.out.println("Radio button is checked");
		    }else
		    	rb1.click();
		    	
		    driver.findElement(By.xpath("//*[@class='radioclass']")).click();
		    driver.findElement(By.xpath("//*[@id='radioId']")).click();
		    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/p/input[4]")).click();
		    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/p/input[5]")).click();
		    
		   WebElement rb6 =  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/p/input[6]"));
		   Boolean radioButton6 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/p/input[6]")).isSelected();//true
		   
		   if(radioButton6) {
			   
			   System.out.println("Radio button is checked");
			   
		   }else
			   
			   rb6.click();
		   
		    //verify the last radio button is true
		     
		     
		  }		
			
			
			
			
	}
	

	
	
	
	
	
	
	
	
	
	

