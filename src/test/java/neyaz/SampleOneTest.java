package neyaz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleOneTest 
{
	@Test
	public void sample()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.quit();
	}
}
