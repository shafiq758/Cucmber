package StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigation_to_Unstructred_Dashboard;

public class Docindexval2 {
	WebDriver driver;
	public Docindexval2() {
    this.driver= GoogleSearchSteps.driver;
		
		
	}
	
	
	Navigation_to_Unstructred_Dashboard navigate;
	
	@Given("document index2 value")
	public void document_index_value() throws InterruptedException {
		
		navigate = new Navigation_to_Unstructred_Dashboard();
		navigate.docinndexval3();
	   
	}
	
	@And("Remove docindex1 value")
	public void removedocindexval() throws InterruptedException {
		navigate.removedoc2();
		
	}

	@When("Set index2 val")
	public void set_index_val() throws InterruptedException {
		navigate.getdocindexval3();
		
	   
	}

	@Then("Assert index2 value")
	public void assert_index_value() {
	   
		navigate.matchindex3();
		
	}
	
}
