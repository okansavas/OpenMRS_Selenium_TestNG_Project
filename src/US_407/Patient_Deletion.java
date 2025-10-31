package US_407;

import US_404.Patient_Registration;
import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Patient_Deletion extends BaseDriver {

    @Test(groups = {"Smoke Test", "PatientManagement Test"})
    public void TC_0701() {
        Elements_407 tc07 = new Elements_407();

        tc07.findPatientRecordButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(tc07.homePageIcon));

        tc07.patientSearch.sendKeys(Patient_Registration.patientNameSend);

        wait.until(ExpectedConditions.visibilityOf(tc07.dataTableInfo));

        Assert.assertTrue(tc07.resultsTable.getText().contains(Patient_Registration.patientNameSend), "No Patient with this Information was Found");

        tc07.resultsTable.click();

        wait.until(ExpectedConditions.elementToBeClickable(tc07.deletePatient));

        tc07.deletePatient.click();

        tc07.deleteReason.sendKeys("....");

        tc07.deleteConfirm.click();
    }
}
