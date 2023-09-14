package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class HomePage extends WebTestBase {
    @FindBy(xpath = "//span[text()='Careers']")
    WebElement careerBtn;
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public void clickOnLogin(){
        careerBtn.click();
    }
    public void handleGetWindow1(){
      Utility.handleNewTab();
    }
    @FindBy(xpath = "//input[@name='keyword']")
    static
    WebElement keywordTextBox;

    public void clickOnKeyword(){
        keywordTextBox.click();
    }
    public static void careerKeyword(String keyword) {
        keywordTextBox.sendKeys(keyword);
    }
    @FindBy(xpath = "//label[text()='Exact Match']")
    WebElement checkBox;

    public void clickOnCheckBox() {
        Utility.waitUntilElementToBeClickable(checkBox);
    }
    public  boolean selectCheckBox(){
        return Utility.isSelectedVerify(checkBox);
    }
    @FindBy(xpath = "(//input[@type='radio'])[2]")
    WebElement radioBtn;

    public void clickOnRadioBtn(){
        Utility.waitUntilElementToBeClickable(radioBtn);
    }
    public  boolean selectRadioBtn(){
        return Utility.isDisplayedVerify(radioBtn);
    }

    public  boolean displayCheckBox(){
        return Utility.isDisplayedVerify(checkBox);
    }

}
