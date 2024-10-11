package Utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseDriver {
    public static Logger createlog=LogManager.getLogger();
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void BaslangicIslemleri()
    {
        createlog.info("loging is start");

        driver=new ChromeDriver();
       createlog.info("driver is starting");

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
     createlog.info("loging is finished");

    }
    public void Login()
    {
        driver.get("https://openmrs.org/");
        Tools.Bekle(2);

    }
}
