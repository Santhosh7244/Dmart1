package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import testbase.WebTestBase;

public class HomeTest extends WebTestBase {
    public HomePage homePage;

    //Creating the Constructor
    HomeTest() {
        super();
    }

    //Creating and initialization method
    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
    }

    @Test(description = "Verify functionality Inserting Keyword ")
    public void verifyFunctionsOfKeyword() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnLogin();
        homePage.handleGetWindow1();
        homePage.clickOnKeyword();
        HomePage.careerKeyword(prop.getProperty("keyword"));
        softAssert.assertAll();
    }

    @Test(description = "Verify functionality of CheckBox")
    public void verifyFunctionsOfCheckBox() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnLogin();
        homePage.handleGetWindow1();
        homePage.clickOnCheckBox();
        softAssert.assertTrue(homePage.displayCheckBox(), "Should be selected");
        softAssert.assertAll();
    }

    @Test(description = "Verify RadioButton functionality")
    public void verifyFunctionOfRadioBtn() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnLogin();
        homePage.handleGetWindow1();
        homePage.clickOnKeyword();
        homePage.clickOnRadioBtn();
        softAssert.assertTrue(homePage.selectRadioBtn(), "Must be clickable");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}


