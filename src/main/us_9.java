package main;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class us_9 extends BaseDriver {
    @Test()
    public void TRtoEn() {
        Elements pom = new Elements();
        pom.dil.click();

        Tools.Bekle(2);
        pom.en.click();

        Tools.Bekle(2);

        pom.demobutton.click();
        pom.enter.click();
        pom.username.sendKeys("admin");
        pom.password.sendKeys("Admin123");
        pom.location.click();
        pom.loginbutton.click();
        Assert.assertTrue(pom.adminassertion.getText().contains("admin"), "login olunmamıştır");
        pom.avtivevisits.click();
        pom.ayse.click();
        pom.mergevisit.click();

        for (int i = 0; i < 2; i++) {
            wait.until(ExpectedConditions.elementToBeClickable(pom.visiteler.get(i)));
            pom.visiteler.get(i).click();
        }

        pom.merge.click();


    }
}
