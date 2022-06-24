package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
    WebDriver driver;
	
	@FindBy(xpath = "//input[@id='exampleInputEmail1']")
	WebElement txt_email;

	@FindBy(xpath = "//input[@id='exampleInputPassword1']")
	WebElement txt_pass;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement button;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setTextInBox1(String text) throws Exception {
		
		txt_email.sendKeys(text);
		Thread.sleep(3000);
	}
	
	public void setTextInBox2(String text1) {
		txt_pass.sendKeys(text1);
	}
	
	public void clickOnButton() {
		button.click();
	}

}
