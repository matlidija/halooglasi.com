package pageHaloOglasi;

import baseHaloOglasi.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;

public class MailinatorInbox extends BaseTest {
    public MailinatorInbox(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//td[@class=\"ng-binding\"]")
    WebElement buttonMsg;




    public void clickButtonMsg(){
        wdwait.until(ExpectedConditions.elementToBeClickable(buttonMsg));
        buttonMsg.click();
    }
}
