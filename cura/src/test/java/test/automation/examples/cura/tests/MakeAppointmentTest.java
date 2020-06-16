package test.automation.examples.cura.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import test.automation.examples.cura.pages.LoginPage;
import test.automation.examples.cura.pages.MakeAppointmentPage;
import test.automation.examples.cura.pages.SummaryAppointmentPage;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MakeAppointmentTest {

    private WebDriver webDriver;

    @Before
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }

    @Test
    public void appointmentShouldBeBooked() {
        LoginPage login = new LoginPage(webDriver);

        MakeAppointmentPage appointment = login.loginWithCredentials("John Doe", "ThisIsNotAPassword");
        appointment.selectFacility("Hongkong CURA Healthcare Center");
        appointment.applyForHospitalReadmission();
        appointment.chooseHealthcareProgram("None");
        appointment.scheduleVisitDate("06/04/2020");
        appointment.addCommentForAppointment("Any comment...");

        SummaryAppointmentPage summary = appointment.bookAppointment();
        assertThat(summary.displayedFacility(), is("Hongkong CURA Healthcare Center"));
        assertThat(summary.displayedHospitalReadmission(), is("Yes"));
        assertThat(summary.displayedHealthcareProgram(), is("None"));
        assertThat(summary.displayedVisitDate(), is("06/04/2020"));
        assertThat(summary.displayedComment(), is("Any comment..."));
    }
}
