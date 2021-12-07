package seleniumBatch8_Day5;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation_Task {

	WebDriver driver;

	@Before

	public void OpenBrowers() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@Test

	public void Task() {

		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();

		WebElement outerFrame = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));

		driver.switchTo().frame(outerFrame);

		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Good");
		
	}

}
