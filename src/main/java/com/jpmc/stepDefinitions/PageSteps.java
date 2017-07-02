package com.jpmc.stepDefinitions;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.jpmc.pageActions.NTRegisterActions;
import com.jpmc.pageActions.SupportActions;
import com.jpmc.pages.GooglePage;
import com.jpmc.pages.NewtoursHome;
import com.jpmc.pages.NewtoursRegister;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class PageSteps extends PageStepsObjects {
	
		   
	
	//google page
	
	@Given("^I open the Home Page$")
	public void i_open_the_Home_Page() throws Throwable {
	    
		//driver=new FirefoxDriver();
		driver.get("http://www.google.com.au");
		 gp=new GooglePage(driver);
		System.out.println("Hey There its Eclipse");
		
	    
	}

	@Then("^I Enter the text data \"([^\"]*)\"$")
	public void i_Enter_the_text_data(String text) {
		
		gp.search().sendKeys(text);
		System.out.println("Entered text = "+text);
		
	}
	
	@Then("^I close the browser$")
	public void tearDown(){
		driver.quit();
	}

//newtours navigation
	
	@Given("^I navigate to newtours$")
	public void I_navigate_to_newtours()  {
	    
		driver=new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		
	}

	
	//register page
	
	@Given("^I click \"([^\"]*)\"$")
	public void I_click(String arg1)  {
		
		ntHome=new NewtoursHome(driver);
		System.out.println("Clicking Register "+arg1);
		ntHome.clickRegister().click();
	    
	}

	@Then("^I fill the form with data$")
	public void I_fill_the_form_with_data(DataTable datatable)  {
		
		ntRegisterActions=new NTRegisterActions(driver);
	     
		
		ntRegisterActions.formFill(datatable);

	   
	    }
	    
//support page
	
	@Then("^I Click on support$")
	public void I_Click_on_support()  {
		
		wait=new WebDriverWait(driver,10000);
		
		 supportActions=new SupportActions();
		supportActions.clickSupport(wait);
		
		
	    
		
	}

	@Then("^I click on Back$")
	public void I_click_on_Back()  {
	   
		if (wait==null){
			wait=new WebDriverWait(driver,10000);
		}
	
	if (supportActions==null){
		supportActions=new SupportActions();
	}
		
	supportActions.clickBackHome(wait);
	}
	    
	   

}

