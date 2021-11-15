package StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigation_to_Unstructred_Dashboard;

public class Fileindexval2 {
	
	
	WebDriver driver;
	public Fileindexval2() {
    this.driver= GoogleSearchSteps.driver;
		
		
	}
	
	
	Navigation_to_Unstructred_Dashboard navigate;
	
	@Given("document fileindex2 value")
	public void document_index_value() throws InterruptedException {
		
		navigate = new Navigation_to_Unstructred_Dashboard();
		navigate.fileindexval2();
	   
	}
	
	@And("Remove fileindex2 value")
	public void removedocindexval() throws InterruptedException {
		navigate.removefileindexvalue2();
		
	}

	@When("Set fileindex2 val")
	public void set_index_val() throws InterruptedException {
		navigate.getfileindexval2();
		
	   
	}

	@Then("Assert fileindex2 value")
	public void assert_index_value() {
	   
		navigate.matchfileindexval2();
		
	}
	


}
