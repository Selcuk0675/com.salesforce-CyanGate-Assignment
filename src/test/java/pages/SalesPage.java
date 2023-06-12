package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SalesPage {
    public SalesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[normalize-space()='Accounts']")
    public WebElement account;


    @FindBy(xpath = "//div[@title='New']")
    public WebElement accountNew;


    @FindBy(xpath = "//*[@name='Name']")
    public WebElement accountName;

    @FindBy(xpath = " //*[@name='Account_Region__c']")
    public WebElement accountRegion;

    @FindBy(xpath = "//*[@name='SaveEdit']")
    public WebElement accountSave;


    @FindBy(xpath = " //*[@class='custom-truncate']")
    public WebElement accountNameAssert;


    @FindBy(xpath = "//*[@title='Contacts']")
    public WebElement contactTab;

    @FindBy(xpath = " //*[@title='New']//div")
    public WebElement contactNew;

    @FindBy(xpath = "//*[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@name='Languages__c']")
    public WebElement language;

    @FindBy(xpath = "(//*[@class='slds-combobox__input slds-input'])[1]")
    public WebElement accountNameContact;

    @FindBy(xpath = "//*[@name='SaveEdit']")
    public WebElement saveContact;//button[@name='SaveEdit']

    @FindBy(xpath = "//span[@class='custom-truncate uiOutputText']")
    public WebElement ContactDisplayed;

    @FindBy(xpath = "(//*[@class='slds-icon slds-icon-text-default slds-icon_xx-small'])[5]")
    public WebElement accountIcon;

    @FindBy(xpath = "(//*[@role='menuitem'])[2]")
    public WebElement accountIconfirst;
    @FindBy(xpath = "(//*[@id='window'])[2]")
    public WebElement verifyAccountName;

}
