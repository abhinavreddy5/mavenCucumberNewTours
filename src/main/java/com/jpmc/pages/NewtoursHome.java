package com.jpmc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewtoursHome {

	@FindBy(how=How.LINK_TEXT,using="REGISTER")
	WebElement register;
	
	public NewtoursHome(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement clickRegister(){
		
		return register;
	}
}
