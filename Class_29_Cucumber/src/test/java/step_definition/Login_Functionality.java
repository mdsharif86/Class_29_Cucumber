package step_definition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Functionality extends Base {
	@Given("I am in craiglist.org")
	public void i_am_in_craiglist_org() {
	    driver.get("https://oklahomacity.craigslist.org/");
	    
	}

	@Given("I want to search the craiglist site")
	public void i_want_to_search_the_craiglist_site() {
		Boolean isSearchExists = driver.findElement(By.xpath("//input[@id='query']")).isDisplayed();
		Boolean expected = true;
		assertEquals(isSearchExists, expected); 
	}

	
}
