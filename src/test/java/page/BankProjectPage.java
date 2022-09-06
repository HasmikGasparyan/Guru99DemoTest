package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BankProjectPage {

    WebDriver driver;
    BasePage basePage;

    public BankProjectPage(WebDriver driver) {
        this.driver = driver;
    }

    public void createCustomer(String name, String address, String city, String state, String pin, String phone, String email) throws InterruptedException {
        basePage = new BasePage(driver);

        basePage.clickOnElement("xpath", "/html/body/div[3]/div/ul/li[2]/a");
        basePage.insertInto("xpath", "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input", name);
        basePage.clickOnElement("xpath", "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]");
        basePage.insertInto("css", "[id='dob']", "1012");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).build().perform();
        basePage.insertInto("css", "[id='dob']", "1994");
        basePage.insertInto("xpath", "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea", address);
        basePage.insertInto("xpath", "/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input", city);
        basePage.insertInto("xpath", "/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input", state);
        basePage.insertInto("xpath", "/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input", pin);
        basePage.insertInto("xpath", "/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input", phone);
        basePage.insertInto("xpath", "/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input", email);
        basePage.delay(2);
        basePage.clickOnElement("xpath", "/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input[1]");
    }
}
