package com.jpmc.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.jpmc.pageActions.NTRegisterActions;
import com.jpmc.pageActions.SupportActions;
import com.jpmc.pages.GooglePage;
import com.jpmc.pages.NewtoursHome;

 class ObjectsFactory  {
	
	WebDriver driver;
	GooglePage gp;
	NewtoursHome ntHome;
	NTRegisterActions ntRegisterActions;
	WebDriverWait wait;
	SupportActions supportActions;

}
