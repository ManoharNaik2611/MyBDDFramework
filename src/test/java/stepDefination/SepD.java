package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SepD {
	@Given("user is on netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    System.out.println("user is on netbanking landing page");
	}

	@When("username and password")
	public void username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("username and password");
	}

	@Then("Home page is populate")
	public void home_page_is_populate() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page is populate");
	}

	@Then("cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("cards are displayed");
	}
}
