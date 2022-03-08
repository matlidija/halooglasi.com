package pageHaloOglasi;

import baseHaloOglasi.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiHome extends BaseTest {
    public HaloOglasiHome(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "cookie-policy-btn")
    WebElement buttonUredu;
    @FindBy(xpath = "//div[@class=\"header-category-link login-btn-wrapper\"]")
    WebElement buttonUlogujSe;

    public void clickButtonUredu(){
        wdwait.until(ExpectedConditions.elementToBeClickable(buttonUredu));
        buttonUredu.click();
    }

    public void clickButtonUlogujSe(){
        wdwait.until(ExpectedConditions.elementToBeClickable(buttonUlogujSe));
        buttonUlogujSe.click();
    }


}
