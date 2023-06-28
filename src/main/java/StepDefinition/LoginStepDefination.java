package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {
	
	WebDriver driver; 
	
	
	@Given("User is already on Login Page")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\QA\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver(); 
	    driver.get("https://www.ebay.ca/");
	}
	
	@When("title of Login Page is  Electronics, Cars, Fashion, Collectibles & More | eBay")
	public void title_of_login_page_is_electronics_cars_fashion_collectibles_more_e_bay() {
		String title= driver.getTitle(); 
		System.out.println(title);
		Assert.assertEquals("Electronics, Cars, Fashion, Collectibles & More | eBay", title);
	}

	@Then("user clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		driver.findElement(By.linkText("Sign in")).click();
	}
	@Then("user enters \"(.*)\"$")
	public void user_enters_username(String username) {
		driver.findElement(By.id("userid")).sendKeys(username);
	}
	@And("user clicks on continue button")
	public void user_clicks_on_continue_button() throws InterruptedException {
	    driver.findElement(By.name("signin-continue-btn")).click();
	    Thread.sleep(3000);
	}
	@Then("user enter \"(.*)\"$")
	public void user_enter_password(String password) {
	    driver.findElement(By.name("pass")).sendKeys(password);
	}
	@Then("click on sign in button")
	public void click_on_sign_in_button() {
	    driver.findElement( By.name("sgnBt")).click();
	}
	@Then("user is on home page")
	public void user_is_on_home_page() {
	   String usernameLabel = driver.findElement(By.xpath("//b[contains(text(),'Shreyul')]")).getText(); 
	   System.out.println(usernameLabel);
	   Assert.assertEquals(usernameLabel, "Shreyul");
	}
	
	@Then("user quits") 
	public void user_quits () { 
		driver.quit();
	}

	
	

}
