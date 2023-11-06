package components;

import Webelemets.login.LoginSteps;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Accordion extends LoginSteps {
    public static void main(String[] args) {
        LoginSteps loginSteps=new LoginSteps();
        loginSteps.initializeDriver();
        loginSteps.login();

        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/nav[1]/div[1]/div[1]/div[1]/ul[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]")).click();
        Accordion accordion=new Accordion();
        accordion.verifyAccordionTitle();
        accordion.verifyAccrodionTexts();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }


    //Verifired the accordion page title
    public void verifyAccordionTitle(){
       String accordionText=driver.findElement(By.xpath("//h3[contains(text(),'Accordion')]")).getText();
        Assert.assertEquals(accordionText,"Accordion","Accordion text title is not Matching!");
        System.out.println("Verified the accordion Title!\n");
    }
    public void verifyAccrodionTexts(){
        String accordionText= driver.findElement(By.xpath("//p[contains(text(),'Accordion Item 1')]")).getText();
        Assert.assertEquals(accordionText,"Accordion Item 1","Accordion items is not Matching!");
        String accordionOneText=driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[1]")).getText();
        Assert.assertEquals(accordionOneText,"Accordions are useful when you want to toggle between hiding and showing large amount of content","The Accordion item text is not Matching!");
        System.out.println("Verified the Accordion Text!");
    }
}
