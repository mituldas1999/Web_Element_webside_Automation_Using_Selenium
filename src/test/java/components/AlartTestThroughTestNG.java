package components;

import Webelemets.login.LoginSteps;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AlartTestThroughTestNG extends LoginSteps {
    public static void main(String[] args) {
        LoginSteps loginSteps=new LoginSteps();
        loginSteps.initializeDriver();
        loginSteps.login();
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/nav[1]/div[1]/div[1]/div[1]/ul[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")).click();

        AlartTestThroughTestNG alartTestThroughTestNG=new AlartTestThroughTestNG();
        alartTestThroughTestNG.verifyAlartText();
        alartTestThroughTestNG.verifyErrorAlart();
        alartTestThroughTestNG.verifySuccessWarningAlert();
        alartTestThroughTestNG.verifySuccessAlert();
        alartTestThroughTestNG.verifyInfoAlert();
        driver.quit();
    }
    public void verifyAlartText(){
        //inspect the alart title
        String alarttitle= driver.findElement(By.xpath("//h3[contains(text(),'Alert')]")).getText();
        //verify the alart title
        Assert.assertEquals(alarttitle,"Alert","The alart message is not matching");
    }
    public  void verifyErrorAlart(){
        String erroralart=driver.findElement(By.xpath("//div[contains(text(),'This is an error alert — check it out!')]")).getText();
       Assert.assertEquals(erroralart,"This is an error alert — check it out!","The Error alart title is not Matching");
    }
    public void verifySuccessWarningAlert(){
       String successWarningAlert= driver.findElement(By.xpath("//div[contains(text(),'Success')]")).getText();
       Assert.assertEquals(successWarningAlert,"Success","The Success message is not matching");
    }

    public void verifySuccessAlert(){
        String successAlert=driver.findElement(By.xpath("//div[contains(text(),'This is a success alert — check it out!')]")).getText();
        Assert.assertEquals(successAlert,"This is a success alert — check it out!","The Success alert message is not matching");

    }

    public void verifyInfoAlert(){
        String verifyInfoAlert=driver.findElement(By.xpath("//div[contains(text(),'This is an info alert — check it out!')]")).getText();
        Assert.assertEquals(verifyInfoAlert,"This is an info alert — check it out!","The Info alert message is not matching");
    }

}
