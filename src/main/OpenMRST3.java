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

    //nese
    @Test(dataProvider = "invalidLoginData", enabled = true, priority = 1)
    public void US_401(String username, String password) throws IOException {

        Elements elements = new Elements();

        wait.until(ExpectedConditions.elementToBeClickable(elements.username));
        elements.username.sendKeys(username);
        elements.password.sendKeys(password);
        elements.location.click();
        elements.loginButton.click();

        System.out.println("System Login initialized");

        Tools.wait(3);
    }

    @DataProvider
    Object[][] invalidLoginData() {

        Object[][] invalidLoginData;
        invalidLoginData = new Object[][]{
                {"", ""},
                {"", "wrong_password"},
                {"admin", ""},
                {"admin", "wrong_password"},
                {"", "Admin123"},
                //{"admin", "Admin123"},
        };
        return invalidLoginData;
    }

    //betul
    @Test(enabled = true, priority = 2)
    public void US_402() {

        login();
        Elements elements = new Elements();
        Assert.assertTrue(elements.logo.isDisplayed(), "HATALI GİRİŞ");
    }

    //muhammet
    @Test(enabled = true, priority = 3)
    public void Test403() {


        Elements elements = new Elements();
       // login();
        SoftAssert softAssert = new SoftAssert();

        wait.until(ExpectedConditions.visibilityOf(elements.logout));
        wait.until(ExpectedConditions.elementToBeClickable(elements.logout)).click();

        softAssert.assertTrue(elements.logout.isDisplayed(), "Logout is not visible");
        softAssert.assertTrue(elements.giris.isDisplayed(), "You are not on home page");
        softAssert.assertAll();

        Assert.assertTrue(elements.logout.isDisplayed(),"Logout is not visible00");
        Assert.assertTrue(elements.giris.isDisplayed(),"You are not on home page");

    }

    //sefacan
    @Test(enabled = true, priority = 4)
    public void US_404_() {

        Elements elements = new Elements();

        login();

        wait.until(ExpectedConditions.elementToBeClickable(elements.registerAPatient)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.givenName)).sendKeys("Big_Team3");
        elements.familyName.sendKeys("Brillant");
        elements.nextButton.click();
        elements.gender.click();
        elements.nextButton.click();
        elements.birthdateDay.sendKeys("24");
        elements.birthdateMonth.click();
        elements.birthdateMonth6.click();
        elements.birthdateYear.sendKeys("2004");
        elements.nextButton.click();
        elements.address.sendKeys("Elm Street");
        elements.nextButton.click();
        elements.nextButton.click();
        elements.nextButton.click();
        elements.confirm.click();
        Assert.assertEquals(elements.patientName.getText(), "Big_Team3", "Hasta kaydedilemedi");

    }

    //alper
    @Test(enabled = true, priority = 5)
    public void US_405() {

        //login();
        Elements elements = new Elements();

        Assert.assertTrue(elements.adminLabel.getText().contains("admin"), "login olunmamıştır");

        elements.adminLabel.click();
        elements.myAccount.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.changePasswordButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.cancelButton)).click();
        Assert.assertTrue(elements.changePasswordButton.isDisplayed(), "Change Password Button was not displayed!");

        wait.until(ExpectedConditions.elementToBeClickable(elements.myLanguagesButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.cancelButton)).click();
        Assert.assertTrue(elements.myLanguagesButton.isDisplayed(), "My Languages Button was not displayed!");

    }

    //yusuf
    @Test(enabled = true, priority = 6)
    public void US_406() throws IOException {
        login();

        Elements elements = new Elements();

        wait.until(ExpectedConditions.elementToBeClickable(elements.findPatient)).click();
        System.out.println("               ***************>>PATIENTS LIST<<***************");
        for (
                WebElement ptnt : elements.patientsIdlist)
            System.out.println(ptnt.getText());

        if (elements.patientsIdlist.size() > 0) {
            Tools.wait(7);
            wait.until(ExpectedConditions.elementToBeClickable(elements.patientsIdlist.get(0))).click();
            Tools.wait(7);
        } else System.out.println("Patient List is Empty!");


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='body-wrapper']")));
        elements.patientDetail.getText();

        System.out.println("         ********************>>PATIENT DETAILS<<***********************");
        System.out.println(elements.patientDetail.getText());

        driver.navigate().back();
        elements.searchByIdorName.sendKeys("techno" + Keys.ENTER);
        Assert.assertTrue(elements.nosucpapient.isEnabled(), "The patient was not found!");
        System.out.println("The patient was not found! = " + elements.nosucpapient.getText());

        TakesScreenshot takePhoto = (TakesScreenshot) driver;
        File screenshot = new File("target/screenShot/SS1.jpg");
        File picture = takePhoto.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(picture, screenshot);
    }

    //sefacan
    @Test(enabled = true, priority = 7)
    public void US_407_() {

        Elements elements = new Elements();
        login();
        wait.until(ExpectedConditions.elementToBeClickable(elements.findPatientRecord)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.search));
        elements.search.sendKeys("sefacan");
        elements.one.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.delete)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.text));
        elements.text.sendKeys("faulty patient");
        elements.confirmDelete.click();

    }

    //muhammet
    @Test(enabled = true, priority = 8)
    public void Test408() {

        login();
        Elements elements = new Elements();

        wait.until(ExpectedConditions.elementToBeClickable(elements.findPatient)).click();
        elements.patientListNextPage.click();

        wait.until(ExpectedConditions.visibilityOf(elements.showing));
        String entriesAmount = elements.showing.getText();

        String[] valueArray = entriesAmount.split(" ");
        String valueZ = valueArray[valueArray.length - 2];
        String valueY = valueArray[valueArray.length - 4];

        Assert.assertEquals(valueZ, valueY, "The number of rows is different than the patient table.");

    }

    //betul
    @Test(enabled = true, priority = 9)
    public void US_409() {

        login();
        Elements elements = new Elements();

        int counter = 0;
        String registeredPatientId100="";
        String registeredPatientId200="";

        for (int i = 1; i <= 2; i++) {

            wait.until(ExpectedConditions.elementToBeClickable(elements.registerAPatient)).click();
            wait.until(ExpectedConditions.elementToBeClickable(elements.givenName)).sendKeys("We_Team3");
            elements.familyName.sendKeys("We_Team3");
            elements.nextButton.click();
            elements.gender.click();
            elements.nextButton.click();
            elements.birthdateDay.sendKeys("24");
            elements.birthdateMonth.click();
            //100k26
            //100k7v

            elements.birthdateMonth6.click();
            elements.birthdateYear.sendKeys("2004");
            elements.nextButton.click();
            elements.address.sendKeys("Elm Street");
            elements.nextButton.click();
            elements.nextButton.click();
            elements.nextButton.click();
            elements.confirm.click();

            if (counter == 0) {
                wait.until(ExpectedConditions.visibilityOf(elements.registeredPatientId));
                registeredPatientId100 = elements.registeredPatientId.getText();
                //elements.registeredPatientId1.sendKeys(registeredPatientId1);
                counter++;
            }
            else
            {
                wait.until(ExpectedConditions.visibilityOf(elements.registeredPatientId));
                registeredPatientId200 = elements.registeredPatientId.getText();
            }
            Assert.assertEquals(elements.patientName.getText(), "We_Team3", "Patient was not recorded!");
            elements.logo.click();
        }
        wait.until(ExpectedConditions.elementToBeClickable(elements.dataManagementButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.mergePatient)).click();

        //wait.until(ExpectedConditions.elementToBeClickable(elements.patientId1Input)).sendKeys(registeredPatientId100);
        elements.patientId1Input.sendKeys(registeredPatientId100);

        wait.until(ExpectedConditions.elementToBeClickable(elements.patientId2Input)).sendKeys(registeredPatientId200);

        elements.confirmButtonPatientMerge.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.confirmButtonPatientMerge)).click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.mergingCannotBeUndoneText));

        Assert.assertTrue(elements.mergingCannotBeUndoneText.isDisplayed(),"Error");

//        driver.switchTo().frame(0);
        wait.until(ExpectedConditions.elementToBeClickable(elements.selectedFirstPatient)).click();
//        driver.switchTo().parentFrame();
        wait.until(ExpectedConditions.elementToBeClickable(elements.confirmPreferredRecord)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.confirmPreferredRecord)).click();


        Assert.assertTrue(elements.registeredPatientId.isDisplayed(),"Error");
    }

    //yusuf
    @Test(dataProvider = "patientData", enabled = true, priority = 10)//yusuf 10 user story
    public void US_410(String userName) throws IOException {

        Elements elements = new Elements();
        login();

        //surdan sonrasi test incerect sisteme ait
        elements.appointmentsButton.click();
        elements.manageAppointments.click();
        elements.searchPatients.sendKeys(userName);

        elements.patientId.click();
        // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='note error'])[2]")));
        Assert.assertTrue(elements.errorMessage.getText().contains("Your computer is not set to the right time zone."), "Mesaj bulunamadi");
        System.out.println(elements.errorMessage.getText());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File shot = new File("target/screenshot/incorectSystem.jpg");
        File picture = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(picture, shot);
        elements.logo.click();
    }

    @DataProvider
    public Object[] patientData() {
        Object[] userName = {"We_Team3"};
        return userName;
    }

//1

}


