package webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autosuggestive {

	public WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		//Auto-suggestive dropdown
		WebElement source=driver.findElement(By.xpath("//label[@for='fromCity']/input"));
		source.clear();
		source.sendKeys("MUM");
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination =driver.findElement(By.xpath("//label[@for='toCity']/input"));
		destination.clear();
		destination.sendKeys("DEL");
		Thread.sleep(2000);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);


		Thread.sleep(1000);
		driver.close();
		
		int i=1;
		//use for or while loop to repeate code inside
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}

	}
}
