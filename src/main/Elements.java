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


    @FindBy(css = "[id='body-wrapper']")
    public WebElement patientDetail;


    @FindBy(xpath = "//td[text()='No matching records found']")
    public WebElement nosucpapient;
    
    @FindBy(css = "[class='zak-button']")
    public WebElement demoButton;

    @FindBy(css="[class='nav-item identifier']")
    public WebElement adminLabel;


    @FindBy(xpath = "//*[@id='user-account-menu']/li")
    public WebElement myAccount;

    @FindBy(css="[class='icon-lock']")
    public WebElement changePasswordButton;

    @FindBy(id="cancel-button")
    public WebElement cancelButton;

    @FindBy(css="[class='icon-cog']")
    public WebElement myLanguagesButton;

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

    //@FindBy(xpath = "(//div[@id='first-patient']//div//h3)[1]")

    public WebElement selectedFirstPatient;

    @FindBy(id="first-patient")
    public WebElement selectedPatientID;

    @FindBy(xpath = "//input[@value='Yes, continue'")
    public WebElement confirmPreferredRecord;


    @FindBy(id="confirm-button")
    public WebElement confirmButtonPatientMerge;

    @FindBy(xpath = "//div[@class='messages-container']/h1")
    public WebElement mergingCannotBeUndoneText;

    @FindBy(id = "appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension")
    public WebElement appointmentsButton;

    @FindBy(id = "appointmentschedulingui-manageAppointments-app")
    public WebElement manageAppointments;

    @FindBy(id = "patient-search")
    public WebElement searchPatients;


    @FindBy(xpath = "(//div[@class='note error'])[2]")
    public WebElement errorMessage;

    @FindBy(xpath = "(//tbody/tr/td[2])[1]")
    public WebElement patientId;

    @FindBy(css = "[class='logo']")
    public WebElement logo;

    @FindBy(xpath = "//*[@id='loginButton']")
    public WebElement login;


    @FindBy(xpath = "(//a[@class='btn btn-default btn-lg button app big align-self-center'])[1]")
    public WebElement findPatientRecord;

    //@FindBy(xpath = "//*[text()='Showing 16 to 27 of 27 entries']")
    @FindBy(id="patient-search-results-table_info")
    public WebElement showing;

    @FindBy(xpath = "//*[@id='patient-search-results-table_next']")
    public WebElement patientListNextPage;

    //@FindBy(xpath = "//div[@id='navbarSupportedContent']//li[@class='nav-item logout']/a")
    //@FindBy(xpath="//a[normalize-space()='Logout']")
    //@FindBy(xpath = "//a[contains(text(), 'Logout')]")
    @FindBy(css="[class='nav-item logout']")
    //@FindBy(css = "[class='icon-signout small']")
    public WebElement logout;

    @FindBy(xpath = "//*[@class='w-auto']")
    public WebElement giris;

    @FindBy(css = "a[href='https://demo.openmrs.org/openmrs/login.htm']")
    public WebElement openMRS2Demo;

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
