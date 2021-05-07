package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PurchaseItem {

	public WebDriver driver;
	int j = 0;

	@Test
	public void buyItems() throws InterruptedException {

		// Expected Array
		// ArrayList<String> productLists = new ArrayList<String>();
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot","Carrot","Beans" };

		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			// name[0] = "Brocolli ";
			// name[1] = " 1 Kg ";
			String formattedName = name[0].trim();

			// Format it to get actual vegetable name
			// 1. Check whether name you expected is present in array or not
			// convert array into arrayList for easy search
			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {
				j++;

				// click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

				if (j == itemsNeeded.length)
					break;
			}
		}
		
		//div[@class='product-action']

	}
}
