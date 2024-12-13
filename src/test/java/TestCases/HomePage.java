package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.Home_Page;

public class HomePage extends BaseTest {

	@Test
	public void homepage_validation() {
		Home_Page obj = new Home_Page(driver);
		String text = obj.validateElements();
		try {
			Assert.assertEquals(text, "Elements", "Text is not Matched");
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
