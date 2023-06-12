package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;
import pages.*;
import utilities.Driver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

public class Scenario_04StepDef {
    pages.LoginPage hoginPage = new LoginPage();
    pages.HomePage homePage = new HomePage();
    pages.AccountPage accountPage = new AccountPage();

    SalesPage salesPage = new SalesPage();
    ContactPage contactPage = new ContactPage();


    @And("user upload files on the account page")
    public void userUploadFilesOnTheAccountPage() {

        ((JavascriptExecutor) Driver.getDriver()).
                executeScript("arguments[0].classList.remove('slds-assistive-text')", contactPage.uploadFile2);

        contactPage.uploadFile2.sendKeys(
                "C:\\Users\\User\\OneDrive\\Masaüstü\\File 1.txt \n C:\\Users\\User\\OneDrive\\Masaüstü\\File 2.txt \n C:\\Users\\User\\OneDrive\\Masaüstü\\File 3.txt \n C:\\Users\\User\\OneDrive\\Masaüstü\\File 4.txt");
        Driver.wait(25);
        contactPage.doneBtn.click();
        Driver.wait(20);
       accountPage.filesBtn.click();

    }

    @Then("user downloads, verifies and deletes all the files one by one")
    public void userDownloadsVerifiesAndDeletesAllTheFilesOneByOne() {

        for (int i = 1; i <= 4; i++) {
            Driver.wait(2);
            Driver.clickWithJS(accountPage.filesList.get(i));
            Driver.wait(5);
            Driver.clickWithJS(accountPage.downloadBtn);
            Driver.wait(2);
            File file = new File("C:\\Users\\User\\Downloads\\File " + i + ".txt");
            Assert.assertTrue(file.exists());
            file.delete();
        }

    }


}
