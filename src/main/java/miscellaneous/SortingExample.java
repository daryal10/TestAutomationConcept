package miscellaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortingExample {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		List<WebElement> firstColList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));

		ArrayList<String> originalList = new ArrayList<String>();

		for (int i = 0; i < firstColList.size(); i++) {
			originalList.add(firstColList.get(i).getText());
		}

		ArrayList<String> copiedList = new ArrayList<String>();
		for (int i = 0; i < originalList.size(); i++) {
			copiedList.add(originalList.get(i));
		}
		System.out.println("************************");
		Collections.sort(copiedList);
		for (String s : copiedList) {
			System.out.println(s);
		}
		System.out.println("***************************");
		for (String s : originalList) {
			System.out.println(s);
		}

		Assert.assertTrue(originalList.equals(copiedList));

	}
}
