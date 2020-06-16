package test.automation.examples.cura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MakeAppointmentPage extends BasePage {

    private By facilityBy = By.cssSelector("#combo_facility");
    private By hospitalReadmissionBy = By.cssSelector("#chk_hospotal_readmission");
    private By visitDateBy = By.cssSelector("#txt_visit_date");
    private By commentBy = By.cssSelector("#txt_comment");
    private By bookAppointmentBy = By.cssSelector("#btn-book-appointment");

    public MakeAppointmentPage(WebDriver wd) {
        super(wd);
    }

    private By programBy(String program) {
        return By.cssSelector(String.format("[name='programs'][value='%s']", program));
    }

    @Override
    protected void checkPage() {

    }

    public void selectFacility(String facility) {
        WebElement facilityElement = getWebDriver().findElement(facilityBy);
        Select selectFacility = new Select(facilityElement);
        selectFacility.selectByValue(facility);
    }

    public void applyForHospitalReadmission() {
        getWebDriver().findElement(hospitalReadmissionBy).click();
    }

    public void chooseHealthcareProgram(String program) {
        getWebDriver().findElement(programBy(program)).click();
    }

    public void scheduleVisitDate(String date) {
        getWebDriver().findElement(visitDateBy).sendKeys(date);
    }

    public void addCommentForAppointment(String comment) {
        getWebDriver().findElement(commentBy).sendKeys(comment);
    }

    public SummaryAppointmentPage bookAppointment() {
        getWebDriver().findElement(bookAppointmentBy).click();

        return new SummaryAppointmentPage(getWebDriver());
    }
}
