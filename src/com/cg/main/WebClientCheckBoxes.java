package com.cg.main;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebClientCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver.exe");
		
		//WebClientCheckBoxes.checkBoxMethod();
		
		//WebClientCheckBoxes.radioButtonMethod();
		
		WebClientCheckBoxes.selectTest();

	}
	
	public static void checkBoxMethod() throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/srudru/Desktop/CheckBoxes.html");
		WebElement  checkBox=driver.findElement(By.id("mayoCheckBox"));
		Thread.sleep(2000);
		checkBox.click();
		if (checkBox.isSelected()) {
			System.out.println("Value of checkBox is : "+checkBox.getAttribute("value"));
			
		}
	}
	
	
public static void radioButtonMethod() throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/srudru/Desktop/RadioButton.html");
		By elements= By.name("color");
		List<WebElement> radioButtons=driver.findElements(elements);
		
		WebElement radioBtn=radioButtons.get(2);
		
		radioBtn.click();
		 for (WebElement webElement : radioButtons) {
			 if (webElement.isSelected()) {
				 System.out.println(webElement.getAttribute("value"));
				
			}
			
		}
	}

public static void selectTest() {
	
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/srudru/Desktop/SelectionTest.html");
	WebElement selectedElement=driver.findElement(By.id("selecttest"));
	Select select= new Select(selectedElement);
	select.selectByVisibleText("MayBe");
	
	
	
	
}


	
	

}
