package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//*[text()='Log in']")
    public WebElement login;

    @FindBy(xpath="//*[@id='username']")
    public WebElement username;

    @FindBy(xpath="//*[@id='password']")
    public WebElement password;


    @FindBy(xpath="//*[@id='Login']")
    public WebElement loginad;



}
