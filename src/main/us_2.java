package main;

import Utility.BaseDriver;
import Utility.Tools;
import org.testng.Assert;
import org.testng.annotations.Test;

public class us_2 extends BaseDriver {
    @Test()
    public void myaccount() {
        Elements el=new Elements();
        el.dil.click();

        Tools.Bekle(2);
        el.en.click();

        Tools.Bekle(2);

        el.demobutton.click();
        el.enter.click();
        el.username.sendKeys("admin");
        el.password.sendKeys("Admin123");
        el.location.click();
        el.loginbutton.click();
        Assert.assertTrue(el.adminassertion.getText().contains("admin"), "login olunmamıştır");

}}
