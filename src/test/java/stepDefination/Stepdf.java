package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdf {
	
	public WebDriver driver;
	 //Green cart (page search and place the order for green cart)
    
    @Given("user is on greencart landing page")
    public void user_is_on_greencart_landing_page() throws InterruptedException 
    {
    System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Chrome91\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    Thread.sleep(3000);
    driver.manage().window().maximize();
    Thread.sleep(3000);
    }
    @When("user search for {string} vegetable")
    public void user_search_for_vegetable(String string) throws InterruptedException 
    {
    	//xpath: syntax:tagname[attribute='value']
    	driver.findElement(By.xpath("//input[@type='search']")).sendKeys(string);
    	Thread.sleep(3000);
        //System.out.println(string);
    }
    @Then("{string} results are displayed")
    public void results_are_displayed(String string1) 
    {
    Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(string1));  
    }
}
