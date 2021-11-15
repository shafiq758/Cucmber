package StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigation_to_Unstructred_Dashboard;

public class Docindexval1 {
	
	
	WebDriver driver;
	public Docindexval1() {
    this.driver= GoogleSearchSteps.driver;
		
		
	}
	
	
	Navigation_to_Unstructred_Dashboard navigate;
	
	@Given("document index1 value")
	public void document_index_value() throws InterruptedException {
		
		navigate = new Navigation_to_Unstructred_Dashboard();
		navigate.docindexvalue1();
	   
	}
	
	@And("Remove docindex value")
	public void removedocindexval() throws InterruptedException {
		navigate.removedoc();
		
	}

	@When("Set index1 val")
	public void set_index_val() throws InterruptedException {
		navigate.getdocindexval2();
		
	   
	}

	@Then("Assert index1 value")
	public void assert_index_value() {
	   
		navigate.matchdocindex1();
		
	}
	
	


}
