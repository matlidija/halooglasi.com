package pageHaloOglasi;

import baseHaloOglasi.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiRegistration extends BaseTest {
    public HaloOglasiRegistration(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "UserName")
    WebElement userNameField;
    @FindBy(id = "Email")
    WebElement emailField;
    @FindBy(id = "Password")
    WebElement passwordField;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;
    @FindBy(id = "AllowSendingNewsletters")
    WebElement checkbox;
    @FindBy(xpath = "//button[@class=\"button-reg save save-entity person-face btn-main\"]")
    WebElement buttonReg;




    public void clickButtonReg(){
        wdwait.until(ExpectedConditions.elementToBeClickable(buttonReg));
        buttonReg.click();
    }

    public void clickCheckbox(){
        wdwait.until(ExpectedConditions.elementToBeClickable(checkbox));
        if(checkbox.isSelected())
            checkbox.click();
    }
    public void inputConfirmPasswordField(String ConfirmPassword){
        wdwait.until(ExpectedConditions.elementToBeClickable(confirmPasswordField));
        confirmPasswordField.clear();
        confirmPasswordField.sendKeys(ConfirmPassword);
    }

    public void inputPasswordField(String Password){
        wdwait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.clear();
        passwordField.sendKeys(Password);
    }

    public void inputEmailField(String Email){
        wdwait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.clear();
        emailField.sendKeys(Email);
    }

    public void inputUserNameField(String UserName){
        wdwait.until(ExpectedConditions.elementToBeClickable(userNameField));
        userNameField.clear();
        userNameField.sendKeys(UserName);
    }
}
