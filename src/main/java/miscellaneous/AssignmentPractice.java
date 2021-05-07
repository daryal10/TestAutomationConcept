package miscellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class AssignmentPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\usefultools\\chromedriver.exe");

		WebDriver drive = new ChromeDriver();

		drive.get("http://www.qaclickacademy.com/practice.php");

		drive.manage().window().maximize();

		drive.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		drive.findElement(By.id("checkBoxOption2")).click();

		String b = drive.findElement(By.id("checkBoxOption2")).getAttribute("value");

		Select s = new Select(drive.findElement(By.id("dropdown-class-example")));

		drive.findElement(By.id("dropdown-class-example")).click();

		s.selectByValue(b);

		drive.findElement(By.id("name")).sendKeys(b);

		drive.findElement(By.id("alertbtn")).click();

		drive.switchTo().alert().accept();

	}

}
