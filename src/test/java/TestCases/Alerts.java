package TestCases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.Alerts_Windows_Forms;
import Utilities.GenerateRandomString;

public class Alerts extends BaseTest {

	@Test(priority = 0)
	public void Checking_for_dropdown_functionality() throws InterruptedException {
		Alerts_Windows_Forms obj = new Alerts_Windows_Forms(driver);
		obj.click_on_Alerts();
		String txt1 = obj.validating_alerts();
		Assert.assertEquals(txt1, "Alerts", "Dropdown is not working");
	}

	@Test(priority = 1)
	public void checking_for_Alerts_to_be_visible() {
		Alerts_Windows_Forms obj = new Alerts_Windows_Forms(driver);
		obj.click_on_Alerts();
		obj.click_alerts();
		String txt2 = obj.validating_main_alerts();
		Assert.assertEquals(txt2, "Alerts", "Alerts Tab is not Opened");
	}

	@Test(priority = 3)
	public void checking_for_first_alert() {
		Alerts_Windows_Forms obj = new Alerts_Windows_Forms(driver);
		obj.click_on_Alerts();
		obj.click_alerts();
		obj.click_me_alert();
		String txt3 = driver.switchTo().alert().getText();
		Assert.assertEquals(txt3, "You clicked a button", "Alert is not Opened");
		System.out.println("First Alert contains: " + txt3);
		driver.switchTo().alert().accept();
	}

	@Test(priority = 4)
	public void checking_for_second_alert() {
		Alerts_Windows_Forms obj = new Alerts_Windows_Forms(driver);
		obj.click_on_Alerts();
		obj.click_alerts();
		obj.click_on_second_alert();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String txt4 = alert.getText();
		System.out.println("Second Alert contains: " + txt4);
		Assert.assertEquals(txt4, "This alert appeared after 5 seconds", "Second alert is not opened");
		alert.accept();
	}

	@Test(priority = 5)
	public void checking_for_third_alert_ok() {
		Alerts_Windows_Forms obj = new Alerts_Windows_Forms(driver);
		obj.click_on_Alerts();
		obj.click_alerts();
		obj.click_on_third_alert();
		String txt5 = driver.switchTo().alert().getText();
		System.out.println("Third Alert(OK) contains: " + txt5);
		driver.switchTo().alert().accept();
		String txt_Validate = obj.txt_Validate();
		Assert.assertEquals(txt_Validate, "You selected Ok", "You did't selected OK");
	}

	@Test
	public void checking_for_third_alert_cancel() {
		Alerts_Windows_Forms obj = new Alerts_Windows_Forms(driver);
		obj.click_on_Alerts();
		obj.click_alerts();
		obj.click_on_third_alert();
		String txt6 = driver.switchTo().alert().getText();
		System.out.println("Third Alert(Cancel) contains: " + txt6);
		driver.switchTo().alert().dismiss();
		String txtValidate = obj.txt_Validate();
		Assert.assertEquals(txtValidate, "You selected Cancel", "You did't selected OK");
	}

	@Test
	public void checking_for_fourth_alert_cancel() throws InterruptedException {
		Alerts_Windows_Forms obj = new Alerts_Windows_Forms(driver);
		obj.click_on_Alerts();
		obj.click_alerts();
		obj.click_on_fourth_button();
		String txt7 = driver.switchTo().alert().getText();
		System.out.println("Fourth Alert contains: " + txt7);

		GenerateRandomString obj1 = new GenerateRandomString();
		String random_string = obj1.random_string();
		obj.enter_in_fourth_alert(random_string);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

		String txt_prompt = obj.validate_promt();

		String canceltxt = txt_prompt.replace("You entered ", "");

		Assert.assertEquals(canceltxt, random_string, txt_prompt);
	}
}
