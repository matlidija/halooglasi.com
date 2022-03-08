package pageHaloOglasi;

import baseHaloOglasi.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailinatorHome extends BaseTest {
    public MailinatorHome(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "search-mobile")
    WebElement mailTextField;
    @FindBy(xpath = "//button[@aria-label=\"Search for inbox\"]")
    WebElement buttonGo;

    public void clickButtonGo(){
        wdwait.until(ExpectedConditions.elementToBeClickable(buttonGo));
        buttonGo.click();
    }

    public void inputMailTextField(String mailunos){
        wdwait.until(ExpectedConditions.elementToBeClickable(mailTextField));
        mailTextField.clear();
        mailTextField.sendKeys(mailunos);
    }
}
