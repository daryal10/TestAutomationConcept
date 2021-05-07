package autosuggestive;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ksrtc.in");

		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

		System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());

		// Html javascript DOM can extract hidden elements
		// because selenium cannot identify hidden elements -(Ajax implementation)
		// investigate the propetties of object if it haave any hidden text

		// javascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"fromPlaceName\").value ;";
		String text = (String) js.executeScript(script);
		System.out.println(text);

		int i = 0;
		// BENGULURU INTERNATIONAL AIRPORT
		while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
			i++;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);

			if (i > 10) {
				break;
			}
		}
		if (i > 10) {
			System.out.println("Element Not Found");
		} else {
			System.out.println("Element Found");
		}

	}

}
