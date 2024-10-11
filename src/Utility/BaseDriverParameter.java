package Utility;

import main.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseDriverParameter {
    public  WebDriver driver;
    public  WebDriverWait wait;


    @BeforeClass
    @Parameters("browserTipi")
    public void BaslangicIslemleri(String browserTipi)
    {
        switch (browserTipi.toLowerCase())
        {
            case "firefox":driver=new FirefoxDriver();break;
            case "safari":driver=new SafariDriver();break;
            default:driver=new ChromeDriver();
        }

      driver=new ChromeDriver();
       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       wait=new WebDriverWait(driver,Duration.ofSeconds(20));
       Login();
    }

    @AfterClass
    public void kapanisIslemleri()
    {
      Tools.Bekle(3);
      driver.quit();


    }
    public void Login()
    {
        Elements elements = new Elements();
        driver.get("https://openmrs.org/");
        Tools.Bekle(2);
        wait.until(ExpectedConditions.elementToBeClickable(elements.username));
        elements.username.sendKeys("admin");
        elements.password.sendKeys("Admin123");
        elements.location.click();
        elements.login.click();
    }
}
