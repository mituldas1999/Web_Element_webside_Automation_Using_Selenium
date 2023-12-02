package components.Test;

import Webelemets.login.LoginSteps;
import components.POM.ButtonGroup_POM;
import components.POM.Button_POM;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ButtonGroup_Test extends LoginSteps {
    ButtonGroup_POM buttonGroupPom;
    @BeforeClass
    public void initializeTheDriver(){
        initializeDriver();
    }

    @Test(priority = 1)
    public void loginToPortal(){
        login();
    }

    @Test(priority = 2)
    public void verifyTheButtonGroupLink(){
        buttonGroupPom=new ButtonGroup_POM();
        Assert.assertTrue(buttonGroupPom.clickButtonGroupLink());
    }
    @Test(priority = 3)
    public void verifyTheOneButton(){
        Assert.assertEquals(buttonGroupPom.verifyOneButton(),"Button Clicked","One Button Clicking Message is not Matching!");
    }
    @Test(priority = 4)
    public void verifyTheTwoButton(){
        Assert.assertEquals(buttonGroupPom.verifyTwoButton(),"Button Clicked","Two Button Clicking Message is not Matching!");
    }
    @Test(priority = 5)
    public void verifyTheThreeButton(){
        Assert.assertEquals(buttonGroupPom.verifyThreeButton(),"Button Clicked","Three Button Clicking Message is not Matching!");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
