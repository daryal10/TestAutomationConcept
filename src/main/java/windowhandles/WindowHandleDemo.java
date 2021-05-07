package windowhandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/signup");
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[1]/a")).click();
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[2]/a")).click();
		System.out.println(driver.getTitle());

		Set<String> windowIds = driver.getWindowHandles();

		Iterator<String> it = windowIds.iterator();

		while (it.hasNext()) {
			String parentId = it.next();
			String child1 = it.next();
			String child2 = it.next();

			driver.switchTo().window(child1);
			System.out.println(driver.getTitle());
			
			driver.switchTo().window(parentId);
			System.out.println(driver.getTitle());
			
			driver.switchTo().window(child2);
			driver.getTitle();
			
			driver.quit();

		}
	}
}
