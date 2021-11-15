package StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigation_to_Unstructred_Dashboard;

public class folderpathfilter {
	WebDriver driver;
	public folderpathfilter() {
    this.driver= GoogleSearchSteps.driver;
		
		
	}
	
	
	Navigation_to_Unstructred_Dashboard navigate;
	
	
	@Given("User verify FolderPath tab is Present")
	public void user_verify_pdc_tab_is_present() {
		
		navigate = new Navigation_to_Unstructred_Dashboard();
	   navigate.FolderPathpresent();
	}

	@When("count length for FolderPath filter")
	public void count_length_for_pdc_filter() {
	   navigate.getlengthFolderPath();
	}

	@Then("FolderPath counts and select all the filters")
	public void pdc_counts_and_select_all_the_filters() {
	    
		
		navigate.FolderPath();
	}

}
