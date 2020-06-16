package test.automation.examples.cura.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import test.automation.examples.cura.pages.LoginPage;
import test.automation.examples.cura.pages.MakeAppointmentPage;
import test.automation.examples.cura.pages.SummaryAppointmentPage;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MakeAppointmentTest {

    private WebDriver webDriver;

    @Test
    public void appointmentShouldBeBooked() {
        LoginPage login = new LoginPage(webDriver);

        MakeAppointmentPage appointment = login.loginWithCredentials("", "");
        appointment.selectFacility("");
        appointment.applyForHospitalReadmission();
        appointment.chooseHealthcareProgram("");
        appointment.scheduleVisitDate("");
        appointment.addCommentForAppointment("");

        SummaryAppointmentPage summary = appointment.bookAppointment();
        assertThat(summary.displayedFacility(), is(""));
        assertThat(summary.displayedHospitalReadmission(), is(""));
        assertThat(summary.displayedHealthcareProgram(), is(""));
        assertThat(summary.displayedVisitDate(), is(""));
        assertThat(summary.displayedComment(), is(""));
    }
}
