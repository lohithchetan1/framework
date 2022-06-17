package genericlib;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class Webdriverutility {
	public static WebDriver driver;
	public void dropDown(WebElement ele, String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();		
	}
	public void doubleClick(WebDriver driver, WebElement ele2) {
	Actions a1=new Actions(driver);
	a1.doubleClick(ele2).perform();
}
   public void switchFrame(WebDriver driver) {
	driver.switchTo().frame(0);
   }
   public void switchbackFrame(WebDriver driver) {
	   driver.switchTo().defaultContent();
   }
   public void alertPopup(WebDriver driver) {
	   driver.switchTo().alert().accept();
   }
   public void switchTabs(WebDriver driver) {
	   Set<String> window = driver.getWindowHandles();
	   for(String wb:window) {
		   driver.switchTo().window(wb);
	   }
	   
   }
}

