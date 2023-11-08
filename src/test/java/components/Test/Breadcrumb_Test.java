package components.Test;

import Webelemets.login.LoginSteps;
import components.POM.Breadcrumb_POM;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Breadcrumb_Test extends LoginSteps {
    Breadcrumb_POM breadcrumb_pom;
    @BeforeClass
    public void loginToThePortal(){
        initializeDriver();
        login();
    }
    @Test(priority = 1)
    public void verifyBreadLink(){
        breadcrumb_pom= new Breadcrumb_POM();
        Assert.assertTrue(breadcrumb_pom.verifyTheBreadCrumbLink());

    }
    @Test(priority = 2)
    public void verifyBreadCrumbTitle(){
        Assert.assertTrue(breadcrumb_pom.verifyTheBreadCrumbTitle());
    }
    @Test(priority = 3)
    public void verifyBreadCrumb(){
        Assert.assertTrue(breadcrumb_pom.verifyTheBreadCrumb());
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
