package testHaloOglasi;

import baseHaloOglasi.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pageHaloOglasi.*;

import java.util.Random;

public class HaloOglasiTests extends BaseTest {
    HaloOglasiHome halloHome;
    HaloOglasiLogin halloLogin;
    HaloOglasiRegistration halloReg;
    HaloOglasiRegistrationSuccess halloSuccess;
    MailinatorHome mailHome;
    MailinatorInbox mailInbox;
    MailinatorInboxActivation mailInboxActivation;
    HaloOglasiActivation halloAct;
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(1000);

    @Before
    public void setUpTest(){
        halloHome = new HaloOglasiHome();
        halloLogin = new HaloOglasiLogin();
        halloReg = new HaloOglasiRegistration();
        halloSuccess = new HaloOglasiRegistrationSuccess();
        mailHome = new MailinatorHome();
        mailInbox = new MailinatorInbox();
        mailInboxActivation = new MailinatorInboxActivation();
        halloAct = new HaloOglasiActivation();

    }
    @Test
    public void HaloOslasiTest(){
        halloHome.clickButtonUredu();
        halloHome.clickButtonUlogujSe();
        halloLogin.clickLinkRegistrujSe();
        halloReg.inputUserNameField("matlidija60"+randomInt);
        halloReg.inputEmailField("matlidija60"+randomInt+"@mailinator.com");
        halloReg.inputPasswordField("123456789");
        halloReg.inputConfirmPasswordField("123456789");
        halloReg.clickCheckbox();
        halloReg.clickButtonReg();
        Assert.assertTrue(halloSuccess.regSuccessIsDisplay());
        Assert.assertEquals("Registracija je uspela!\n" +
                "Kako bi Vaš nalog postao aktivan, neophodno je" +
                " da kliknite na link u mejlu koji Vam" +
                " je poslat na : matlidija60"+randomInt+"@mailinator.com !", halloSuccess.regSuccessIsGetText());
        driver.get("https://www.mailinator.com/");
        mailHome.inputMailTextField("matlidija60"+randomInt);
        mailHome.clickButtonGo();
        mailInbox.clickButtonMsg();
        mailInboxActivation.clickButtonAktiviraj();
        Assert.assertTrue(halloAct.aktivacijaMsgIsDisplay());
        Assert.assertEquals("Vaš nalog je uspešno aktiviran!\n" +
                "Produžite na stranicu za logovanje kako" +
                " biste pristupili našem portalu. Prijava", halloAct.aktivacijaMsgIsGetText());
    }

}
