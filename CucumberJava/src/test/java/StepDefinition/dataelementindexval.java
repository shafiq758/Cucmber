package StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigation_to_Unstructred_Dashboard;

public class dataelementindexval 
{
	WebDriver driver;
	public dataelementindexval() {
    this.driver= GoogleSearchSteps.driver;
		
		
	}
	
	
	Navigation_to_Unstructred_Dashboard navigate;
	
	@Given("document dataelementindex value")
	public void document_index_value() throws InterruptedException {
		
		navigate = new Navigation_to_Unstructred_Dashboard();
		navigate.dataelementindexval();
	   
	}
	
	@And("Remove dataelementindex value")
	public void removedocindexval() throws InterruptedException {
		navigate.removedataelement();
		
	}

	@When("Set dataelementindex val")
	public void set_index_val() throws InterruptedException {
		navigate.getdataelementindexval();
		
	   
	}

	@Then("Assert dataelementindex value")
	public void assert_index_value() {
	   
		navigate.matchdataelementindexval();
		
	}
	
	

}
