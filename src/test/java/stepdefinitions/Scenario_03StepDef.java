package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SalesPage;
import utilities.Driver;

public class Scenario_03StepDef {
    pages.LoginPage loginPage = new LoginPage();
    pages.HomePage homePage = new HomePage();
    pages.AccountPage accountPage = new AccountPage();

    SalesPage salesPage=new SalesPage();

    @Given("user clicks the First Account name on the account page")
    public void user_clicks_the_first_account_name_on_the_account_page() {
        Driver.wait(3);
       accountPage.accountNameFirst.click();
    }

    @Given("user clicks the Details part on the account page")
    public void user_clicks_the_details_part_on_the_account_page() {
       accountPage.details.click();
    }

    @Given("user clicks Verify that the Account Owner field shows you as the logged-in user account page")
    public void user_clicks_verify_that_the_account_owner_field_shows_you_as_the_logged_in_user_account_page() {
      accountPage.accountOwner.isDisplayed();
    }

    @Given("user clicks the ChangeOwner button on the account page")
    public void user_clicks_the_change_owner_button_on_the_account_page() {
       accountPage.changeOwner.click();
    }

    @Given("user sends Search Box to Integration User on the sales page")
    public void user_sends_search_box_to_ıntegration_user_on_the_sales_page() {
        Driver.wait(3);
        accountPage.SearchBox.sendKeys("Integration User");
    }

    @Given("user clicks the Integration User on the account page")
    public void user_clicks_the_ıntegration_user_on_the_account_page() {
        accountPage.integrationUser.click();
    }

    @And("user clicks the Change owner button on the account page")
    public void userClicksTheChangeOwnerButtonOnTheAccountPage() {
        Driver.wait(2);
        accountPage.changeOwnerButton.click();

    }

    @Given("user Verify that the Account owner is now Integration User")
    public void user_verify_that_the_account_owner_is_now_ıntegration_user() {
        accountPage.integrationUserVerify.isDisplayed();
    }


}
