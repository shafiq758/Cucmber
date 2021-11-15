package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	public LoginSteps() {
		this.driver= GoogleSearchSteps.driver;
		
		
	}
	@And("User is on google search")
	public void user_is_on_google_search() {
		 driver.get("https://app.securiti.ai/");
		
	}

	@When("user ennter text in goolge search box")
	public void user_ennter_text_in_goolge_search_box() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin@uidsautomation.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Privaci@1234");
	}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@Then("User is navigated to search based result")
	public void user_is_navigated_to_search_based_result() {
		driver.getPageSource().contains("Welcome, Admin");
		
	//	driver.close();
	//	driver.quit();
	}
}
