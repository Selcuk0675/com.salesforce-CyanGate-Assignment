package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Scenario_01StepDef {
    LoginPage LoginPage = new LoginPage();
    HomePage HomePage = new HomePage();
    AccountPage AccountPage = new AccountPage();

    @Given("user navigates to the specified URL")
    public void user_navigates_to_the_specified_url() {
        Driver.getDriver().get(ConfigReader.getProperty("salesforceUrl"));
    }

    @Given("user clicks on the login button")
    public void user_clicks_on_the_login_button() {

        Driver.scrollEndJS();
        Driver.waitAndClick(LoginPage.login, 30);


    }

    @Given("user enters the Username in the username textbox on the login page")
    public void user_enters_the_username_in_the_username_textbox_on_the_login_page() {
        Driver.wait(5);
        LoginPage.username.sendKeys(ConfigReader.getProperty("username"));

    }

    @Given("user enters the Password in the password textbox on the login page")
    public void user_enters_the_password_in_the_password_textbox_on_the_login_page() {
        LoginPage.password.sendKeys(ConfigReader.getProperty("password"));
    }

    @Given("user clicks the login button on the login page")
    public void user_clicks_the_login_button_on_the_login_page() {
        Driver.wait(3);
        LoginPage.loginad.click();

    }

    @Given("user clicks the Object Manager on the home page")
    public void user_clicks_the_object_manager_on_the_home_page() {
        Driver.wait(3);
        HomePage.objectManager.click();

    }

    @Given("user clicks the Account on the home page")
    public void user_clicks_the_account_on_the_home_page() {
        HomePage.account.click();
    }

    @Given("user clicks the Fields and Relationships on the Account page")
    public void user_clicks_the_fields_and_relationships_on_the_account_page() {
        Driver.wait(3);
        AccountPage.fielldAndRelations.click();
    }

    @Given("user clicks the New button on the Account page")
    public void user_clicks_the_new_button_on_the_account_page() {
        Driver.wait(3);
        Driver.clickWithJS(AccountPage.newAccount);
        //AccountPage.newAccount.click();

    }

    @Given("user clicks the Text radio button on the Account page")
    public void user_clicks_the_text_radio_button_on_the_account_page() {
        Driver.wait(3);
//        Driver.scrollEndJS();
//        Driver.wait(10);
       Driver.getDriver().switchTo().frame(AccountPage.iframe);
        Driver.clickWithJS(AccountPage.text);
        //AccountPage.text.click();

    }

    @Given("user clicks the Next button on the Account page")
    public void user_clicks_the_next_button_on_the_account_page() {
        AccountPage.nextAccount.click();
        //Driver.getDriver().switchTo().defaultContent();
    }


    @Given("user enters label the Field Label textbox on the Account page")
    public void user_enters_label_the_field_label_textbox_on_the_account_page() {
        Driver.wait(3);
        AccountPage.fieldLabel.sendKeys(ConfigReader.getProperty("fieldLabel"));
    }


    @Given("user enters length the Length textbox on the Account page")
    public void user_enters_length_the_length_textbox_on_the_account_page() {
        AccountPage.length.sendKeys(ConfigReader.getProperty("Length"));
    }
    @And("user clicks the Next button on the Account pageField")
    public void userClicksTheNextButtonOnTheAccountPageField() {
        Driver.wait(2);
        AccountPage.nextField.click();
    }

    @Given("user clicks the Save button on the Account page")
    public void user_clicks_the_save_button_on_the_account_page() {
        Driver.wait(2);
        AccountPage.save.click();
    }

}
