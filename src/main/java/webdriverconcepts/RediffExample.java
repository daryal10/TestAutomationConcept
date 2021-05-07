package webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class RediffExample {

	public WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.rediff.com/");

		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.cssSelector("#login1")).sendKeys("Ramprasad@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("abc123");
		//driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();

		// for fetching the error message
		WebElement x = driver.findElement(By.cssSelector("div.div_login_error"));
		System.out.println(x.getText());

		Thread.sleep(1000);
		// driver.close();

	}
}
