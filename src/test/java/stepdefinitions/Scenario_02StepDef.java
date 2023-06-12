package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SalesPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Scenario_02StepDef {

    LoginPage LoginPage = new LoginPage();
    HomePage HomePage = new HomePage();
    AccountPage AccountPage = new AccountPage();

    SalesPage salesPage = new SalesPage();


    @Given("user clicks the pattern button on the home page")
    public void user_clicks_the_pattern_button_on_the_home_page() {
        HomePage.pattern.click();
    }

    @Given("user clicks the View All text on the home page")
    public void user_clicks_the_view_all_text_on_the_home_page() {
        Driver.wait(10);
        Driver.clickWithJS(HomePage.viewAll);
        //HomePage.viewAll.click();
    }

    @Given("user clicks the Sales part on the home page")
    public void user_clicks_the_sales_part_on_the_home_page() {
        Driver.wait(5);
        Driver.clickWithJS(HomePage.sales);
        //HomePage.sales.click();

    }

    @Given("user clicks the Account tab on the sales page")
    public void user_clicks_the_account_tab_on_the_sales_page() {
        Driver.wait(3);
        Driver.clickWithJS(salesPage.account);
        //salesPage.account.click();

    }

    @Given("user clicks the New button on the sales page")
    public void user_clicks_the_new_button_on_the_sales_page() {
        Driver.wait(10);
        salesPage.accountNew.click();
    }

    @Given("user enters the Account Name in the Account Name textbox on the login page")
    public void user_enters_the_account_name_in_the_account_name_textbox_on_the_login_page() {
        Driver.wait(2);
        salesPage.accountName.sendKeys(ConfigReader.getProperty("AccountName"));
    }

//    @Given("user enters the Account Region in the Account Region textbox on the login page")
//    public void user_enters_the_account_region_in_the_account_region_textbox_on_the_login_page() {
//        salesPage.accountRegion.sendKeys(ConfigReader.getProperty("AccountRegion"));
//    }

    @Given("user clicks the Save button on the sales page")
    public void user_clicks_the_save_button_on_the_sales_page() {
        salesPage.accountSave.click();
    }

    @Given("User sees that the Account Name is displayed")
    public void user_sees_that_the_account_name_is_displayed() {
        Driver.wait(2);
        assert salesPage.accountNameAssert.isDisplayed();
    }

    @Given("user clicks the Contact tab on the sales page")
    public void user_clicks_the_contact_tab_on_the_sales_page() {
        Driver.clickWithJS(salesPage.contactTab);
        //salesPage.contactTab.click();
    }

    @And("user clicks the New button on the sales page Contact")
    public void userClicksTheNewButtonOnTheSalesPageContact() {
        Driver.wait(10);
        //Driver.clickWithJS(salesPage.contactNew);
        salesPage.contactNew.click();
        Driver.wait(3);

    }

    @Given("user enters the Firstname in the Firstname textbox on the login page")
    public void user_enters_the_firstname_in_the_firstname_textbox_on_the_login_page() {
        Driver.wait(1);
        salesPage.firstName.sendKeys(ConfigReader.getProperty("FirstName"));

    }

    @Given("user enters the lastname in the lastname textbox on the login page")
    public void user_enters_the_lastname_in_the_lastname_textbox_on_the_login_page() {
        salesPage.lastName.sendKeys(ConfigReader.getProperty("LastName"));
    }

    @And("user enters the Account Name_Contact in the Account Name textbox on the login page")
    public void userEntersTheAccountName_ContactInTheAccountNameTextboxOnTheLoginPage() {
        Driver.wait(10);
        Driver.clickWithJS(salesPage.accountNameContact);
        // salesPage.accountNameContact.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(salesPage.accountNameContact, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
    }

    @And("user enters the language in the language textbox on the login page")
    public void userEntersTheLanguageInTheLanguageTextboxOnTheLoginPage() {
        salesPage.language.sendKeys(ConfigReader.getProperty("Languages"));
    }

    @And("user clicks the Save button on the sales pageContact")
    public void userClicksTheSaveButtonOnTheSalesPageContact() {
        salesPage.saveContact.click();
    }


    @Given("User sees that the Contact is displayed")
    public void user_sees_that_the_contact_is_displayed() {
        assert salesPage.ContactDisplayed.isDisplayed();
    }


    @And("user clicks the Account tab arrow on the sales page")
    public void userClicksTheAccountTabArrowOnTheSalesPage() {
        Driver.wait(3);
        salesPage.accountIcon.click();
    }

    @And("user Proceed to the CyanGate record and click on the sales page")
    public void userProceedToTheCyanGateRecordAndClickOnTheSalesPage() {
        Driver.wait(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(salesPage.accountIconfirst).click().build().perform();
        //salesPage.accountIconfirst.click();

    }


    @Given("user confirm that Brad Scott is visible as a contact in Contacts section Under the Related tab.")
    public void user_confirm_that_brad_scott_is_visible_as_a_contact_in_contacts_section_under_the_related_tab() {

    }


}
