package dhiru.ranchi.india;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGoogleWebSite {
	@Test
	void launchgoogle() throws InterruptedException{

		WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
