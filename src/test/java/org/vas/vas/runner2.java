// plugin={"pretty","html:target/myresults"}

package org.vas;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features=".\\Features\\googlesearch.feature", 
	                 glue="org.BDDtestingoctnov",
	                 plugin = {"json:reports/jsonreport.json" ,"html:reports/cucumber-reports.html"},
	                 monochrome=true)
	public class runner extends AbstractTestNGCucumberTests
	{

}
	