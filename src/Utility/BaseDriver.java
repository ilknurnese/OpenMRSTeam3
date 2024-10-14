package Utility;

import main.Elements;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseDriver {
    public static final org.apache.logging.log4j.Logger logger4j2 = LogManager.getLogger();
    public static Logger createLog = LogManager.getLogger();
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void initialOperations() {

        Elements elements= new Elements();

        createLog.info("logging started");
        driver = new ChromeDriver();
        createLog.info("driver is starting");

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        demoEnter();

        // Artık login sayfası açıldı ve burada login işlemleri yapılabilir
        // driver.get("https://demo.openmrs.org/openmrs/login.htm");

    }

    @AfterClass
    public void finishingOperations() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (driver != null) {
            driver.quit();
            driver = null;
        }
        createLog.info("logging is finished");
    }

    public void login() {

        Elements elements = new Elements();
//        driver.get("https://demo.openmrs.org/openmrs/login.htm");
//        Tools.wait(2);
        wait.until(ExpectedConditions.elementToBeClickable(elements.username));
        elements.username.sendKeys("admin");
        elements.password.sendKeys("Admin123");
        elements.location.click();
        elements.login.click();

    }
    public void demoEnter(){

        Elements elements=new Elements();

        driver.get("https://openmrs.org/");
        driver.manage().window().maximize();

        // İlk adımlar bir kere çalışsın
        wait.until(ExpectedConditions.elementToBeClickable(elements.languageOption)).click();  // "EN" seçeneği
        wait.until(ExpectedConditions.elementToBeClickable(elements.demoButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.openMRS2Demo)).click();   //login sayfasına gider
    }

}
