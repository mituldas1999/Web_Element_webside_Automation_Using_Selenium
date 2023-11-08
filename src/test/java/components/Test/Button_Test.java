package components.Test;

import Webelemets.login.LoginSteps;
import components.POM.Button_POM;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Button_Test extends LoginSteps {
    Button_POM button_pom;
    @BeforeClass
    public void initializeTheDriver(){
        initializeDriver();
    }
    @Test(priority = 1,dependsOnMethods ="loginToPortal")
    public void loginToPortal(){
        login();
    }
    @Test(priority = 2,dependsOnMethods ="loginToPortal")
    public void verifyTheButtonLink(){
        button_pom=new Button_POM();
        Assert.assertTrue(button_pom.clickButtonLink());
    }
    @Test(priority = 3,dependsOnMethods ="loginToPortal")
    public void verifyTheSecondaryButton(){
        Assert.assertEquals(button_pom.verifySecondaryButton(),"Button Clicked","Secondary Button Clicking Message is not Matching!");
    }
    @Test(priority = 4,dependsOnMethods ="loginToPortal")
    public void verifyTheSuccessButton(){
        Assert.assertEquals(button_pom.verifySuccessButton(),"Button Clicked","Success Button Clicking Message is not Matching!");
    }
    @Test(priority = 5,dependsOnMethods ="loginToPortal")
    public void verifyTheErrorButton(){
        Assert.assertEquals(button_pom.verifyErrorButton(),"Button Clicked","Error Button Clicking Message is not Matching!");
    }
    @Test(priority = 6,dependsOnMethods ="loginToPortal")
    public void verifyTheDeleteButton(){
        Assert.assertEquals(button_pom.verifyDeleteButton(),"Button Clicked","Delete Button Clicking Message is not Matching!");
    }
    @Test(priority = 7,dependsOnMethods ="loginToPortal")
    public void verifyTheSendButton(){
        Assert.assertEquals(button_pom.verifySendButton(),"Button Clicked","Send Button Clicking Message is not Matching!");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
