package com.testrun;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Report;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Desktop\\March_8_Adactin\\src\\test\\resources\\march8login.feature",glue="com.step",
plugin= {"json:C:\\Users\\Admin\\Desktop\\March_8_Adactin\\target\\login_Adactin"})
public class TestRunner {

	@AfterClass
	public static void tc01() {
		 Report.JVMreport("C:\\Users\\Admin\\Desktop\\March_8_Adactin\\target\\login_Adactin");
	}

	}


