package stepdefinitions;

import org.testng.Assert;

import com.pages.Loginpage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	private static String title;
	private Loginpage loginpage=new Loginpage(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	  DriverFactory.getDriver().get("https://www.saucedemo.com/");
	 
	}

	@When("user gets the title of page")
	public void user_gets_the_title_of_the_page() throws Throwable {
		
		title=loginpage.getLoginPageTitle();
		System.out.println("Login page title is "+title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.equalsIgnoreCase(expectedTitleName));
	   
	}
	@When("user enters username {string}")
	public void user_enters_username(String usname) {
	   loginpage.enterUserName(usname);
	}

	@When("user enters password {string}")
	public void user_enters_password(String pwrd)
	{
	   loginpage.enterPassword(pwrd);
	   
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() throws Throwable {
		
			loginpage.clickOnLogin();   
			
	}

	
	
	
	
	
	
}
