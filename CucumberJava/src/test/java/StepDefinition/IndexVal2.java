package StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigation_to_Unstructred_Dashboard;

public class IndexVal2 {
	
	
	WebDriver driver;
	public IndexVal2() {
    this.driver= GoogleSearchSteps.driver;
		
		
	}
	
	
	Navigation_to_Unstructred_Dashboard navigate;
	
	
	@Given("check size of grid2")
	public void user_verify_pdc_tab_is_present() throws InterruptedException {
		
		navigate = new Navigation_to_Unstructred_Dashboard();
	   navigate.doccount();
	}

	@When("Find thee Index2 value")
	public void count_length_for_pdc_filter() throws InterruptedException {
	   navigate.getindexval2();
	}
	
	@And("Remove Index2 value")
	public void removeindex() throws InterruptedException {
		
		navigate.RemoveIndexVal2();
	}

	@Then("Assert Index2 value")
	public void pdc_counts_and_select_all_the_filters() throws InterruptedException {
	    
		
		navigate.AssertIndexVal2();
	}


}
