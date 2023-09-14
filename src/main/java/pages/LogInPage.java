package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class LogInPage extends WebTestBase {
    @FindBy(xpath = "//span[text()='Careers']")
    WebElement careerBtn;
    public void clickOnCareer(){
        careerBtn.click();
    }
    public void handleTab(){
        Utility.handleNewTab();
    }
    @FindBy(xpath = "//a[text()='Sign In']")
    WebElement logInRegisterBtn;
    public LogInPage (){
        PageFactory.initElements(driver, this);
    }
    public void handleGetWindow1(){
        Utility.handleNewTab();
    }
    @FindBy(id = "username")
    WebElement usernameTextBox;
    @FindBy(id = "password")
    WebElement passwordTextBox;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement signInBtn;
    public void clickOnSubmit(){
        signInBtn.click();
    }

    public void login(String username, String password) {
        usernameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
    }

}
