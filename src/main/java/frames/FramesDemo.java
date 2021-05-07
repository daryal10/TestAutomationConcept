package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");

		System.out.println(driver.findElements(By.tagName("iframe")).size());

		// 1.using frame index
		driver.switchTo().frame(0);

		// 2.finding using webelement
		// driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		// 3. in case of if there is frame id provided we can use frame(id) method
		// switch between frame.

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		Actions ac = new Actions(driver);

		ac.dragAndDrop(source, target).build().perform();
		
		System.out.println("moved permanently");

		// To switch back to the default content
		driver.switchTo().defaultContent();

		driver.close();

	}

}
