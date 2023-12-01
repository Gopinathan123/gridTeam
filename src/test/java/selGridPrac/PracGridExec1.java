package selGridPrac;

import org.testng.annotations.Test;

public class PracGridExec1 extends BaseClass {
	
	@Test
	public void amazonBrowser()
	{
		driver.get("https://www.amazon.in");
	}

}
