package webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class GoogleSearch {

	public WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		String title = driver.getTitle();
		System.out.println("Title of the page is:" + title);
		
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("HelloWorld");
		
		//driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("HelloWorld");
		
		

		Thread.sleep(1000);
		// driver.close();

	}
}
