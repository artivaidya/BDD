package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomepageSteps {
	
	WebDriver driver;
	@Given("I navigate to the QTrip Dynamic homepage")
	public void i_navigate_to_the_q_trip_dynamic_homepage() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://qtripdynamic-qa-frontend.vercel.app/index.html");
	}   

	@When("I check the page title")
	public void i_check_the_page_title() {
		String Acttitle= driver.getTitle();
		//Assert.assertEquals("QTrip Dynamic", title);
	    
	}

	@Then("the title should be {string}")
	public void the_title_should_be(String Acttitle) {
		
	    String Exptitle="https://qtripdynamic-qa-frontend.vercel.app/index.html";
	    Assert.assertEquals(Acttitle, Exptitle);
	}

	@And("I should see the search box")
	public void i_should_see_the_search_box() {
		WebElement searchbox= driver.findElement(By.id("search"));
	    Assert.assertTrue(searchbox.isDisplayed());
	}

	@And("I should see the navbar")
	public void i_should_see_the_navbar() {
		
	    WebElement navbar=driver.findElement(By.className("navbar"));
	    Assert.assertTrue(navbar.isDisplayed());
	}




}
