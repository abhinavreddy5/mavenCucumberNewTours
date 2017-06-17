package com.jpmc.stepDefinitions;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.jpmc.pageActions.NTRegisterActions;
import com.jpmc.pages.GooglePage;
import com.jpmc.pages.NewtoursHome;
import com.jpmc.pages.NewtoursRegister;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class PageSteps {
	
	WebDriver driver;
	GooglePage gp;
	NewtoursHome ntHome;
	NTRegisterActions ntRegisterActions;
	
		   
	
	@Given("^I open the Home Page$")
	public void i_open_the_Home_Page() throws Throwable {
	    
		driver=new FirefoxDriver();
		driver.get("http://www.google.com.au");
		 gp=new GooglePage(driver);
		
	    
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

//newtours
	
	@Given("^I navigate to newtours$")
	public void I_navigate_to_newtours()  {
	    
		driver=new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		
	}

	@Given("^I click \"([^\"]*)\"$")
	public void I_click(String arg1)  {
		
		ntHome=new NewtoursHome(driver);
		ntHome.clickRegister().click();
	    
	}

	@Then("^I fill the form with data$")
	public void I_fill_the_form_with_data(DataTable datatable)  {
		
		ntRegisterActions=new NTRegisterActions(driver);
		//System.out.println(ntRegisterActions.getJ());
		
		System.out.println(ntRegisterActions);
	     
		ntRegisterActions.formFill(datatable);
	    
	   
	   
	    }
	    
	    
	    
	   

}

