package StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigation_to_Unstructred_Dashboard;

public class dataelementinndexval1 {
	
	WebDriver driver;
	public dataelementinndexval1() {
    this.driver= GoogleSearchSteps.driver;
		
		
	}
	
	
	Navigation_to_Unstructred_Dashboard navigate;
	
	@Given("document dataelementindex1 value")
	public void document_index_value() throws InterruptedException {
		
		navigate = new Navigation_to_Unstructred_Dashboard();
		navigate.dataelementindexval1();
	   
	}
	
	@And("Remove dataelementindex1 value")
	public void removedocindexval() throws InterruptedException {
		navigate.removedataelementindexval1();
		
	}

	@When("Set dataelementindex1 val")
	public void set_index_val() throws InterruptedException {
		navigate.getdataelementindexval1();
		
	   
	}

	@Then("Assert dataelementindex1 value")
	public void assert_index_value() {
	   
		navigate.matchdatastoreindexval1();
		
	}
	

}
