package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AccountPage {
    public AccountPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//a[normalize-space()='Fields & Relationships']")
    public WebElement fielldAndRelations;

    @FindBy(xpath=" //button[@title='Custom Field']")
    public WebElement newAccount;



    @FindBy(xpath="//div[@class='pbBottomButtons']//input[@title='Next']")
    public WebElement nextAccount;

    @FindBy(xpath="//iframe")
    public WebElement iframe;

    @FindBy(xpath="//input[@id='MasterLabel']")
    public WebElement fieldLabel;

    @FindBy(xpath="//*[@id='dtypeS']")
    public WebElement text;

    @FindBy(xpath="//input[@id='Length']")
    public WebElement length;

    @FindBy(xpath="//div[@class='pbBottomButtons']//input[@title='Next']")
    public WebElement nextField;

    @FindBy(xpath="(//*[@value=' Save '])[1]")
    public WebElement save;

    @FindBy(xpath="(//*[@target='_blank'])[1]")
    public WebElement accountNameFirst;

    @FindBy(xpath="//a[@id='detailTab__item']")
    public WebElement details;

    @FindBy(xpath="(//*[@class='flex-wrap-ie11'])[1]")
    public WebElement accountOwner;

    @FindBy(xpath="(//*[@title='Change Owner'])[2]")
    public WebElement changeOwner;
    @FindBy(xpath="//*[@title='Search Users']")
    public WebElement SearchBox;

    @FindBy(xpath="//div[@title='Integration User']")
    public WebElement integrationUser;

    @FindBy(xpath="//*[@name='change owner']")
    public WebElement changeOwnerButton;

    @FindBy(xpath="(//*[@class='flex-wrap-ie11'])[1]")
    public WebElement integrationUserVerify;//span[@class='slds-file-selector__button slds-button slds-button_neutral']

    @FindBy(xpath="(//*[@title='File 1'])[1]")
    public WebElement file1;

    @FindBy(xpath="(//*[@title='File 2'])[1]")
    public WebElement file2;

    @FindBy(xpath="(//*[@title='File 3'])[1]")
    public WebElement file3;

    @FindBy(xpath="(//*[@title='File 4'])[1]")
    public WebElement file4;

    @FindBy(xpath="//*[text()='Download']")
    public WebElement downloadBtn;


    @FindAll({@FindBy(xpath = "//ul[@class='uiAbstractList']//li//a")})
    public List<WebElement> filesList;

    @FindBy(xpath="(//*[text()='Files'])[1]")
    public WebElement filesBtn;






}
