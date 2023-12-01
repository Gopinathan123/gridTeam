package neyaz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTwoTest 
{
	public void sample()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.quit();
	}
}
