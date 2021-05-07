package windowhandles;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentInWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://usefultools//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//opening a parent window
		driver.get("https://the-internet.herokuapp.com/windows");

		//opening a new window
		driver.findElement(By.xpath("//*[@id='content']/div/a")).click();

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		//switching to a child window
		driver.switchTo().window(childId);
		
		WebElement element = driver.findElement(By.xpath("//div[@class='example']/h3"));
		System.out.println(element.getText());

		// switching back to parent window
		driver.switchTo().window(parentId);
		WebElement ele = driver.findElement(By.cssSelector("[class='example'] h3"));
		System.out.println(ele.getText());

		driver.quit();

	}

}
