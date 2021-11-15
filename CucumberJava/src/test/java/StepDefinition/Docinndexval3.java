package StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigation_to_Unstructred_Dashboard;

public class Docinndexval3 {
	
	
	WebDriver driver;
	public Docinndexval3() {
    this.driver= GoogleSearchSteps.driver;
		
		
	}
	
	
	Navigation_to_Unstructred_Dashboard navigate;
	
	@Given("document index3 value")
	public void document_index_value() throws InterruptedException {
		
		navigate = new Navigation_to_Unstructred_Dashboard();
		navigate.docindexval4();
	   
	}
	
	@And("Remove docindex2 value")
	public void removedocindexval() throws InterruptedException {
		navigate.removedoc3();
		
	}

	@When("Set index3 val")
	public void set_index_val() throws InterruptedException {
		navigate.getdocindexval4();
		
	   
	}

	@Then("Assert index3 value")
	public void assert_index_value() {
	   
		navigate.matchindex4();
		
	}
	

}
