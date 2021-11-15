package StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigation_to_Unstructred_Dashboard;

public class IndexVal {

	
	
	WebDriver driver;
	public IndexVal() {
    this.driver= GoogleSearchSteps.driver;
		
		
	}
	
	
	Navigation_to_Unstructred_Dashboard navigate;
	
	
	@Given("check size of grid")
	public void user_verify_pdc_tab_is_present() throws InterruptedException {
		
		navigate = new Navigation_to_Unstructred_Dashboard();
	   navigate.doccount();
	}

	@When("Find the Index value")
	public void count_length_for_pdc_filter() {
	   navigate.getindexval();
	}

	@Then("Assert Index value")
	public void pdc_counts_and_select_all_the_filters() throws InterruptedException {
	    
		
		navigate.AssertIndexVal();
	}


}
