package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends BasePage {

	public Home_Page(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//*[@class=\"banner-image\"]")
	WebElement btnJoinNow;
	
	@FindBy(xpath="//h5[text()=\"Elements\"]")
	WebElement btnElement;
	
	@FindBy(xpath="//h5[text()=\"Forms\"]")
	WebElement btnForms;
	
	@FindBy(xpath="//h5[text()=\"Alerts, Frame & Windows\"]")
	WebElement btnAlertWinFrame;
	
	@FindBy(xpath="//h5[text()=\"Widgets\"]")
	WebElement btnWidgets;
	
	@FindBy(xpath="//h5[text()=\"Interactions\"]")
	WebElement btnInteractions;
	
	@FindBy(xpath="//h5[text()=\"Book Store Application\"]")
	WebElement btnBookStore;
	
	@FindBy(xpath="(//*[@class=\"card-body\"]/h5)[1]")
	WebElement txtElement;
	
	
	
	
	public void click_JoinNow()
	{
		btnJoinNow.click();
	}
	
	public void click_Elements()
	{
		btnElement.click();
	}
	
	public void click_Forms()
	{
		btnForms.click();
	}
	
	public void click_AlertWinFrame()
	{
		btnAlertWinFrame.click();
	}
	
	public void click_Widgets()
	{
		btnWidgets.click();
	}
	
	public void click_INteractions()
	{
		btnInteractions.click();
	}
	
	public void click_BookStore()
	{
		btnBookStore.click();
	}
	
	public String validateElements()
	{
		try {
			String txt = txtElement.getText();
			return txt;
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	
}

