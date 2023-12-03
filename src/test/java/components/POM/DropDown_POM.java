package components.POM;

import Webelemets.login.LoginSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DropDown_POM extends LoginSteps {
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/nav/div/div/div/ul/div[4]/div/div/div/div[7]/div[2]/span")
    WebElement checkDropdownLink;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/main/div/div/div[1]/h3")
    WebElement checkDropdownTitle;

    @FindBy(xpath = "//*[@id=\"demo-customized-button\"]")
    WebElement checkDropdownOption;

    @FindBy(xpath = "//*[@id=\"demo-customized-menu\"]/div[3]/ul/li[1]")
    WebElement checkEditButton;

    @FindBy(xpath = "//body/div[@id='demo-customized-menu']/div[3]/ul[1]/li[2]")
    WebElement checkDuplicateButton;

    @FindBy(xpath = "//body/div[@id='demo-customized-menu']/div[3]/ul[1]/li[3]")
    WebElement checkArchivedButton;

    @FindBy(xpath = "//body/div[@id='demo-customized-menu']/div[3]/ul[1]/li[4]")
    WebElement checkMoreButton;

    public DropDown_POM(){
        PageFactory.initElements(driver,this);
    }

    public Boolean clickDropDownLink(){
        boolean dropDownLinkEnable=checkDropdownLink.isEnabled();
        checkDropdownLink.click();
        return dropDownLinkEnable;
    }
    public String verifytheDropDownTitle(){
        String buttonPageTitleText;
        buttonPageTitleText = checkDropdownTitle.getText();
        Assert.assertEquals(buttonPageTitleText,"Dropdown","Dropdown text title is not Matching!");
        return buttonPageTitleText;
    }

    public String verifytheEditOption(){
        checkDropdownOption.click();
        waitDeiver(2000);
        String verifyTheMessage=checkEditButton.getText();
        checkEditButton.click();
        return verifyTheMessage;
    }

    public String verifytheDuplicateOption(){
        checkDropdownOption.click();
        waitDeiver(2000);
        String verifyTheMessage=checkDuplicateButton.getText();
        checkDuplicateButton.click();
        return verifyTheMessage;
    }

    public String verifytheArchiveOption(){
        checkDropdownOption.click();
        waitDeiver(2000);
        String verifyTheMessage=checkArchivedButton.getText();
        checkArchivedButton.click();
        return verifyTheMessage;
    }
    public String verifytheMoreOption(){
        checkDropdownOption.click();
        waitDeiver(2000);
        String verifyTheMessage=checkMoreButton.getText();
        checkMoreButton.click();
        return verifyTheMessage;
    }


}