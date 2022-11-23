package org.BDDtestingoctnov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefinitionparabank1_Runner1_ParabankFeature1  {

public WebDriver driver;


@Given("users is navigated to the parabank url")
public void users_is_navigation_to_the_parabank_url()

{

	WebDriverManager.chromedriver().setup(); 
	ChromeDriver driver=new ChromeDriver(); 
driver.get("https://parabank.parasoft.com/parabank/index.htm"); // launch the website
driver.manage().window().maximize();  // its not mandatory
System.out.println("ParaBank homepage is launched successfully");

}

@When("usernames and password are valid")
public void usernames_password_are_valid()
{

driver.findElement(By.name("username")).sendKeys("naz123456"); // username is locator for user id and password is locator for password field
driver.findElement(By.name("password")).sendKeys("abc123456	");
System.out.println("Valid username and passwors are entered, sendkeys are working successfully");
}


@And("click on login button")
public void click_on_login_button()
{

driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();//xpath for login button
System.out.println("Click on login button");
}


@Then("display the user home pages")
public void display_the_uer_home_pages()

{
boolean status = driver.findElement(By.partialLinkText("New Account")).isDisplayed();
if(status)
{
System.out.println("user home page is displayed successfully");	

}
}
}
