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
    public WebElement languageOption;

    @FindBy(css = "[data-gt-lang='en']")
    public WebElement english;

    @FindBy(linkText = "Enter the OpenMRS 2 Demo")
    public WebElement enterMrs2Demo;

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
    public WebElement demoButton;

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

    //@FindBy(xpath = "//li[@class='nav-item identifier']")
    @FindBy(css="[class='nav-item identifier']")
    public WebElement adminLabel;

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
    public WebElement myAccount;

    @FindBy(css="[class='icon-lock']")
    public WebElement changePasswordButton;

    @FindBy(id="cancel-button")
    public WebElement cancelButton;


    @FindBy(css="[class='icon-cog']")
    public WebElement myLanguagesButton;

    //US2-US9-BETUL

    @FindBy(id="coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension")
    public WebElement dataManagementButton;

    @FindBy(id="coreapps-mergePatientsHomepageLink-app")
    public WebElement mergePatient;

    @FindBy(id="patient1-text")
    public WebElement patientId1Input;

    @FindBy(id="patient2-text")
    public WebElement patientId2Input;

    @FindBy(xpath= "//div[@class='float-sm-right']//span")
    public WebElement registeredPatientId;

    @FindBy(id="first-patient")
    public WebElement selectedPatientID;

    @FindBy(xpath = "//input[@value='Yes, continue'")
    public WebElement confirmPreferredRecord;


    @FindBy(id="confirm-button")
    public WebElement confirmButtonPatientMerge;

    @FindBy(xpath = "//div[@class='messages-container']/h1")
    public WebElement mergingCannotBeUndoneText;

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


// Muhammet Elementleri

    @FindBy(css = "[class='nav-item logout']>a")
    public WebElement logOutBtn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username1;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password1;

    @FindBy(xpath = "//*[@id='Inpatient Ward']")
    public WebElement ward;

    @FindBy(xpath = "//*[@id='loginButton']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']")
    public WebElement FindPatiRecord;

    @FindBy(xpath = "(//a[@class='btn btn-default btn-lg button app big align-self-center'])[1]")
    public WebElement findPatientRecord;

    //@FindBy(xpath = "//*[text()='Showing 16 to 27 of 27 entries']")
    @FindBy(id="patient-search-results-table_info")
    public WebElement showing;

    @FindBy(xpath = "//*[@id='patient-search-results-table_next']")
    public WebElement patientListNextPage;



//    @FindBy(css="[class='nav-item logout']")
//    public WebElement logout0;

    @FindBy(xpath = "//div[@id='navbarSupportedContent']//li[@class='nav-item logout']/a")
    public WebElement logout;

    @FindBy(xpath = "//*[@class='w-auto']")
    public WebElement giris;

    // muhammet Elementler

    @FindBy(css = "[class='gt-current-lang']")
    public WebElement languageS;

    @FindBy(xpath="//*[@class='nturl'][1]")
    public WebElement EN;

    @FindBy(xpath = "//a[@data-gt-lang='en']")
    public WebElement englishS;

    @FindBy(xpath = "//span[text()='Explore OpenMRS 2']")
    public WebElement exploreMRS2;

    @FindBy(css = "a[href='https://demo.openmrs.org/openmrs/login.htm']")
    public WebElement openMRS2Demo;


    @FindBy(linkText="Enter the OpenMRS 2 Demo")
    public WebElement enterDemo2S;

    @FindBy(id="username")
    public WebElement usernameS;

    @FindBy(id="password")
    public WebElement passwordS;

    @FindBy(id="Inpatient Ward")
    public WebElement locationS;

    @FindBy(id="loginButton")
    public WebElement loginButtonS;

    @FindBy(xpath = "(//a[@class='btn btn-default btn-lg button app big align-self-center'])[4]")
    public WebElement registerAPatient;

    @FindBy(name="givenName")
    public WebElement givenName;

    @FindBy(name = "familyName")
    public WebElement familyName;

    @FindBy(id = "next-button")
    public WebElement nextButton;

    @FindBy(xpath = "//option[@value='M']")
    public  WebElement gender;

    @FindBy(name = "birthdateDay")
    public WebElement  birthdateDay;

    @FindBy(name = "birthdateMonth")
    public WebElement birthdateMonth;

    @FindBy(xpath = "//option[@value='6']")
    public WebElement birthdateMonth6;

    @FindBy(name = "birthdateYear")
    public WebElement birthdateYear;

    @FindBy(id = "address1")
    public WebElement address;

    @FindBy(id = "submit")
    public WebElement confirm;



    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement search;

    @FindBy(xpath = "(//div[@class='col-11 col-lg-10'])[8]")
    public WebElement DeletePatiend;



    @FindBy(xpath = "//tr[@class='odd']")
    public WebElement one;

    @FindBy(xpath = "(//div[@class='col-11 col-lg-10'])[8]")
    public WebElement delete;

    @FindBy(id = "delete-reason")
    public WebElement text;

    @FindBy(xpath = "(//button[@class='confirm right'])[6]")
    public WebElement confirmDelete;

    @FindBy(xpath = "//span[@class='PersonName-givenName']")
    public WebElement patientName;


}
