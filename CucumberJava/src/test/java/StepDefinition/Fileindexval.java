package StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigation_to_Unstructred_Dashboard;

public class Fileindexval {
	
	
	WebDriver driver;
	public Fileindexval() {
    this.driver= GoogleSearchSteps.driver;
		
		
	}
	
	
	Navigation_to_Unstructred_Dashboard navigate;
	
	@Given("document fileindex value")
	public void document_index_value() throws InterruptedException {
		
		navigate = new Navigation_to_Unstructred_Dashboard();
		navigate.fileindexval();
	   
	}
	
	@And("Remove fileindex value")
	public void removedocindexval() throws InterruptedException {
		navigate.removefileindexvalue();
		
	}

	@When("Set fileindex val")
	public void set_index_val() throws InterruptedException {
		navigate.getfileindexval();
		
	   
	}

	@Then("Assert fileindex value")
	public void assert_index_value() {
	   
		navigate.matchfileindexval();
		
	}
	

}
