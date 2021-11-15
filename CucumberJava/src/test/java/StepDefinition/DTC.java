package StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigation_to_Unstructred_Dashboard;



public class DTC {
	
	
	WebDriver driver;
	public DTC() {
    this.driver= GoogleSearchSteps.driver;
		
		
	}
	
	
	Navigation_to_Unstructred_Dashboard navigate;
	
	
	@Given("User verify DTC tab is Present")
	public void user_verify_pdc_tab_is_present() {
		
		navigate = new Navigation_to_Unstructred_Dashboard();
	   navigate.DTCpresent();
	}

	@When("count length for DTC filter")
	public void count_length_for_pdc_filter() {
	   navigate.getlengthDTC();
	}

	@Then("DTC counts and select all the filters")
	public void pdc_counts_and_select_all_the_filters() {
	    
		
		navigate.DTC();
	}




}
