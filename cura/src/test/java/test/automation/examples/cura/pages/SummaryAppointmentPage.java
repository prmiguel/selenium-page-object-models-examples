package test.automation.examples.cura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SummaryAppointmentPage extends BasePage {

    private By facilityBy = By.cssSelector("#facility");
    private By hospitalReadmissionBy = By.cssSelector("#hospital_readmission");
    private By programBy = By.cssSelector("#program");
    private By visitDateBy = By.cssSelector("#visit_date");
    private By commentBy = By.cssSelector("#comment");

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
