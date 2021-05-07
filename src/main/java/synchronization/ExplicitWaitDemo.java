package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ExplicitWaitDemo {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		WebDriverWait w = new WebDriverWait(driver, 5);

		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");

		driver.findElement(By.xpath("//*[@id='content']/a[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='results']")));

		driver.findElement(By.xpath("//*[@id='results']")).getText();
		System.out.println(driver.findElement(By.xpath("//*[@id='results']")).getText());
		
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='results']")).getText(), "Process completed! This response has been loaded via the Ajax request directly from the web server, without reoading this page.");
		
		driver.close();
	}
}
