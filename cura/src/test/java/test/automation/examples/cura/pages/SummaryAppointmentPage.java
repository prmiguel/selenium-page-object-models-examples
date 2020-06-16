package test.automation.examples.cura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SummaryAppointmentPage extends BasePage {

    private By facilityBy = By.cssSelector("");
    private By hospitalReadmissionBy = By.cssSelector("");
    private By programBy = By.cssSelector("");
    private By visitDateBy = By.cssSelector("");
    private By commentBy = By.cssSelector("");

    public SummaryAppointmentPage(WebDriver wd) {
        super(wd);
    }

    @Override
    protected void checkPage() {

    }

    public String displayedFacility() {
        return getWebDriver().findElement(facilityBy).getText();
    }

    public String displayedHospitalReadmission() {
        return getWebDriver().findElement(hospitalReadmissionBy).getText();
    }

    public String displayedHealthcareProgram() {
        return getWebDriver().findElement(programBy).getText();
    }

    public String displayedVisitDate() {
        return getWebDriver().findElement(visitDateBy).getText();
    }

    public String displayedComment() {
        return getWebDriver().findElement(commentBy).getText();
    }
}
