package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;

public class Scenario_05SetepDef {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AccountPage accountPage = new AccountPage();
    ContactPage contactPage=new ContactPage();
    SalesPage salesPage=new SalesPage();
    @Given("user clicks the Contacts tab on the home page")
    public void user_clicks_the_contacts_tab_on_the_home_page() {
        Driver.clickWithJS(homePage.contactTab);
       //homePage.contactTab.click();
    }
    @Given("user clicks the First name on the contact page")
    public void user_clicks_the_first_name_on_the_contact_page() {
       contactPage.firstName.click();
    }


    @Given("user clicks the Email section on the contact page")
    public void user_clicks_the_email_section_on_the_contact_page() {
        //Driver.clickWithJS(contactPage.emailSection);
        Driver.wait(2);
       contactPage.emailSection.click();
    }
    @Given("user Verify that the From section is not blank")
    public void user_verify_that_the_from_section_is_not_blank() {
        contactPage.fromSection.isEnabled();
    }
    @Given("user Type a valid email address to the To section")
    public void user_type_a_valid_email_address_to_the_to_section() {
       contactPage.toSection.sendKeys(ConfigReader.getProperty("email"));
    }
    @Given("user Enter subject as “Test Email”")
    public void user_enter_subject_as_test_email() {
       contactPage.subjectSection.sendKeys(ConfigReader.getProperty("subject"));
    }
    @Given("user On the email’s body section, type “Test Body”")
    public void user_on_the_email_s_body_section_type_test_body() {
        Driver.getDriver().switchTo().frame(contactPage.emailIframe2);
        Driver.getDriver().switchTo().frame(contactPage.emailIframe);
        contactPage.emailBodySection.sendKeys(ConfigReader.getProperty("body"));

    }
    @Given("user clicks on Attach file under Body area of the email")
    public void user_clicks_on_attach_file_under_body_area_of_the_email() {
        Driver.getDriver().switchTo().defaultContent();
        Driver.clickWithJS(contactPage.attachFile);
       //contactPage.attachFile.click();
    }
    @Given("user Select one of the files previously uploaded")
    public void user_select_one_of_the_files_previously_uploaded() {
      contactPage.selectFile.click();
    }
    @Given("user clicks add button")
    public void user_clicks_add_button() {
        contactPage.addButton.click();
    }
    @Given("user Verify that the file is attached")
    public void user_verify_that_the_file_is_attached() {
       contactPage.attachFileControl.isDisplayed();
    }
    @Given("user clicks send button")
    public void user_clicks_send_button() {
        contactPage.sendButton.click();
        contactPage.acceptAndSendButton.click();

    }
    @Given("user Verify that the email is sent with a success message")
    public void user_verify_that_the_email_is_sent_with_a_success_message() {
        assert contactPage.verifySuccessMessage.isDisplayed();

    }

}
