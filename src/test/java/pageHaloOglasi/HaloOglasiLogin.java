package pageHaloOglasi;

import baseHaloOglasi.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiLogin extends BaseTest {
    public HaloOglasiLogin(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@class=\"no-account-reg-link\"]")
    WebElement linkRegistrujSe;

    public void clickLinkRegistrujSe(){
        wdwait.until(ExpectedConditions.elementToBeClickable(linkRegistrujSe));
        linkRegistrujSe.click();
    }
}
