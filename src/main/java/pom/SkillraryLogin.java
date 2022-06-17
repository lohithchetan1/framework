package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLogin {	
	//1.	Declaration.	
	@FindBy(id="email")
	private WebElement userName;	
	@FindBy(id="password")
	private WebElement passWord;	
	@FindBy(name="login")
	private WebElement loginButton;	
	//2.	Initialization.
	public SkillraryLogin(WebDriver driver) {	
		
		PageFactory.initElements(driver, this);
	}	
	//3.	Utilization.
	public void un(String user) {
		userName.sendKeys(user);
	}		
	public void pw(String pass) {
	passWord.sendKeys(pass);
	}
	public void ln() {
		loginButton.click();			
	}	
}
