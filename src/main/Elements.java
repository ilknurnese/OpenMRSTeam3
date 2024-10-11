package main;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements {


    public Elements() {

        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "[class='gt-current-lang']")
    public WebElement language;

    @FindBy(css = "[data-gt-lang='en']")
    public WebElement english;

    @FindBy(css = "[class='zak-button']")
    public WebElement demobuttun;

    @FindBy(linkText = "Enter the OpenMRS 2 Demo")
    public WebElement enterDemo2;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "Inpatient Ward")
    public WebElement location;

    @FindBy(id = "loginButton")
    public WebElement loginButton;

    @FindBy(id = "coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")
    public WebElement findPatient;

    @FindBy(css = "[placeholder='Search by ID or Name']")
    public  WebElement searchByIdorName;

    @FindBy(xpath = "//table/tbody/tr/td[2]")
    public List<WebElement> patientsIdlist;


    @FindBy(css = "[class='row']")
    public List<WebElement> result;


    @FindBy(css = "[id='body-wrapper']")
    public WebElement patientDetail;


    @FindBy(xpath = "//td[text()='No matching records found']")
    public WebElement nosucpapient;



//Yusufun locatorlari

    @FindBy(xpath="//*[@class='gt-lang-code']")
    public WebElement dil;

    @FindBy(css="[data-gt-lang='en']")
    public WebElement en;

    @FindBy(css = "[class='zak-button']")
    public WebElement demobutton;

    @FindBy(xpath = "//*[text()='Enter the OpenMRS 2 Demo']")
    public WebElement enter;

    @FindBy(xpath = "//*[@placeholder='Enter your username']")
    public WebElement usernameBETUL;

    @FindBy(xpath = "//*[@placeholder='Enter your password']")
    public WebElement passwordBETUL;

    @FindBy(id = "loginButton")
    public WebElement loginbutton;

    @FindBy(xpath = "//*[text()='Inpatient Ward']")
    public WebElement locationBETUL;

    @FindBy(xpath = "//*[@class='nav-item identifier']")
    public WebElement adminassertion;


    @FindBy(xpath = "(//*[@id='apps']/a)[3]")
    public WebElement avtivevisits;

    @FindBy(xpath = "//*[@id='visit-2384']/td/a")
    public WebElement ayse;


    @FindBy(xpath = "(//*[@class='col-11 col-lg-10'])[12]")
    public WebElement mergevisit;

    @FindBy(xpath = "//*[@class='selectVisit']")
    public List<WebElement> visiteler;
    @FindBy(xpath = "//*[@value='Merge Selected Visits']")
    public WebElement merge;

    @FindBy(xpath = "//*[@id='user-account-menu']/li")
    public WebElement myaccount;

    @FindBy(css = "[class='nav-item identifier']")
    public WebElement myaccountadmin;

    //US2-US9-BETUL


    @FindBy(id = "appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension")
    public WebElement appoinmentsButton;

    @FindBy(id = "appointmentschedulingui-manageAppointments-app")
    public WebElement manageAppoiments;

    @FindBy(id = "patient-search")
    public WebElement searchhPatiens;

    @FindBy(xpath = "//tbody/tr/td[1]")
    public List<WebElement> clickpatient;


    @FindBy(xpath = "(//div[@class='note error'])[2]")
    public WebElement erorMesage;

    @FindBy(xpath = "//td[text()='yusuf ucucu']")
    public WebElement patientid;

    @FindBy(css = "[class='logo']")
    public WebElement logo;
//yusuf 09

}
