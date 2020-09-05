package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ColorPage {
WebDriver driver;
	
	public ColorPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how =How.CSS,using="button[onclick='myFunctionSky()']")
	WebElement SKY_BLUE_BACKGROUND_LOCATOR;
	
	public void colorpage_varification() {
		SKY_BLUE_BACKGROUND_LOCATOR.click();
	}

}


