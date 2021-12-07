package seleniumBatch8_Day5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homework_Action {

	WebDriver driver;
	

	
	@Before
	
	public void OpenBroswer() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/sortable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//a[text()='Draggable']
		
	}
	


	
	@Test
	
	public void dragableBtn() throws InterruptedException {
		
		WebElement dragBtn = driver.findElement(By.xpath("//a[text()='Draggable']"));
		
		dragBtn.click();  
		
		Thread.sleep(3000);
		
		WebElement frameBox = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		
		driver.switchTo().frame(frameBox);
		
		WebElement dragbox = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Actions action = new Actions(driver); 
		
		action.clickAndHold(dragbox).build().perform();
		
		action.moveByOffset(150, 130).build().perform();
		
	
		
		
		
	}

@Test
	
	public void dropableBtn() throws InterruptedException {
		
		WebElement dragBtn = driver.findElement(By.xpath("//a[text()='Droppable']"));
		
		dragBtn.click();  
		
		Thread.sleep(3000);
		
		WebElement frameBox = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		
		driver.switchTo().frame(frameBox);
		
		WebElement dragmsg1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement frame   = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver); 
		
		action.dragAndDrop(dragmsg1,frame ).build().perform();
		
		
		
	}
	
@Test

public void resizableBtn() throws InterruptedException {
	
	WebElement resizBtn = driver.findElement(By.xpath("//a[text()='Resizable']"));
	
	resizBtn.click();  
	
	Thread.sleep(3000);
	
	WebElement frameBox = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	
   driver.switchTo().frame(frameBox);
	
	WebElement sizebox = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
	
	Actions action = new Actions(driver); 
	
    action.clickAndHold(sizebox).build().perform();
    
    action.moveByOffset(100, 130).build().perform();
    
    action.release().perform();
    
    
   }
	
@Test

   public void selectAbleBtn() throws InterruptedException {
	
	WebElement selectBtn = driver.findElement(By.xpath("//a[text()='Selectable']"));
	
	selectBtn.click();  
	
	Thread.sleep(3000);
	
	WebElement frameBox = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	
	driver.switchTo().frame(frameBox);
	
	WebElement selectBox = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
	
	Actions action = new Actions(driver); 
	
	action.click().build().perform();
	

}

@Test

public void sortAbleBtn() throws InterruptedException {
	
	WebElement sorttBtn = driver.findElement(By.xpath("//a[text()='Sortable']"));
	
	sorttBtn.click();  
	
	Thread.sleep(3000);
	
	WebElement frameBox = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	
	driver.switchTo().frame(frameBox);
	
	Actions action = new Actions(driver); 
	
	WebElement item1 = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[1]"));
	
	WebElement item2 = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[2]"));
	
	action.dragAndDrop(item1, item2).build().perform();
	
}
   public void task2() {

    
    
    iframeSearch(driver.findElements(By.tagName("iframe")));

} // this is bracket belonging to task2



   public void iframeSearch(List<WebElement> element) {
    
    
    int size = element.size();

    for (int i = 0; i <= size; i++) {

        driver.switchTo().frame(i);

        // your code

        driver.switchTo().defaultContent();
    }
}
@Test

   public void iframeSearch2(List<WebElement> element) {
       
       
       int size = element.size();

       for (int i = 0; i <= size; i++) {

           driver.switchTo().frame(i);

           WebElement draggable = driver.findElement(By.id("draggable"));

           WebElement droppable = driver.findElement(By.id("droppable"));

           Actions action = new Actions(driver);

           action.dragAndDrop(draggable, droppable).build().perform();

           driver.switchTo().defaultContent();
       }
}
@After
	
	public void afterMethod () {
		
		driver.close();
	}
}
