package main;

import Utility.BaseDriver;
import Utility.Tools;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;

public class OpenMRST3 extends BaseDriver {
    Elements elements = new Elements();

    @Test
    public void Test403(){
        // muhammet

        driver.get("https://demo.openmrs.org/openmrs/login.htm");

        SoftAssert softAssert = new SoftAssert();

        elements.username1.sendKeys("Admin");
        elements.password1.sendKeys("Admin123");
        elements.ward.click();
        elements.login.click();

        softAssert.assertTrue(elements.displayd.isDisplayed(),"Aradığınız bulunmamaktadır");

        elements.logout.click();

        softAssert.assertTrue(elements.giris.isDisplayed(),"Giriş sayfasına gelemediniz");

        softAssert.assertAll();



    }

    @Test
    public void Test408(){
        // muhammet

        driver.get("https://demo.openmrs.org/openmrs/login.htm");


        elements.username1.sendKeys("Admin");
        elements.password1.sendKeys("Admin123");
        elements.ward.click();
        elements.login.click();
        elements.FindPatiRecord.click();
        elements.sayfa2.click();

        String deger = elements.showing.getText().toString();

        String[] dizideger = deger.split(" ");
        String degerZ = dizideger[dizideger.length-2];
        String degerY = dizideger[dizideger.length-4];

        Assert.assertEquals(degerZ,degerY,"Girdiğiniz değerler aynı değil");



    }


    @Test()
    public void US_402() { //betulun testi
        Elements el = new Elements();
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
    }

    @Test()
    public void US_405() { //betulun testi
        Elements el = new Elements();
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
        el.myaccountadmin.click();
        el.myaccount.click();
    }

    @Test()// betulun testi
    public void US_409() {
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

    @Test(dataProvider = "loginData") //yusuf giris
    public void US_401(String username, String password) throws IOException {

        elements.language.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.english)).click();
        elements.demobuttun.click();
        elements.enterDemo2.click();
        elements.username.sendKeys(username);
        elements.password.sendKeys(password);
        elements.location.click();
        elements.loginButton.click();
    }

    @DataProvider
    Object [][] loginData() {
        Object[][] loginInfo = {
                {"", ""},
                {"", "wrong_password"},
                {"admin", ""},
                {"admin", "wrong_password"},
                {"", "Admin123"},
                {"admin", "Admin123"},
        };
        return loginInfo;
    }

    //yusuf
    @Test
    public void US_406() throws IOException {
        Login();
        elements.findPatient.click();


        System.out.println("               ***************>>PATIENTS LIST<<***************");

        for (
                WebElement ptnt : elements.patientsIdlist)
            System.out.println(ptnt.getText());

        if (elements.patientsIdlist.size() > 0)
            elements.patientsIdlist.get(0).click();
        else System.out.println("Hasta Listesi Bos");


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='body-wrapper']")));
        elements.patientDetail.getText();

        System.out.println("         ********************>>PATIENT DETAILS<<***********************");
        System.out.println(elements.patientDetail.getText());

        driver.navigate().back();
        elements.searchByIdorName.sendKeys("techno" + Keys.ENTER);
        Assert.assertTrue(elements.nosucpapient.isEnabled(), "Listede olmayan Kisi icin Sistem calisti");
        System.out.println("Hasta Bulunamadi Mesaji = " + elements.nosucpapient.getText());

        TakesScreenshot takefoto = (TakesScreenshot) driver;
        File screenshot = new File("target/screnshott/sayfa1.jpg");
        File picture = takefoto.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(picture, screenshot);
    }

    @Test(dataProvider = "createData")//yusuf 10 user story
    public void US_410(String userName) throws IOException {
        Login();


        elements.language.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.english)).click();
        elements.demobuttun.click();
        elements.enterDemo2.click();
        elements.username.sendKeys("admin");
        elements.password.sendKeys("Admin123");
        elements.location.click();
        elements.loginButton.click();

        //surdan sonrasi test incerect sisteme ait
        elements.appoinmentsButton.click();
        elements.manageAppoiments.click();
        elements.searchhPatiens.sendKeys(userName);

        elements.patientid.click();
        // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='note error'])[2]")));
        Assert.assertTrue(elements.erorMesage.getText().contains("Your computer is not set to the right time zone."), "Mesaj bulunamadi");
        System.out.println(elements.erorMesage.getText());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File shot = new File("target/screnshott/incorectSystem.jpg");
        File picture = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(picture, shot);
        elements.logo.click();
    }
    @DataProvider
    public Object[] createData() {
        Object[] user = {"yusuf ucucu"};
        return user;
    }

    @Test
    public void US_404_ (){

        driver.get("https://openmrs.org/");
        elements.languageS.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.englishS));
        elements.englishS.click();
        elements.demobuttonS.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.enterDemo2S)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.usernameS)).sendKeys("admin");
        elements.passwordS.sendKeys("Admin123");
        elements.locationS.click();
        elements.loginButtonS.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.Registerapatient)).click();
        elements.givenName.sendKeys("sefacan");
        elements.familyName.sendKeys("basoglu");
        elements.nextbutton.click();
        elements.gender.click();
        elements.nextbutton.click();
        elements.birthdateDay.sendKeys("24");
        elements.birthdateMonth.click();
        elements.birthdateMonth6.click();
        elements.birthdateYear.sendKeys("2004");
        elements.nextbutton.click();
        elements.address.sendKeys("elma sokak");
        elements.nextbutton.click();
        elements.nextbutton.click();
        elements.nextbutton.click();
        elements.Confirm.click();
        Assert.assertTrue(elements.patieentname.getText().equals("sefacan"),"Hasta kaydedilemedi");

    }
    @Test
    public void US_407_(){

        driver.get("https://openmrs.org/");
        elements.languageS.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.englishS));
        elements.englishS.click();
        elements.demobuttonS.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.enterDemo2S)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.usernameS)).sendKeys("admin");
        elements.passwordS.sendKeys("Admin123");
        elements.locationS.click();
        elements.loginButtonS.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.FindPatientRecord)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.Search));
        elements.Search.sendKeys("sefacan");
        elements.one.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.delete)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.text));
        elements.text.sendKeys("faulty patient");
        elements.Confirmdelete.click();

}
}


