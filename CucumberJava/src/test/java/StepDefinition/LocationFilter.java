package StepDefinition;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigation_to_Unstructred_Dashboard;
public class LocationFilter {
	
	WebDriver driver;
	public LocationFilter() {
    this.driver= GoogleSearchSteps.driver;
		
		
	}
	
	Navigation_to_Unstructred_Dashboard navigate;
	@Given("User verify location tab is Present")
	public void user_verify_location_tab_is_present() {
	    // Write code here that turns the phrase above into concrete actions
		navigate = new Navigation_to_Unstructred_Dashboard();
		navigate.locationpresent();
		
	}

	@When("count length for location filter")
	public void count_length_for_location_filter() {
	    // Write code here that turns the phrase above into concrete actions
	    navigate.getlengthforlocation();
	}

	@Then("User counts and select all the filters")
	public void user_counts_and_select_all_the_filters() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    navigate.select_Location();
	}

}
