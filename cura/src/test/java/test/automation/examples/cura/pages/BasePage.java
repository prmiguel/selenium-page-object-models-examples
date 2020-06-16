package test.automation.examples.cura.pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    private WebDriver wd;

    protected BasePage(WebDriver wd) {
        this.wd = wd;
        checkPage();
    }

    protected WebDriver getWebDriver() {
        return wd;
    }

    protected abstract void checkPage();
}
