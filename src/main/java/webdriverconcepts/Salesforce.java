package webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Salesforce {

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

		driver.get("https://login.salesforce.com/");

		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("HelloFacebook");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Helloperson");
		driver.findElement(By.xpath("//*[@id='Login']")).click();

		// copying the text from the error message
		driver.findElement(By.xpath("//div[@id='error']")).getText();
		System.out.println("error message is: " + driver.findElement(By.xpath("//div[@id='error']")).getText());
		Thread.sleep(1000);
		driver.close();

	}
}
