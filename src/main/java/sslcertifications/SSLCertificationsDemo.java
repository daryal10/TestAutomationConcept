package sslcertifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificationsDemo {

	public static void main(String[] args) {

		// SSL Certifications

		// General chrome profile
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.acceptInsecureCerts();

		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		// belongs to your local browser
		ChromeOptions ch = new ChromeOptions();
		ch.merge(cap);

		System.setProperty("webdriver.chrome.driver", "C:\\usefultools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(ch);

		driver.get("");

	}

}
