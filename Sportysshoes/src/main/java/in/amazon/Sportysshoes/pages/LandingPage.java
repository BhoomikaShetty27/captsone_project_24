package in.amazon.Sportysshoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	@FindBy(xpath="/html/body/div[2]/form/button")
	private WebElement register;
	
	@FindBy(name="name")
	private WebElement name;
	
	@FindBy(name="email")
	private WebElement email;
	

	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="/html/body/div[2]/form/a")
	private WebElement registerbtn;
	
	
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void registerPage()
	{
		register.click();
	}
	
	public void EnterName()
	{
		name.sendKeys("Bhoomi");
	}
	
	public void EnterEmail() {
	   email.sendKeys("bhoomishetty2327@gmail.com");
	}
	
	public void EnterPassword()
	{
		password.sendKeys("Bhoomi");
	}
	
	public void clickRegisterBtn()
	{
		registerbtn.click();
	}
}
