package test.automation.examples.cura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import test.automation.examples.cura.exceptions.NotExpectedPageException;

public class LoginPage extends BasePage {

    private By usernameBy = By.cssSelector("#txt-username");
    private By passwordBy = By.cssSelector("#txt-password");
    private By loginBy = By.cssSelector("#btn-login");

    public LoginPage(WebDriver wd) {
        super(wd);
    }

    @Override
    protected void checkPage() {
    }

    public MakeAppointmentPage loginWithCredentials(String username, String password) {
        getWebDriver().findElement(usernameBy).sendKeys(username);
        getWebDriver().findElement(passwordBy).sendKeys(password);
        getWebDriver().findElement(loginBy).click();

        return new MakeAppointmentPage(getWebDriver());
    }
}
