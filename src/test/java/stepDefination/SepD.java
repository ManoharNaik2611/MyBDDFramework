package stepDefination;


import java.util.List;



import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SepD {
	
	
	@Given("user is on netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    System.out.println("user is on netbanking landing page");
	}

	@When("^username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void username_something_and_password_something(String strArg1, String strArg2) {
		System.out.println(strArg1); 
		System.out.println(strArg2); 
    }

	@Then("Home page is populate")
	public void home_page_is_populate() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page is populate");
	}

	@Then("cards are displayed {string}")
	public void cards_are_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
	}
	
	@When("^user sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data)
	{
		System.out.println("user sign up with following details");
		List<List<String>> obj = data.asLists();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		System.out.println(obj.get(0).get(4));
    }
	 @When("^username with (.+) and password (.+)$")
    public void username_and_password(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
    }
	 @Given("^user on netbanking landing page$")
	    public void user_on_netbanking_landing_page(){
		 System.out.println("1"); 
	    }

	    @When("^username and password$")
	    public void username_and_password(){
	    	System.out.println("2");
	    }

	    @Then("^HomePage is populate$")
	    public void homepage_is_populate(){
	    	System.out.println("3");
	    }

	    @And("^cards are displayedd \"([^\"]*)\"$")
	    public void cards_are_displayedd_something(String strArg1){
	    	System.out.println(strArg1);
	    }
	       
}
