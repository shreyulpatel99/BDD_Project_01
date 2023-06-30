package StepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddToCartStepDefinition {
	
	WebDriver driver; 
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\QA\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver(); 
	    driver.get("https://www.ebay.ca/");   
	}
	
	@Then("user has to click on sign in button")
	public void user_has_to_click_on_sign_in_button() {
		driver.findElement(By.linkText("Sign in")).click();
	}
	
	@Then("user enters the username to login")
	public void user_enters_the_username_to_login(DataTable username) {
		List<String> data = username.row(0); 
		driver.findElement(By.id("userid")).sendKeys(data.get(0));
	}
	
	@Then("user has to click on continue button")
	public void user_has_to_click_on_continue_button() throws InterruptedException {
	    driver.findElement(By.name("signin-continue-btn")).click();
	    Thread.sleep(3000);
	}
	
	@Then("user enters the password to login")
	public void user_enters_the_password_to_login(DataTable password) {
		List<String> data = password.row(0);
		driver.findElement(By.name("pass")).sendKeys(data.get(0));
	    
	}
	@Then("user clicks on signin button")
	public void user_clicks_on_signin_button() {
		driver.findElement( By.name("sgnBt")).click();
	}
	
	@Then("user selects an item and add it to the cart")
	public void user_selects_an_item_and_add_it_to_the_cart() throws InterruptedException {
		driver.findElement(By.className("hl-item__displayPrice")).click();
		driver.findElement(By.className("ux-call-to-action__cell")).click();
		Thread.sleep(10000);
	}
	
	@Then("user fills the delivery information")
	public void user_fills_the_delivery_information(DataTable deliveryinfo) {
		//as map in for loop so we can use the data in loop
		//this is not create different test cases, so it will use all the values in a single test case 
		//when you specify the examples in feature file that will use different scenarios and will give you different test cases 
		for(Map<String,String> delivery : deliveryinfo.asMaps(String.class,String.class)) {
		driver.findElement(By.name("address1")).sendKeys(delivery.get("address")); 
		driver.findElement(By.name("city")).sendKeys(delivery.get("city"));
		driver.findElement(By.name("zip")).sendKeys(delivery.get("zipcode"));
		driver.findElement(By.name("phoneFlagComp1")).sendKeys(delivery.get("contactno"));
		
		}
	}
	
	@Then("user closes the browser")
	public void user_closes_the_browser() {
		driver.quit();
	}
	
	
	

}
