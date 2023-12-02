package components.POM;

import Webelemets.login.LoginSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ButtonGroup_POM extends LoginSteps {
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[2]/div[1]/nav[1]/div[1]/div[1]/div[1]/ul[1]/div[4]/div[1]/div[1]/div[1]/div[4]/div[2]/span[1]")
    WebElement buttonGroupLink;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[1]/h3")
    WebElement buttonGroupTextTitle;

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/button[1]")
    WebElement oneButtonLink;

    @FindBy(xpath = "//div[contains(text(),'Button Clicked')]")
    WebElement oneButtonClickedLinked;

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/button[2]")
    WebElement twoButtonLink;

    @FindBy(xpath = "//div[contains(text(),'Button Clicked')]")
    WebElement twoButtonClickedLinked;


    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[3]/div[1]/div/button[3]")
    WebElement threeButtonLink;

    @FindBy(xpath = "//div[contains(text(),'Button Clicked')]")
    WebElement threeButtonClickedLinked;


    //initialize the element
    public ButtonGroup_POM(){
        PageFactory.initElements(driver,this);
    }

    public Boolean clickButtonGroupLink(){
        boolean buttonGroupLinkEnable=buttonGroupLink.isEnabled();
        buttonGroupLink.click();
        return buttonGroupLinkEnable;
    }

    public void verifyButtonGroupTextTitle(){
        String buttonGroupTitleText=buttonGroupTextTitle.getText();
        Assert.assertEquals(buttonGroupTitleText,"Button Group","Accordion text title is not Matching!");
    }

    public String verifyOneButton(){
        oneButtonLink.click();
        waitDeiver(2000);
        String verifyTheMessage=oneButtonClickedLinked.getText();
        oneButtonClickedLinked.click();
        return verifyTheMessage;
    }

    public String verifyTwoButton(){
        twoButtonLink.click();
        waitDeiver(2000);
        String verifyTheMessage=twoButtonClickedLinked.getText();
        twoButtonClickedLinked.click();
        return verifyTheMessage;
    }

    public String verifyThreeButton(){
        threeButtonLink.click();
        waitDeiver(2000);
        String verifyTheMessage=threeButtonClickedLinked.getText();
        threeButtonClickedLinked.click();
        return verifyTheMessage;
    }
}

