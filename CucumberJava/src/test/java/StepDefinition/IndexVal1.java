package StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigation_to_Unstructred_Dashboard;

public class IndexVal1 {
	
	
	WebDriver driver;
	public IndexVal1() {
    this.driver= GoogleSearchSteps.driver;
		
		
	}
	
	
	Navigation_to_Unstructred_Dashboard navigate;
	
	
	@Given("check size of grid1")
	public void user_verify_pdc_tab_is_present() throws InterruptedException {
		
		navigate = new Navigation_to_Unstructred_Dashboard();
	   navigate.doccount();
	}

	@When("Find thee Index1 value")
	public void count_length_for_pdc_filter() throws InterruptedException {
	   navigate.getindexval1();
	}
	
	@And("Remove Index1 value")
	public void removeindex() throws InterruptedException {
		
		navigate.RemoveIndexVal1();
	}

	@Then("Assert Index1 value")
	public void pdc_counts_and_select_all_the_filters() throws InterruptedException {
	    
		
		navigate.AssertIndexVal1();
	}


}
