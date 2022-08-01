package com.qa.DDT;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.pages.AmazonPages;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDDTStepDef {

	WebDriver driver;
	AmazonPages AmazonOR;
	Actions act;


	@Given("the browser is invoked")
	public void the_browser_is_invoked() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		AmazonOR = new AmazonPages(driver);
		act = new Actions(driver);
		driver.manage().window().maximize();
	}

	@Then("the url for amazon is entered")
	public void the_url_for_amazon_is_entered() {
		driver.get("https://www.amazon.in/");
	}

	@Given("The user is on amazon home page")
	public void the_user_is_on_amazon_home_page() {
		boolean contains = driver.getTitle().contains("Amazon");
		Assert.assertTrue(contains);
	}

	@When("the user does mouseover on Account and list element")
	public void the_user_does_mouseover_on_account_and_list_element() {
		WebElement ele = AmazonOR.getAccountsandLists();
		act.moveToElement(ele).build().perform();
	}

	@Then("click the start here hyperlink")
	public void click_the_start_here_hyperlink() {
		AmazonOR.getStartHereLink().click();
	}

	@Then("the user should be navigated to new user registration page")
	public void the_user_should_be_navigated_to_new_user_registration_page() {
		boolean contains = driver.getTitle().contains("Registration");
		Assert.assertTrue(contains);
	}

	@Then("type name in your name text field")
	public void type_name_in_your_name_text_field(DataTable UserName) throws InterruptedException {
		List<String> UserNames = UserName.asList();
		for(String name: UserNames) {
			AmazonOR.getFirstNameTxtField().clear();
			AmazonOR.getFirstNameTxtField().sendKeys(name);
			Thread.sleep(3000);
		}
	}

	@Then("the browser should be closed")
	public void the_browser_should_be_closed() {
		driver.close();
	}

	@Then("select {string} from all categories list")
	public void select_from_all_categories_list(String Category) throws InterruptedException {

		AmazonOR.getCategory().selectByVisibleText(Category);
		Thread.sleep(3000);
	}

	@Then("type {string} into the search text field")
	public void type_into_the_search_text_field(String ItemName) throws InterruptedException {
		AmazonOR.getSearchTextField().clear();
		AmazonOR.getSearchTextField().sendKeys(ItemName);
		Thread.sleep(3000);
	}

	@When("the maginifier button is clicked")
	public void the_maginifier_button_is_clicked() {
		AmazonOR.getMagnifierBtn().click();
	}

	@Then("the items related to search team should be loaded")
	public void the_items_related_to_search_team_should_be_loaded() {
		List<WebElement> allItems = AmazonOR.getAllItems();
		for(WebElement item:allItems) {
			System.out.println(item.getText());
		}
	
	}


}
