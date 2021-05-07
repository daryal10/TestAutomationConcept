package webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class FBLocatorXpath {

	public WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Helloworld");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Kchhakhaber");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

		Thread.sleep(1000);
		//driver.close();

	}
}
