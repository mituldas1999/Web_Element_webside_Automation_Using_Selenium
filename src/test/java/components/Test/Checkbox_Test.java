package components.Test;

import Webelemets.login.LoginSteps;
import components.POM.Breadcrumb_POM;
import components.POM.Checkbox_POM;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Checkbox_Test extends LoginSteps {
    Checkbox_POM checkbox_pom;
    @BeforeClass
    public void loginToThePortal(){
        initializeDriver();
        login();
    }

    @Test(priority = 1)
    public void verifyCheckboxLink(){
        checkbox_pom= new Checkbox_POM();
        Assert.assertTrue(checkbox_pom.clickCheckBoxLink());
    }

    @Test(priority = 2)
    public void verifyCheckboxTitle(){
        Assert.assertTrue(checkbox_pom.verifyCheckBoxTitle());
    }

    @Test(priority = 3)
    public void verifyFirstBox(){
        Assert.assertTrue(checkbox_pom.verifyFirstBox());
    }
    @Test(priority = 4)
    public void verifySecondBox(){
        Assert.assertTrue(checkbox_pom.verifySecondBox());
    }
    @Test(priority = 5)
    public void verifyFavouriteBox(){
        Assert.assertTrue(checkbox_pom.verifyFavouriteBox());
    }
    @Test(priority = 6)
    public void verifySaveBox(){
        Assert.assertTrue(checkbox_pom.verifySaveBox());
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
