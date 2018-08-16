package com.cg.project.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.github.beans.LoginPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GitHubLoginFeatureStepDefinition {
	
	
	private WebDriver driver;
	private LoginPage loginPage;
	@Before
	public void setUpStep()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Given("^User is on GitHub Login page$")
	public void user_is_on_GitHub_Login_page() throws Throwable {
		driver.get("https://github.com/login/");
		loginPage= new LoginPage();
		PageFactory.initElements(driver, loginPage);
	   
	}

	@When("^User enters invalid set of SignIn credentials$")
	public void user_enters_invalid_set_of_SignIn_credentials() throws Throwable {
		loginPage.setUserName("saikrishnarudru152904");
		loginPage.setPassword("Kittu412");
		loginPage.clickSignin();
	}

	@Then("^'Invalid Username or Password' Message is displayed$")
	public void invalid_Username_or_Password_Message_is_displayed() throws Throwable {
		
		String expectedErrorMessage="Incorrect username or password.";
		
		Assert.assertEquals(expectedErrorMessage,loginPage.getActualErrorMessage());
		driver.close();
		
	}

	@When("^User enters valid set of SignIn credentials$")
	public void user_enters_valid_set_of_SignIn_credentials() throws Throwable {
		
		loginPage.setUserName("saikrishnarudru152904");
		loginPage.setPassword("Kittu412@");
		loginPage.clickSignin();
		
	  
	}

	@Then("^User should be Succesfully Signed into GitHub account$")
	public void user_should_be_Succesfully_Signed_into_GitHub_account() throws Throwable {
	    
		WebElement actualErrorMessage=driver.findElement(By.xpath("//*[@id=\"user-links\"]/li[3]/details/summary/span"));
		actualErrorMessage.click();
		WebElement link=driver.findElement(By.xpath("//*[@id=\"user-links\"]/li[3]/details/details-menu/ul/li[1]/a/strong"));
		link.click();
		String link1=driver.getCurrentUrl();
		String expectedErrorMessage="https://github.com/saikrishnarudru152904";
		Assert.assertEquals(link1, expectedErrorMessage);
		driver.close();
		
	}

}
