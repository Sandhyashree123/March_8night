package com.step;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefiniation extends Baseclass {

	
		@Given("User should be in the URL webpage")
		public void TC1() {
			browserLaunch("http://adactinhotelapp.com/");
		 
		}


		@When("User Should enters {string} and {string}")
		public void TC02(String string, String string2) {
			WebElement txtuser = locateElementmethod2("id" , "username");
			enterText(txtuser,"Sandhyasaurabh");
			WebElement txtpassword = locateElementmethod2("name","password");
			enterText(txtpassword,"12345678" );
		}

		@When("User Should click on the button")
		public void Tc03() {
		    WebElement loginbutton = loginbutton();
		    loginbutton.click();
		    
		}

		@Then("User Should received login sucessfully message")
		public void TC04() {
			Assert.assertTrue(true);
		    System.out.println("Suceesfully message receiveed");
		}

	}


