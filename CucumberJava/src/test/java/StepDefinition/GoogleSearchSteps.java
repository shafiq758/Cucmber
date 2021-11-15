package StepDefinition;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	public static WebDriver driver=null;
	
	@Given("browser is open")
	public void browser_is_open() {
		  System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver 2");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	       
	        WebDriverWait wait = new WebDriverWait(driver, 60);
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    
	}

	



}
