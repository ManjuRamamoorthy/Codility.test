package stepdefinitions;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageobjects.MainPage;

public class Stepdefinitions {

	MainPage mainpage = new MainPage();

	@Given("^I navigated to the website$")
	public void i_navigated_to_the_website() throws Throwable {
		mainpage.navigateURL();
	}

	@Then("^I can see query input field is displayed$")
	public void i_can_see_query_input_field_is_displayed() throws Throwable {
		Assert.assertTrue(mainpage.verifyInputQueryDisplayed());
	}

	@Then("^I can also see search button is displayed$")
	public void i_can_also_see_search_button_is_displayed() throws Throwable {
		Assert.assertTrue(mainpage.verifySearchButtonDisplayed());
	}
	
	@Then("^I verify to use an empty query \"([^\"]*)\" error message is displaying$")
	public void i_verify_to_use_an_empty_query_error_message_is_displaying(String arg1) throws Throwable {
		mainpage.clickonSearch();
		Assert.assertTrue(mainpage.verifyEmptyQuery(arg1));
	}
	
	@When("^I querying for \"([^\"]*)\"$")
	public void i_querying_for(String arg1) throws Throwable {
		mainpage.enterQueryText(arg1);
	}

	@Then("^I verify \"([^\"]*)\" message is displaying$")
	public void i_verify_message_is_displaying(String arg1) throws Throwable {
		mainpage.clickonSearch();
		Assert.assertTrue(mainpage.verifyEmptyQuery(arg1));
	}
}
