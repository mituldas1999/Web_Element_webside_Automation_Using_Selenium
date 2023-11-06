package components.POM;

import Webelemets.login.LoginSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Accordion_POM extends LoginSteps {

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/nav/div/div/div/ul/div[4]/div/div/div/div[2]/div[2]/span")
    WebElement accrodionLink;
    @FindBy(xpath = "//h3[contains(text(),'Accordion')]")
    WebElement accrodionPagetitle;

    @FindBy(xpath = "//p[contains(text(),'Accordion Item 1')]")
    WebElement accrodionTexttitle;

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[1]")
    WebElement accordionOneText;

    //Initialize the Elememt
    public Accordion_POM(){
        PageFactory.initElements(driver,this);
    }
    public void clickAccrodionLink(){
        accrodionLink.click();
    }

    public void verifyAccordionText(){
        String accrodionPageTitleText=accrodionPagetitle.getText();
        Assert.assertEquals(accrodionPageTitleText,"Accordion","Accordion text title is not Matching!");
    }

    public void verifyAccrodionTextTitle(){
        String accrodionElementText=accrodionTexttitle.getText();
        Assert.assertEquals(accrodionElementText,"Accordion Item 1","Accordion title is not Matching!");
    }
    public void verifyAccrodionOneText(){
        String accrodionOneText=accordionOneText.getText();
        Assert.assertEquals(accrodionOneText,"Accordions are useful when you want to toggle between hiding and showing large amount of content","The Accordion item text is not Matching!");
    }

}
