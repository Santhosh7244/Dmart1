package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class CareerPage extends WebTestBase {
    @FindBy(xpath = "//span[text()='Careers']")
    WebElement careerBtn;
    @FindBy(xpath = "//a[@class='loggedInStatus']")
    static
    WebElement signInBtn;
    @FindBy(xpath = "//div[@class='page_title page_accessible_title']")
    WebElement titlePageText;
    @FindBy(xpath = "//span[text()='Feedback']")
    WebElement feedbackBtn;
    @FindBy(xpath = "(//div[@class='MuiAutocomplete-endAdornment'])[1]")
    WebElement dropDownBtn;
    @FindBy(xpath = "//input[@value='Andhra Pradesh']")
    static
    WebElement selectState;
    public   CareerPage(){
        PageFactory.initElements(driver, this);
    }
    public void clickOnLogin(){
        careerBtn.click();
    }
    public void handleGetWindow1(){
        Utility.handleNewTab();
    }

    public void clickOnSignInBtn(){
        signInBtn.click();
    }
    public  boolean displayTitlePage(){
        return Utility.isDisplayedVerify(titlePageText);
    }

    public void clickOnFeedbackBtn(){
        feedbackBtn.click();
    }
    public void clickOnDropDown(){
        dropDownBtn.click();
    }

    public void clickOnState(){
        selectState.click();
    }

}
