package com.jpmc.pageActions;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.jpmc.pages.Support;

public class SupportActions extends Support{
	
	public void clickSupport(WebDriverWait wait){
		
		supportClick(wait).click();
		
	}
	
	public void clickBackHome(WebDriverWait wait){
		
		backHome(wait).click();
		
	}

}
