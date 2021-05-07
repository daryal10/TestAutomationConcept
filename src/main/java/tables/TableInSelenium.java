package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableInSelenium {

	public static void main(String[] args) {

		int sum = 0;
		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");

		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));

		int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();

		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();

		for (int i = 0; i < count - 2; i++) {

			String value = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			int valueInteger = Integer.parseInt(value);
			sum = sum + valueInteger;
		}

		String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue=Integer.parseInt(Extras);
		int totalSumValue=sum+extrasValue;
		System.out.println(totalSumValue);
		
		String Total = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int totalValue=Integer.parseInt(Total);
		System.out.println(totalValue);

		if(totalSumValue==totalValue) {
			System.out.println("Count Matches");
		}else {
			System.out.println("Count Doesn't matches!!!");
		}
	}

}
