package StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigation_to_Unstructred_Dashboard;

public class Docindexval {
	

	WebDriver driver;
	public Docindexval() {
    this.driver= GoogleSearchSteps.driver;
		
		
	}
	
	
	Navigation_to_Unstructred_Dashboard navigate;
	
	@Given("document index value")
	public void document_index_value() throws InterruptedException {
		
		navigate = new Navigation_to_Unstructred_Dashboard();
		navigate.docindexvalue();
	   
	}

	@When("Set index val")
	public void set_index_val() throws InterruptedException {
		navigate.getdocindexval();
		
	   
	}

	@Then("Assert index value")
	public void assert_index_value() {
	   
		navigate.matchdocindexval();
		
	}


}
