package mouseIntractions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {

		// mouseOver on object with selenium
		// performing mouse and keyboard interactions with selenium.

		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		Actions a = new Actions(driver);

		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		a.moveToElement(move).contextClick().build().perform();

		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
		.click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	}

}
