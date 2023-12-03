package components.POM;

import Webelemets.login.LoginSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Input_POM extends LoginSteps {
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/nav/div/div/div/ul/div[4]/div/div/div/div[9]/div[2]/span")
    WebElement checkInputLink;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[1]/h3")
    WebElement checkInputText;

    @FindBy(xpath = "//*[@id=\"outlined-basic\"]")
    WebElement CheckOutlinedBox;

    public Input_POM(){
        PageFactory.initElements(driver,this);
    }

    public void clickInputLink(){
        checkInputLink.click();
    }
    public String verifytheInputTitle() {
        String inputPageTitleText=checkInputText.getText();
        Assert.assertEquals(inputPageTitleText,"Input","Input text title is not Matching!");
        return inputPageTitleText;
    }
}
