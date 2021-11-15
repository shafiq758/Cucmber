package StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigation_to_Unstructred_Dashboard;

public class datastoreindexval {
	
	
	WebDriver driver;
	public datastoreindexval() {
    this.driver= GoogleSearchSteps.driver;
		
		
	}
	
	
	Navigation_to_Unstructred_Dashboard navigate;
	
	@Given("document datastoreindex value")
	public void document_index_value() throws InterruptedException {
		
		navigate = new Navigation_to_Unstructred_Dashboard();
		navigate.datastoreindexval();
	   
	}
	
	@And("Remove datastoreindex value")
	public void removedocindexval() throws InterruptedException {
		navigate.removedatastoreval();
		
	}

	@When("Set datastoreindex val")
	public void set_index_val() throws InterruptedException {
		navigate.getdatastoreindexval();
		
	   
	}

	@Then("Assert datastoreindex value")
	public void assert_index_value() {
	   
		navigate.matchindexdatastore();
		
	}

}
