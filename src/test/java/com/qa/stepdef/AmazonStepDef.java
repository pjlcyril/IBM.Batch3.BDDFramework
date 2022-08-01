/*
 * package com.qa.stepdef;
 * 
 * import java.util.List;
 * 
 * import org.junit.Assert; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.interactions.Actions;
 * 
 * import com.qa.pages.AmazonPages;
 * 
 * import io.cucumber.java.After; import io.cucumber.java.Before; import
 * io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import
 * io.cucumber.java.en.When; import io.github.bonigarcia.wdm.WebDriverManager;
 * 
 * public class AmazonStepDef { WebDriver driver; AmazonPages AmazonOR; Actions
 * act;
 * 
 * @Before public void setUp() {
 * System.out.println("Starting Test execution.."); }
 * 
 * @After public void tearDown() {
 * System.out.println("Stopping Test execution..."); }
 * 
 * @Given("the browser is invoked") public void the_browser_is_invoked() {
 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
 * driver.manage().window().maximize(); AmazonOR = new AmazonPages(driver); act
 * = new Actions(driver); }
 * 
 * @Then("the url for amazon is entered") public void
 * the_url_for_amazon_is_entered() { driver.get("https://www.amazon.in/"); }
 * 
 * @Given("The user is on amazon home page") public void
 * the_user_is_on_amazon_home_page() { boolean contains =
 * driver.getTitle().contains("Amazon"); Assert.assertTrue(contains); }
 * 
 * @Then("select books as category") public void select_books_as_category() {
 * AmazonOR.getCategory().selectByVisibleText("Books"); }
 * 
 * @Then("type da vinci code in search text field") public void
 * type_da_vinci_code_in_search_text_field() {
 * AmazonOR.getSearchTextField().sendKeys("Da vinci code"); }
 * 
 * @When("the maginifier button is clicked") public void
 * the_maginifier_button_is_clicked() { AmazonOR.getMagnifierBtn().click(); }
 * 
 * @Then("the items related to search team should be loaded") public void
 * the_items_related_to_search_team_should_be_loaded() { List<WebElement>
 * allItems = AmazonOR.getAllItems(); for(WebElement item:allItems) {
 * System.out.println(item.getText()); } }
 * 
 * @Then("the browser should be closed") public void
 * the_browser_should_be_closed() { driver.close(); }
 * 
 * @Then("fetch all the footer link to check") public void
 * fetch_all_the_footer_link_to_check() { List<WebElement> allFooterLinks =
 * AmazonOR.getAllFooterLinks(); for(WebElement link:allFooterLinks) {
 * System.out.println(link.getText()); }
 * 
 * }
 * 
 * @When("the user does mouseover on Account and list element") public void
 * the_user_does_mouseover_on_account_and_list_element() { WebElement ele =
 * AmazonOR.getAccountsandLists(); act.moveToElement(ele).build().perform(); }
 * 
 * @Then("click the start here hyperlink") public void
 * click_the_start_here_hyperlink() { AmazonOR.getStartHereLink().click(); }
 * 
 * @Then("the user should be navigated to new user registration page") public
 * void the_user_should_be_navigated_to_new_user_registration_page() { boolean
 * contains = driver.getCurrentUrl().contains("register");
 * Assert.assertTrue(contains); }
 * 
 * @Then("type kim smith in your name text field") public void
 * type_kim_smith_in_your_name_text_field() {
 * AmazonOR.getFirstNameTxtField().sendKeys("Kim Smith"); }
 * 
 * @Then("validate total no of hyperlinks present") public void
 * validate_total_no_of_hyperlinks_present() { int size =
 * AmazonOR.getAllFooterLinks().size(); Assert.assertEquals(50, size); }
 * 
 * }
 */