package com.jpmc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	
	
	@FindBy(how=How.ID, using="lst-ib")
	WebElement searchBox;

	
	public GooglePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public WebElement search(){
		
		return searchBox;
		
	}

}
