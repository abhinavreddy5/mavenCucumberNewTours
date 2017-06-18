package com.jpmc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Support {
	
	String supportlink="SUPPORT";
	String backHome_xpath="//a[@href='mercurywelcome.php']";
	
	public WebElement supportClick(WebDriverWait wait){
		
		return(wait.until(ExpectedConditions.elementToBeClickable(By.linkText(supportlink))));
		
	}
	
	public WebElement backHome(WebDriverWait wait){
		
		return(wait.until(ExpectedConditions.elementToBeClickable(By.xpath(backHome_xpath))));
	}

}
