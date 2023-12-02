package components.Test;

import Webelemets.login.LoginSteps;
import components.POM.DropDown_POM;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropDown_Test extends LoginSteps {
DropDown_POM dropDown_pom;
    @BeforeClass
    public void loginToThePortal(){
        initializeDriver();
        login();
    }
    @Test(priority = 1)
    public void verifyDropDownLink(){
        dropDown_pom=new DropDown_POM();
        Assert.assertTrue(dropDown_pom.clickDropDownLink());
    }
    @Test(priority = 2)
    public void verifyDropDownTitle(){
        Assert.assertEquals(dropDown_pom.verifytheDropDownTitle(),"Dropdown","Dropdown Button Clicking Message is not Matching!");
    }
}
