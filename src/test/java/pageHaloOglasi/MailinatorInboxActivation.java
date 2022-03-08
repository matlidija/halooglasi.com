package pageHaloOglasi;

import baseHaloOglasi.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;

public class MailinatorInboxActivation extends BaseTest {
    public MailinatorInboxActivation(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "html_msg_body")
    WebElement iframeBody;
    @FindBy(xpath = "//strong[contains(text(),\"Aktiviraj nalog\")]")
    WebElement buttonAktiviraj;

    public void clickButtonAktiviraj(){
        wdwait.until(ExpectedConditions.elementToBeClickable(iframeBody));
        driver.switchTo().frame(iframeBody);
        wdwait.until(ExpectedConditions.elementToBeClickable(buttonAktiviraj));
        buttonAktiviraj.click();
        Set<String> window1 = driver.getWindowHandles();
        for (String window : window1){
            driver.switchTo().window(window);
        }
    }
}
