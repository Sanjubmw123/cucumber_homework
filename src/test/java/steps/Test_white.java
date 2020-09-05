package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.WhiterColorPage;
import Util.Browser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Test_white {
	WebDriver driver;
	
	
	WhiterColorPage colors;
	
	@Given("^I see Set white Background button exists$")
	public void i_see_Set_white_Background_button_exists() throws Throwable {
	   
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
		driver=Browser.launch();
		colors=PageFactory.initElements(driver,WhiterColorPage.class );
		colors.colorpage_varification();
	}


}
	
	