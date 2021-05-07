package webdriverconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class SeleniumConcept {

	public WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {
		
		/*
		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");
		driver = new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "C://usefultools//geckodriver.exe");
		driver = new FirefoxDriver();
		
		*/
		
		System.setProperty("webdriver.ie.driver", "C://usefultools//IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		driver.get("https://google.com");
		driver.navigate().to("https://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.getTitle();
		driver.getCurrentUrl();
		
		

		Thread.sleep(2000);

		driver.close(); // it closes the current browser.
		
		driver.quit(); //it closes all the browser opened by selenium script

	}

}
