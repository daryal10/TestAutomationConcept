package webdriverconcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxes {

	public WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement familyfriends = driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']"));
		
		Assert.assertFalse(familyfriends.isSelected()); //false

		boolean b = familyfriends.isSelected();//false
		System.out.println(b);//false

		// click to the checkboxes
		familyfriends.click();
		
		System.out.println(familyfriends.isSelected());//true
		Assert.assertTrue(familyfriends.isSelected());

		// After checking
		System.out.println(familyfriends.isSelected());

		// number of checkboxes
		// input[type='checkboxes']

		
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		//System.out.println(driver.findElements(By.cssSelector(("input[type='checkbox']")).size());
		System.out.println(checkboxes.size());
		
		Assert.assertEquals(6, 6);

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		// //a[@value='MAA']")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		Thread.sleep(2000);
		driver.close();

	}
}
