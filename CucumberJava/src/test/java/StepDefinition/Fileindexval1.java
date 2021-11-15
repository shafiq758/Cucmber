package StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigation_to_Unstructred_Dashboard;

public class Fileindexval1 {
	
	
	WebDriver driver;
	public Fileindexval1() {
    this.driver= GoogleSearchSteps.driver;
		
		
	}
	
	
	Navigation_to_Unstructred_Dashboard navigate;
	
	@Given("document fileindex1 value")
	public void document_index_value() throws InterruptedException {
		
		navigate = new Navigation_to_Unstructred_Dashboard();
		navigate.fileindexval1();
	   
	}
	
	@And("Remove fileindex1 value")
	public void removedocindexval() throws InterruptedException {
		navigate.removefileindexvalue1();
		
	}

	@When("Set fileindex1 val")
	public void set_index_val() throws InterruptedException {
		navigate.getfileindexval1();
		
	   
	}

	@Then("Assert fileindex1 value")
	public void assert_index_value() {
	   
		navigate.matchfileindexval1();
		
	}
	


}
