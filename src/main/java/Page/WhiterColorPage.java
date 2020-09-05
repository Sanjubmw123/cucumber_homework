package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WhiterColorPage {
WebDriver driver;
	
	public WhiterColorPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how =How.CSS,using="button[onclick='myFunctionWhite()']"
)
	WebElement White_Color_LOCATOR;
	
	public void colorpage_varification() {
		White_Color_LOCATOR.click();
	}

}

