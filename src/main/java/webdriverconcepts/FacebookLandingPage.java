package webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class FacebookLandingPage {

	public WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");
		driver = new ChromeDriver();

		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C://usefultools//geckodriver.exe"); driver = new FirefoxDriver();
		 * 
		 * 
		 * System.setProperty("webdriver.ie.driver",
		 * "C://usefultools//IEDriverServer.exe"); driver = new
		 * InternetExplorerDriver();
		 * 
		 */

		driver.get("https://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("HelloFacebook");
		driver.findElement(By.id("pass")).sendKeys("Helloperson");
		driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		Thread.sleep(1000);
		driver.close();

	}
}
