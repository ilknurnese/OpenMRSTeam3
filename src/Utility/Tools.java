package Utility;

import main.Elements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Tools {

    public static void wait(int sn) {
        try {
            Thread.sleep(sn * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    private static WebDriver driver;

    // WebDriver'ı yöneten metod
    public static WebDriver getDriver() {
        if (driver == null) { // Eğer driver henüz oluşturulmamışsa
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        }
        return driver; // Zaten oluşturulmuşsa var olan driver'ı döner
    }

//    // WebElement'e kaydırma fonksiyonu
//    public static void scrollToElement(WebElement element) {
//        JavascriptExecutor js = (JavascriptExecutor) getDriver(); // Tools sınıfından driver'ı al
//        js.executeScript("arguments[0].scrollIntoView();", element); // Elemente kaydır
//    }
//
//

    public static void scrollToElement(WebElement element)
    {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",element);

    }

        public static void scrollClick(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",element);

        }


    public static int random(int sinir) {

        return (int) Math.random() * sinir;
    }



}
