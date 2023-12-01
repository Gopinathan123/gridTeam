package ManjuPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Grid2 {
	@Test
	public void ib_register() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

	}
	@Test
	public void ib_login()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");

		
	}
}
