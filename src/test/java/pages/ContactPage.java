package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactPage {
    public ContactPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //a[contains(@title,'Brad Scott')]
    @FindBy(xpath = "//a[contains(@title,'Brad Scott')]")
    public WebElement firstName;

    @FindBy(xpath = "(//*[@class='slds-icon slds-icon_small'])[5]")
    public WebElement emailSection;

    @FindBy(xpath = "//*[@class='standardField uiMenu']")
    public WebElement fromSection;
    @FindBy(xpath = "(//*[@role='combobox'])[1]")
    public WebElement toSection;

    @FindBy(xpath = "//*[@class='standardField input']")
    public WebElement subjectSection;


    @FindBy(xpath = "(//*[@class='cke_editable cke_editable_themed cke_contents_ltr']//br)[1]")
    public WebElement emailBodySection;

    @FindBy(xpath = "(//*[text()='Attach file'])[1]")
    public WebElement attachFile;

    @FindBy(xpath = "//*[@class='itemTitle slds-text-body--regular uiOutputText']")
    public WebElement selectFile;
    @FindBy(xpath = "//span[contains(text(),'Add (1)')]")
    public WebElement addButton;

    @FindBy(xpath = "//div[@class='slds-col slds-truncate']")
    public WebElement attachFileControl;
    @FindBy(xpath = "//span[normalize-space()='Send']")
    public WebElement sendButton;


    @FindBy(xpath = "//span[@class='toastMessage slds-text-heading--small forceActionsText']")
    public WebElement verifySuccessMessage;
    @FindBy(xpath = "//iframe[@title='Email Body']")
    public WebElement emailIframe;

    @FindBy(xpath = "//iframe[@title='CK Editor Container']")
    public WebElement emailIframe2;

    @FindBy(xpath = "(//*[@class='slds-button slds-button_brand'])[2]")
    public WebElement acceptAndSendButton;
    @FindBy(xpath="(//*[@title='Upload Files'])[1]")
    public WebElement uploadFile;
    //*[@input(type='file')]
    @FindBy(xpath="//input[@type='file']")
    public WebElement uploadFile2;

    @FindBy(xpath="//*[text()='Done']")
    public WebElement doneBtn;
}