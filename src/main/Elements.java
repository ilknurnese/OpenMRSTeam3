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



}
