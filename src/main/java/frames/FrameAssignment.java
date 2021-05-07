package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		// opening a parent window
		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.cssSelector("[href*='nested_frames']")).click();

		// switching to the top frame
		driver.switchTo().frame("frame-top");

		// switching to middle frame
		driver.switchTo().frame("frame-middle");

		System.out.println(driver.findElement(By.id("content")).getText());

		// switching back to the default content
		driver.switchTo().defaultContent();
		
		driver.close();
		

	}

}
