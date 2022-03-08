package pageHaloOglasi;

import baseHaloOglasi.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiActivation extends BaseTest {
    public HaloOglasiActivation(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class=\"regsitration-success\"]")
    WebElement aktivacijaMsg;

    public boolean aktivacijaMsgIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(aktivacijaMsg));
        return aktivacijaMsg.isDisplayed();
    }

    public String aktivacijaMsgIsGetText(){
        wdwait.until(ExpectedConditions.elementToBeClickable(aktivacijaMsg));
        return aktivacijaMsg.getText();
    }

}
