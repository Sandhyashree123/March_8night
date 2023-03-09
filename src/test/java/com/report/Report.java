package com.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {

	
		
		public static void JVMreport(String json) {
			
			File f = new File("C:\\Users\\Admin\\Desktop\\March_8_Adactin\\target");
			
			Configuration c = new Configuration(f,"Santhiya_JVM_Report_Adactin");
			
			c.addClassifications("Tool", "eclipse");
			c.addClassifications("os", "window10");
			
			List<String> li =new LinkedList<String>();
			li.add(json);
			
			ReportBuilder r = new ReportBuilder(li,c);
			r.generateReports();
		}

	}


