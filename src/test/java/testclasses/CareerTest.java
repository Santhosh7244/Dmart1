package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CareerPage;
import pages.HomePage;
import testbase.WebTestBase;

public class CareerTest extends WebTestBase {
    public CareerPage careerPage;
    CareerTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        careerPage = new CareerPage();
    }
    @Test(description = "Verify functionality Get Window Handle ")
    public void verifyFunctionsOfWindowHandle() {
        SoftAssert softAssert =  new SoftAssert();
        careerPage.clickOnLogin();
        careerPage.handleGetWindow1();
        careerPage.clickOnSignInBtn();
        softAssert.assertEquals(careerPage.displayTitlePage(), "Career Opportunities: Sign In");
        softAssert.assertAll();

    }
    @Test(description = "Verify the Functionality DropDown")
    public void verifyDropDown(){
        careerPage.clickOnFeedbackBtn();
        careerPage.clickOnDropDown();
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
