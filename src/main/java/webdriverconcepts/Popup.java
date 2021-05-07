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

public class Popup {

	public WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {

		int age = 25;
		String name = "Ram";
		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("name")).sendKeys("Dhruba");
		driver.findElement(By.id("alertbtn")).click();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.findElement(By.id("name")).sendKeys("Prabhat");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		System.out.println(driver.switchTo().alert().getClass());
		driver.switchTo().alert().dismiss();

		Thread.sleep(5000);
		driver.close();

	}
}
