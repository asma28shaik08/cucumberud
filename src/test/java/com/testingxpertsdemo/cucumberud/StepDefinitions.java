package com.testingxpertsdemo.cucumberud;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions
{
	public WebDriver driver=null;
	@Given("open  a browser")
	public void open_a_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\workspace1\\cucumberud\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	  
	}

	@When("Enter the url {string}")
	public void enter_the_url(String string)
	{
	    driver.get("https://www.amazon.in/");
	}

	@When("user Search a product  on the Homepage")
	public void user_search_a_product_on_the_homepage()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
	    driver.findElement(By.id("nav-search-submit-button")).click();

	}

	@Then("user should be able to view product information related to product searched")
	public void user_should_be_able_to_view_product_information_related_to_product_searched()
	{
		driver.findElement(By.linkText("Redmi 9A (Nature Green, 2GB RAM, 32GB Storage) | 2GHz Octa-core Helio G25 Processor | 5000 mAh Battery")).click();
	  // driver.findElement(By.linkText("Samsung Galaxy M12 (Black,6GB RAM, 128GB Storage) 6 Months Free Screen Replacement for Prime")).click();
		ArrayList<String>  tabs=new ArrayList<String> (driver.getWindowHandles());
		//ArrayList<String>  tabs1=new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
	}

	@And("user click on add to cart button")
	public void user_click_on_add_to_cart_button()
	{
		driver.findElement(By.xpath("//span[@class='a-button-inner']//input[@class='a-button-input attach-dss-atc']")).click();
		//driver.findElement(By.xpath("//span[@class='a-button-inner']//input[@id='add-to-cart-button']")).click();
	    
	}

	@Then("user verifies if the product is added to cart")
	public void user_verifies_if_the_product_is_added_to_cart()
	{
	 System.out.println("succefully completed");
	}


}
