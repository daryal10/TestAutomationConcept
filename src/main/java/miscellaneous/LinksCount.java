package miscellaneous;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		// opening the application
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// 1. find total links in the webPage
		List<WebElement> elementLists = driver.findElements(By.tagName("a"));
		System.out.println("Links count: " + elementLists.size());

		// 2. counts of links in the footer section
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		int footerLinkCount = footer.findElements(By.tagName("a")).size();
		System.out.println("Footer links count: " + footerLinkCount);

		// 3.find the linkscount of first column in the webpage

		WebElement firstColumn = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int linkCount = firstColumn.findElements(By.tagName("a")).size();
		System.out.println(linkCount);

		// 4. - click on each link in the column and check if the pages are opening
		for (int i = 1; i < linkCount; i++) {

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			firstColumn.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		}
		Thread.sleep(5000L);
		// 5. getting all the open tabs
		Set<String> abc = driver.getWindowHandles();

		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

		Thread.sleep(2000);
		// driver.close();

	}

}
