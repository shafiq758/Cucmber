package StepDefinition;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigation_to_Unstructred_Dashboard;
public class OwnerFilter {
	
	WebDriver driver;
	public OwnerFilter() {
    this.driver= GoogleSearchSteps.driver;
		
		
	}
	
	
	Navigation_to_Unstructred_Dashboard navigate;
	@Given("User verify ownner tab is Present")
	public void user_verify_ownner_tab_is_present() {
		navigate = new Navigation_to_Unstructred_Dashboard();
		navigate.ownerpresent();
	}

	@When("count length for owner filter")
	public void count_length_for_owner_filter() {
	    navigate.getlengthforowner();
	}

	@Then("owner counts and select all the filters")
	public void owner_counts_and_select_all_the_filters() {
	    navigate.set_owner();
	}

}
