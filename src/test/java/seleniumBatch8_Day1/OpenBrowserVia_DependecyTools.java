package seleniumBatch8_Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowserVia_DependecyTools {

	public static void main(String[] args) {
		
    WebDriver driver;
 
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("https://www.youtube.com/");
	
	String youTubeTitle = driver.getTitle();
		
	driver.getTitle();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
