package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrarylogo {
	@FindBy(xpath="//b[text()='SkillRary']")
	private WebElement logo;	
	
	public Skillrarylogo(WebDriver driver) {	
		
		PageFactory.initElements(driver, this);
	}	
	//3.	Utilization.

	public WebElement getLogo() {
		return logo;
	}
	
	
}