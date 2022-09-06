package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class LoginPage {
    WebDriver driver;
    BasePage basePage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }



    public void enterEmail(String rEmail)throws InterruptedException {
        basePage = new BasePage(driver);
        basePage.delay(2);
        basePage.insertInto("css", "[name='emailid']", rEmail);
        basePage.clickOnElement("css", "[name='btnLogin']");

    }

    public Map goToBankProjectPage() {
        basePage  = new BasePage(driver);
        Map<String, String> loginPassword = new HashMap<>();
        WebElement loginWebElement = basePage.getElement("css", "tr:nth-child(4)  td[align='center']:nth-child(2)");
        WebElement passwordWebElement = basePage.getElement("css", "tr:nth-child(5)  td[align='center']:nth-child(2)");
        loginPassword.put("login", loginWebElement.getText());
        loginPassword.put("password", passwordWebElement.getText());
        String login = loginPassword.get("login");
        String password = loginPassword.get("password");
        basePage.clickOnElement("xpath", "//*[@id=\"navbar-brand-centered\"]/ul/li[5]/a");
        basePage.insertInto("name", "uid", login);
        basePage.insertInto("name", "password", password);
        basePage.clickOnElement("name", "btnLogin");

        return loginPassword;

    }



}