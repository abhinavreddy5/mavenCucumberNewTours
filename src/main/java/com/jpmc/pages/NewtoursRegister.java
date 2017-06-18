package com.jpmc.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewtoursRegister {
	

	@FindBy(how=How.NAME, using="firstName")
	WebElement firstName;
	
	@FindBy(how=How.NAME, using="lastName")
	WebElement lastName;
	
	@FindBy(name="country")
	WebElement country;
	
	
	
	public NewtoursRegister(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
		
	}
	

	
	
	public WebElement firstName(){
		
		return firstName;
		
		
	}

	public WebElement lastName(){
		return lastName;
	}
	
	public WebElement country(){
		return country;
	}
	
	
}

