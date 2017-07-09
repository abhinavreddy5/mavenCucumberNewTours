package com.jpmc.pageActions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.jpmc.pages.NewtoursRegister;

import cucumber.api.DataTable;

public class NTRegisterActions extends NewtoursRegister {
	
public NTRegisterActions(WebDriver driver) {
		super(driver);
		
	}



public void formFill(DataTable datatable){
		

		List<Map<String,String>> dataArray=datatable.asMaps(String.class,String.class);  // asMaps() method takes two arguments on for key type and one for value type
		 String field=null;
		    String value=null;
		    
		    //for(Map<String,String> data:datatable.asMaps(String.class,String.class)) 
		 for(Map<String,String> data:dataArray){
		    	
		    	field=data.get("Fields");
		    	value=data.get("Value");
		    	
		    	if(field.contains("First_Name"))
		    		firstName().sendKeys(value);
		    	
		    	
		    	if(field.contains("Last_Name"))
		    		lastName().sendKeys(value);
		    	
		    	if(field.contains("Country")){
		    		
		    		Select select=new Select(country());
		    		
		    		select.selectByVisibleText("INDIA");
		    	}
		    		
		
	}

	}



}
