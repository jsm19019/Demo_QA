package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.Alerts_Windows_Forms;

public class Frames extends BaseTest{

	@Test
	public void validate_frames()
	{
		
		Alerts_Windows_Forms obj = new Alerts_Windows_Forms(driver);
		obj.click_on_Alerts();
		obj.click_on_frames();
		String txt = obj.frame_Validation();
		
		System.out.println(txt);
		Assert.assertEquals(txt, "Frames", "Text is not matching");
		
	}
	
	@Test
	public void first_frame()
	{
		Alerts_Windows_Forms obj = new Alerts_Windows_Forms(driver);
		obj.click_on_Alerts();
		obj.click_on_frames();
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		String txt = obj.frame1_text_validation();
		System.out.println(txt);
		Assert.assertEquals(txt, "This is a sample page", "first frame Text is not matching");
		driver.switchTo().defaultContent();
	}
	
	@Test
	public void secong_frame()
	{
		Alerts_Windows_Forms obj = new Alerts_Windows_Forms(driver);
		obj.click_on_Alerts();
		obj.click_on_frames();
		WebElement frame2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frame2);
		String txt = obj.frame1_text_validation();
		System.out.println(txt);
		Assert.assertEquals(txt, "This is a sample page", "second frame Text is not matching");
		driver.switchTo().defaultContent();
	}
	
	@Test
	public void nesterframe_frame1()
	{
		Alerts_Windows_Forms obj = new Alerts_Windows_Forms(driver);
		obj.click_on_Alerts();
		obj.click_on_frames();
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		String txt = obj.nested_parent_frame_validation();
		System.out.println(txt);
		Assert.assertEquals(txt, "Parent frame", "Nested frame 1 Text is not matching");
		driver.switchTo().defaultContent();
	}
	
}
