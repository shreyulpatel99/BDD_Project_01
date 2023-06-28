package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefinition {
	
	WebDriver driver; 
	
	@Given("^user is already on Login Page")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\QA\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver(); 
	    driver.get("https://www.ebay.ca/");
	}
	
	@When("title of Login Page is Electronics, Cars, Fashion, Collectibles & More | eBay")
	public void title_of_login_page_is_electronics_cars_fashion_collectibles_more_e_bay() {
		String title= driver.getTitle(); 
		System.out.println(title);
		Assert.assertEquals("Electronics, Cars, Fashion, Collectibles & More | eBay", title);
	}

	@Then("^user clicks on sign in button for home page")
	public void user_clicks_on_sign_in_button() {
		driver.findElement(By.linkText("Sign in")).click();
	}
	@Then("^user enters username for home page \"(.*)\"$")
	public void user_enters_username(String username) {
		driver.findElement(By.id("userid")).sendKeys(username);
	}
	@And("^user clicks on continue button for home page")
	public void user_clicks_on_continue_button() throws InterruptedException {
	    driver.findElement(By.name("signin-continue-btn")).click();
	    Thread.sleep(3000);
	}
	@Then("^user enters password for home page \"(.*)\"$")
	public void user_enter_password(String password) {
	    driver.findElement(By.name("pass")).sendKeys(password);
	}
	@Then("^click on sign in button for home page")
	public void click_on_sign_in_button() {
	    driver.findElement( By.name("sgnBt")).click();
	}
	

	@Then("^user clicks on the link \"(.*)\"$")
	public void user_clicks_on_the_link(String linkname) {
		driver.findElement(By.linkText(linkname)).click();
	}

	
	@Then("^user quits the browser") 
	public void user_quits () { 
		driver.quit();
	}


}
