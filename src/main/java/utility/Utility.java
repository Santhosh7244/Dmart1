package utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;

import java.time.Duration;
import java.util.Set;

public class Utility extends WebTestBase {

    public static final long IMPLICIT_WAIT = 20;
    public static final long PAGE_LOAD = 20;

   public static final long EXPLICIT_WAIT = 20;

    public static  WebDriverWait wait;

    public static void waitUntilElementToBeClickable(WebElement element){
         wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
         wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }
    public static void handleNewTab()  {
    String firstTab = driver.getWindowHandle();
        Set<String> secondTab= driver.getWindowHandles();
       for (String id : secondTab) {
           System.out.println(id);
           if (!(id.equals(firstTab))) {
               driver.switchTo().window(id);
               try {
                   Thread.sleep(2000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
       }
    }
    public static boolean isSelectedVerify(WebElement element ){
        return element.isSelected();
    }
    public static String getTextOfElement(WebElement element){
        return element.getText();
    }
    public static boolean isDisplayedVerify(WebElement element){
        return element.isDisplayed();
    }
}
