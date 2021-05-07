package webdriverconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DynamicDropDown {

	public WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement currencyList = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));

		// select class ui controls
		Select slc = new Select(currencyList);
		slc.selectByIndex(3);
		//slc.selectByValue("INR");
		//slc.selectByVisibleText("AED");

		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		
		Thread.sleep(2000);

		WebElement adult = driver.findElement(By.cssSelector("ctl00_mainContent_ddl_Adult"));
		Select s1 = new Select(adult);
		s1.selectByValue("4");
		
		WebElement child = driver.findElement(By.cssSelector("ctl00_mainContent_ddl_Child"));
		Thread.sleep(2000);
		Select s2 = new Select(child);
		s2.selectByVisibleText("2");
		
		
		Thread.sleep(2000);
		WebElement infant = driver.findElement(By.cssSelector("ctl00_mainContent_ddl_Infant"));
		Select s3 = new Select(infant);
		s3.selectByIndex(2);

		Thread.sleep(2000);
		// driver.close();

	}
}
