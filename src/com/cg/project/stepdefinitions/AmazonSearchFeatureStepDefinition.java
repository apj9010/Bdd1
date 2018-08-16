package com.cg.project.stepdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSearchFeatureStepDefinition {
	
	private WebDriver driver;
	
	
	@Given("^User is on Amazon home page$")
	public void user_is_on_Amazon_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dgooginabkkenshoo-21%26ascsubtag%3D3f6c8cad-3873-4d5b-8428-c3ec3d185830%26ie%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&openid.pape.max_auth_age=0");
		WebElement searchElement = driver.findElement(By.id("ap_email"));
		searchElement.sendKeys("sai.rudru@gmail.com");
		searchElement.submit();
		WebElement searchElement1 = driver.findElement(By.id("ap_password"));
		searchElement1.sendKeys("saikrish3063");
		searchElement1.submit();
	}

	@When("^User searches for 'Redmi (\\d+)'$")
	public void user_searches_for_Redmi(int arg1) throws Throwable {
		WebElement searchElement = driver.findElement(By.id("twotabsearchtextbox"));
		searchElement.sendKeys("Redmi 5");
		searchElement.submit();
	}

	
	@Then("^User should get all the models related to 'Redmi (\\d+)'Then open the product details$")
	public void user_should_get_all_the_models_related_to_Redmi_Then_open_the_product_details(int arg1) throws Throwable {
		WebElement searchElement = driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div/div/div[2]/div[1]/div[1]/a/h2"));
		//("//*[@id=\"pdagDesktopSparkleDescription1\"]"))
		searchElement.click();
		String title=driver.getTitle();
		String actual="Redmi 5 (Black, 32GB): Amazon.in: Electronics";
	}	
}