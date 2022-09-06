package page;

import org.openqa.selenium.WebDriver;

public class MainAddressPage {

    WebDriver driver;
    BasePage basePage;

    public MainAddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getAddress()  {
        basePage = new BasePage(driver);
        driver.get("https://demo.guru99.com/");
    }
}