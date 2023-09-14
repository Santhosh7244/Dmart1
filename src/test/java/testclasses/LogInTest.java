package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LogInPage;
import testbase.WebTestBase;

public class LogInTest extends WebTestBase {
    public HomePage homePage;

    public LogInPage logInPage;

    LogInTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        logInPage = new LogInPage();
    }

    @Test(description = "Verify Login With Valid Username and Password")
    public void verifyLoginWithValidUsernameAndValidPassword() {
        SoftAssert softAssert = new SoftAssert();
        logInPage.clickOnCareer();
        logInPage.handleGetWindow1();
        logInPage.login(prop.getProperty("username"), prop.getProperty("password"));

    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
