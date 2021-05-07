package windowhandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sharma");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ramprasad@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("ramprasad@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("abc123@123a");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		WebElement sex = driver.findElement(By.xpath("//input[@value='2']"));
		WebElement button = driver.findElement(By.xpath("//button[@name='websubmit']"));

		Select slc = new Select(month);
		slc.selectByIndex(3);

		Select s1 = new Select(day);
		s1.selectByValue("19");

		Select s2 = new Select(year);
		s2.selectByVisibleText("1992");

		sex.click();

		//button.click();
		System.out.println("Registration Completed!!!");

		// 1. Find all links in the webpage
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		System.out.println(linkElements.size());

		ArrayList list = new ArrayList();
		for (int i = 0; i < linkElements.size(); i++) {
			System.out.println(linkElements.get(i).getText());

			list.add(linkElements.get(i).getText());
		}
		System.out.println("******************************************");
		System.out.println(list.toString());

		// 2. Find the links in footer
		WebElement footer = driver.findElement(By.id("pageFooter"));

		List<WebElement> footerlinks = footer.findElements(By.tagName("a"));
		for (int i = 0; i < footerlinks.size(); i++) {
			System.out.println(footerlinks.get(i).getText());
			// System.out.println(footerlinks.get(i).getTagName());

		}
		System.out.println("LinksCount footer :" + footerlinks.size());

		// 4. click on each links in the footer link and checkif the pages are opening

		for (int i = 0; i < footerlinks.size(); i++) {
			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footer.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		}

		Thread.sleep(5000L);
		// getting all the open tabs

		Set<String> abc = driver.getWindowHandles();

		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

		driver.close();
	}
}
