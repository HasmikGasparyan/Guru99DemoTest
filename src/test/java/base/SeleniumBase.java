package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class SeleniumBase {

    public WebDriver driver;

    public void InitDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().window().maximize();
    }


    public void quitDriver() {
        driver.quit();
    }

}