package components.Test;

import Webelemets.login.LoginSteps;
import components.POM.AlertPOM;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertTest extends LoginSteps {
    AlertPOM alertPOM;
    @BeforeTest
    public void loginPortal(){
        initializeDriver();
        login();
    }
    @Test(priority = 1)
    public void verifyAlerts(){
        alertPOM=new AlertPOM();
        alertPOM.clickAlertLink();
        Assert.assertEquals(alertPOM.getAlertTitle(),"Alert","Alart title is Not Matching!");
    }
    @Test(priority = 2)
    public void verifyErrorAlert(){
        Assert.assertEquals(alertPOM.getErrorAlert(),"This is an error alert — check it out!","The error alart text is not matching!");
    }
    @Test(priority = 3)
    public void verifySuccessAlertText(){
        Assert.assertEquals(alertPOM.getSuccessAlertText(),"Success","Success title is Not Matching!");
    }
    @Test(priority = 4)
    public void verifyinfoAlert(){
        Assert.assertEquals(alertPOM.infoAlert(),"This is an info alert — check it out!","Info alert title is Not Matching!");
    }
    @AfterTest
    public void quiteDriver(){
        driver.quit();
    }
}