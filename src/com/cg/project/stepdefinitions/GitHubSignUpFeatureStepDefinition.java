package com.cg.project.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GitHubSignUpFeatureStepDefinition {
	
	private WebDriver driver;

	
	@Given("^User is on GitHub Signup page$")
	public void user_is_on_GitHub_Signup_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://github.com/join?source=header-home");
	}

	@When("^User enters valid details$")
	public void user_enters_valid_details() throws Throwable {
		
		WebElement userIdElement= driver.findElement(By.id("user_login"));
		WebElement emailElement= driver.findElement(By.id("user_email"));
		WebElement passwordElement= driver.findElement(By.id("user_password"));
		userIdElement.sendKeys("saikrishnarudru11");
		emailElement.sendKeys("saiprasad1@gmail.com");
		passwordElement.sendKeys("Saiprasad123@");
		passwordElement.submit();
		
	   
	}

	@Then("^GitHub account is created$")
	public void github_account_is_created() throws Throwable {
	   
		String id= driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[1]/p/strong")).getText();
		String actual="@saikrishnarudru11";
		Assert.assertEquals(id, actual);
		
	}

}
