package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigation_to_Unstructred_Dashboard;
public class NaviagtetoDashboard {
	
	WebDriver driver;
	public NaviagtetoDashboard() {
		this.driver= GoogleSearchSteps.driver;
		
		
	}
	Navigation_to_Unstructred_Dashboard navigate;
	@Given("Click on Panel list")
	public void click_on_panel_list() throws InterruptedException {
		navigate = new Navigation_to_Unstructred_Dashboard();
		navigate.click_dasboard();
	}

	@When("user clicks on dasboard filter")
	public void user_clicks_on_dasboard_filter() throws InterruptedException {
		navigate.clicksensitivedata();
	    
	}

	@And("Click on datastore")
	public void click_on_datastore() throws InterruptedException {
		navigate.clickfilterbutton();
	   
	}

	@Then("select datastore")
	public void select_datastore() throws InterruptedException {
		navigate.select_data_intelligence();
	
	  
	}
	
	
	
}
