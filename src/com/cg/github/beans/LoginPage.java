package com.cg.github.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	@FindBy(how=How.ID, id="login_field")
	private WebElement userName;
	
	@FindBy(how=How.ID, id="password")
	private WebElement password;
	
	@FindBy(className="btn")
	private WebElement button;
	@FindBy(how=How.XPATH, xpath="//*[@id=\"js-flash-container\"]/div/div")
	private WebElement actualErrorMessage;
	
	public LoginPage() {
		
	}

	public String getUserName() {
		return userName.getAttribute("value");
	}

	public void setUserName(String userName) {
		this.userName.sendKeys(userName);
	}

	public String getPassword() {
		return password.getAttribute("value");
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}


	public void clickSignin() {
		button.submit();
	}

	public String getActualErrorMessage() {
		return actualErrorMessage.getText();
	}

	
	
}
