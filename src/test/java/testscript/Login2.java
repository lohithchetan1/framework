package testscript;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericlib.Baseclass;
import pom.SkillraryLogin;
import pom.Skillrarylogo;

public class Login2 extends Baseclass {
	@Test
	public void tc() {
	SkillraryLogin s=new SkillraryLogin(driver);
	s.un("admin");
	s.pw("admin");
	s.ln();
	
	Skillrarylogo s1=new Skillrarylogo(driver);	
	web.mouseHover(driver, s1.getLogo());
	s1.getLogo();
	
	
	}

}
