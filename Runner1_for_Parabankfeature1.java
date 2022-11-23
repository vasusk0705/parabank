// reports will be in the location
// C:\Users\DELL\eclipse-workspace\org.octtestingbatch.vas\reports
//Difference: implements means you are using the elements of a Java Interface in your class. extends means that you are creating a subclass of the base class you are extending.
package org.BDDtestingoctnov;

import io.cucumber.testng.AbstractTestNGCucumberTests;//which is used to run the feature file scenarios

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features=".\\Features\\parabank1.feature", glue="org.BDDtestingoctnov", // basically it maps stepdefintion with feature file with same wording Given etc, if any duplicate of same step definiton it throwserror. 
dryRun=false,  // The default value of dry run is false and it is a part of the Test Runner Class fill
//  Dry-run is used to compile feature files and step definitions in cucumber. It is specially used in the stage when you will have to see if there are any compilation errors, to check that you can use dry-run. 
plugin = {"json:reports/jsonreport.json" ,"html:reports/cucumber-reports.html"}
)

public class Runner1_for_Parabankfeature1 extends AbstractTestNGCucumberTests
{


}