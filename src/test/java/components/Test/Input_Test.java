package components.Test;

import Webelemets.login.LoginSteps;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Input_Test extends LoginSteps {
    Input_Test input_test;
    @BeforeClass
    public void loginToThePortal(){
        initializeDriver();
        login();
    }

    @Test(priority = 1)
    public void verifyinputLink(){
        input_test=new Input_Test();
        input_test.verifyinputLink();
    }
}
