package components.POM;

import Webelemets.login.LoginSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkbox_POM extends LoginSteps {
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/nav/div/div/div/ul/div[4]/div/div/div/div[6]/div[2]/span")
    WebElement checkBoxLink;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[1]/h3")
    WebElement checkBoxText;

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[2]/span[1]/input[1]")
    WebElement checkFirstBox;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[2]/span[2]/input")
    WebElement checkSecondBox;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[3]/span[1]/input")
    WebElement checkFavouriteBox;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[3]/span[2]/input")
    WebElement checkSaveBox;

    //initialize the element
    public Checkbox_POM(){
        PageFactory.initElements(driver,this);
    }

    public Boolean clickCheckBoxLink(){
        boolean checkBoxLinkEnable=checkBoxLink.isEnabled();
        checkBoxLink.click();
        return checkBoxLinkEnable;
    }
    public boolean verifyCheckBoxTitle(){
        boolean verifyCheckBoxTitle=checkBoxText.isEnabled();
        return verifyCheckBoxTitle;
    }
    public boolean verifyFirstBox(){
        boolean verifyFirstCheckBox=checkFirstBox.isEnabled();
        return verifyFirstCheckBox;
    }
    public boolean verifySecondBox(){
        boolean verifySecondCheckBox=checkSecondBox.isEnabled();
        return verifySecondCheckBox;
    }
    public boolean verifyFavouriteBox(){
        boolean verifyFavouriteCheckBox=checkFavouriteBox.isEnabled();
        return verifyFavouriteCheckBox;
    }
    public boolean verifySaveBox(){
        boolean verifySaveCheckBox=checkSaveBox.isEnabled();
        return verifySaveCheckBox;
    }
}
