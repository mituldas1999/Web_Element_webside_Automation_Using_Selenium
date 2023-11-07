package components.Test;

import Webelemets.login.LoginSteps;
import components.POM.Accordion_POM;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccordionTest extends LoginSteps {
    Accordion_POM accordion_pom;
    @BeforeTest
    public void loginURL(){
        initializeDriver();
        login();
    }
    @Test
    public void verifyAccordion(){
        accordion_pom=new Accordion_POM();
        accordion_pom.clickAccrodionLink();
        accordion_pom.verifyAccrodionTextTitle();
        accordion_pom.verifyAccordionText();
    }
    @AfterTest
    public void quitDriver(){
        driver.quit();
    }
}
