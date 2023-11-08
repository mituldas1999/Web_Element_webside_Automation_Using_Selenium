package components.POM;

import Webelemets.login.LoginSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Button_POM extends LoginSteps {
    //inspect the element
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/nav/div/div/div/ul/div[4]/div/div/div/div[3]/div[2]/span")
    WebElement buttonLink;

    @FindBy(xpath = "//h3[contains(text(),'Button')]")
    WebElement buttonTitleText;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[3]/div[1]/button[1]")
    WebElement secondaryButtonLink;
    @FindBy(xpath = "//div[contains(text(),'Button Clicked')]")
    WebElement secondaryButtonClicked;


    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[3]/div[1]/button[2]")
    WebElement successButtonLink;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[3]/div[1]/div/div/div")
    WebElement successButtonClicked;


    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[3]/div[1]/button[3]")
    WebElement errorButtonLink;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[3]/div[1]/div/div/div")
    WebElement errorButtonClicked;


    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[3]/div[1]/button[4]")
    WebElement deleteButtonLink;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[3]/div[1]/div/div/div")
    WebElement deleteButtonClicked;


    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[3]/div[1]/button[4]")
    WebElement sendButtonLink;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[3]/div[1]/div/div/div")
    WebElement sendButtonClicked;


    //initialize the element
    public Button_POM(){
        PageFactory.initElements(driver,this);
    }
    public Boolean clickButtonLink(){
       boolean buttonLinkEnable=buttonLink.isEnabled();
       buttonLink.click();
       return buttonLinkEnable;
    }
    public void verifyButtonTextTitle(){
        String buttonPageTitleText=buttonTitleText.getText();
        Assert.assertEquals(buttonPageTitleText,"Button","Accordion text title is not Matching!");
    }
    //Secondary Button
    public String verifySecondaryButton(){
        secondaryButtonLink.click();
        waitDeiver(2000);
        String verifyTheMessage=secondaryButtonClicked.getText();
        secondaryButtonLink.click();
        return verifyTheMessage;
    }
    //Success Button
    public String verifySuccessButton(){
        waitDeiver(2000);
        successButtonLink.click();
        waitDeiver(2000);
        String verifyTheMessage=successButtonClicked.getText();
        secondaryButtonLink.click();
        return verifyTheMessage;
    }
    //Error Button
    public String verifyErrorButton(){
        waitDeiver(2000);
        errorButtonLink.click();
        waitDeiver(2000);
        String verifyTheMessage=errorButtonClicked.getText();
        secondaryButtonLink.click();
        return verifyTheMessage;
    }
    //Delete Button
    public String verifyDeleteButton(){
        waitDeiver(2000);
        deleteButtonLink.click();
        String verifyTheMessage=deleteButtonClicked.getText();
        secondaryButtonLink.click();
        return verifyTheMessage;
    }

    //Send Button
    public String verifySendButton(){
        waitDeiver(2000);
        sendButtonLink.click();
        String verifyTheMessage=sendButtonClicked.getText();
        return verifyTheMessage;
    }

}
