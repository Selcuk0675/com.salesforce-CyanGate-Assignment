package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath=" //a[contains(@class,'tabHeader slds-context-bar__label-action')]//span[@class='title slds-truncate'][normalize-space()='Object Manager']")
    public WebElement objectManager;

    @FindBy(xpath="//th[contains(@scope,'row')]//a[normalize-space()='Account']")
    public WebElement account;


    @FindBy(xpath="//div[@class='slds-r5']")
    public WebElement pattern;


    @FindBy(xpath="//*[@class='slds-button slds-p-horizontal--small']")
    public WebElement viewAll;


    @FindBy(xpath="//*[@title='Manage your sales process with accounts, leads, opportunities, and more']")
    public WebElement sales;


    @FindBy(xpath="//*[@title='Contacts']")
    public WebElement contactTab;


}
