package test;

import base.SeleniumBase;
import org.testng.annotations.AfterClass;
import page.*;
import utils.Helpers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GuruPageTest extends SeleniumBase {
    MainAddressPage mainAddressPage;
    Helpers helpers = new Helpers();
    BasePage basePage;
    BankProjectPage bankProjectPage;
    LoginPage loginPage;


    String rEmail;
    String name;
    String address;
    String city;
    String state;
    String pin;
    String phone;


    @BeforeClass
    public void setupDriver() {
        InitDriver();
    }


    @Test
    public void CreateAccountEmailTest() throws InterruptedException {
        mainAddressPage = new MainAddressPage(driver);
        mainAddressPage.getAddress();
        basePage = new BasePage(driver);
        loginPage = new LoginPage(driver);
        bankProjectPage = new BankProjectPage(driver);

        rEmail = helpers.randomEmail(7);
        loginPage.enterEmail(rEmail);
        loginPage.goToBankProjectPage();

        name = helpers.randomFirstName();
        address = helpers.randomAddress();
        city = helpers.randomStr(5);
        state = helpers.randomStr(7);
        pin = helpers.randomNumber(6);
        phone = helpers.randomNumber(9);

        bankProjectPage.createCustomer(name, address, city, state, pin, phone, rEmail);

        basePage.delay(5);

    }


    @AfterClass
    public void quitDriver() {
        driver.quit();
    }
}