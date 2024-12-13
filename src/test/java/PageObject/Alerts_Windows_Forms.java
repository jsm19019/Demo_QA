package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Alerts_Windows_Forms extends BasePage {

	public Alerts_Windows_Forms(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
	WebElement textElement;

	@FindBy(xpath = "(//*[@class=\"accordion\"])/div[3]//li[2]")
	WebElement Alerts;

	@FindBy(xpath = "//*[@class=\"text-center\"]")
	WebElement txtAlerts;

	@FindBy(id = "alertButton")
	WebElement clickmealert;

	@FindBy(id = "timerAlertButton")
	WebElement clicktimealert;

	@FindBy(id = "confirmButton")
	WebElement clickconfirmalert;

	@FindBy(id = "promtButton")
	WebElement clickpromptalert;

	@FindBy(id = "confirmResult")
	WebElement confirmresult;

	@FindBy(id = "promptResult")
	WebElement confirmpromptresult;

	public void click_on_Alerts() {
		textElement.click();
	}

	public String validating_alerts() {
		try {
			String text1 = Alerts.getText();
			return text1;
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	public void click_alerts()
	{
		Alerts.click();
	}
	
	public String validating_main_alerts()
	{
		try {
		String	text2 = txtAlerts.getText();
		return text2;
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	
	public void click_me_alert()
	{
		clickmealert.click();
	}
	
	
	public void click_on_second_alert()
	{
		clicktimealert.click();
	}
	
	public void click_on_third_alert()
	{
		clickconfirmalert.click();
	}
	
	public String txt_Validate()
	{
		try {
			String txt = confirmresult.getText();
			return txt;
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	
	public void click_on_fourth_button()
	{
		clickpromptalert.click();
	}
	
	public void enter_in_fourth_alert(String random)
	{
		driver.switchTo().alert().sendKeys(random);
	}
	
	public String validate_promt()
	{
		try {
			String txtrandom = confirmpromptresult.getText();
			return txtrandom;
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
}
