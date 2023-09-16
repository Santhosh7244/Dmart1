package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

import java.util.List;

public class CareerPage extends WebTestBase {
    @FindBy(xpath = "//span[text()='Careers']")
    WebElement careerBtn;
    @FindBy(xpath = "//a[@class='loggedInStatus']")
    static
    WebElement signInBtn;
    @FindBy(xpath = "//div[@class='page_title page_accessible_title']")
    WebElement titlePageText;
    @FindBy(xpath = "//input[@id='48:_selectInput']")
    WebElement clickOnLocation;
    @FindBy(xpath = "//div[@class='resizer-wrapper']//li")
    List<WebElement> listOfLocation;
    @FindBy(xpath = "(//input[@class='fd-checkbox fd-checkbox--compact'])[6]")
    WebElement locationA1;
    @FindBy(xpath = "//button[text()='Search Jobs']")
    WebElement ClickOnSearch;
    public void callDropDown(){
        Utility.dropDownElement(listOfLocation,"Karnataka");
    }
    public void clickingOnLocation(){
        clickOnLocation.click();
        locationA1.click();
        ClickOnSearch.click();
    }
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
}
