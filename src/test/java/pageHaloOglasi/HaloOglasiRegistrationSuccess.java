package pageHaloOglasi;

import baseHaloOglasi.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiRegistrationSuccess extends BaseTest {
    public HaloOglasiRegistrationSuccess(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(className = "regsitration-success")
    WebElement regSuccess;

    public boolean regSuccessIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(regSuccess));
        return regSuccess.isDisplayed();
    }

    public String regSuccessIsGetText(){
        wdwait.until(ExpectedConditions.elementToBeClickable(regSuccess));
        return regSuccess.getText();
    }
}
