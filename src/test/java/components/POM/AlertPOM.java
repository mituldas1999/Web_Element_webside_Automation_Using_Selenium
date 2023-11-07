package components.POM;

import Webelemets.login.LoginSteps;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPOM extends LoginSteps {

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[2]/div[1]/nav[1]/div[1]/div[1]/div[1]/ul[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
    WebElement alertLink;

    @FindBy(xpath = "//h3[contains(text(),'Alert')]")
    WebElement alertTitleText;

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement errorAlert;

    @FindBy(xpath = "//div[contains(text(),'Success')]")
    WebElement successAlertText;

    @FindBy(xpath = "//div[contains(text(),'This is an info alert — check it out!')]")
    WebElement infoAlert;

    //initial the elements
    public AlertPOM(){
        PageFactory.initElements(driver,this);
    }

    //click on the alert link
    public  void clickAlertLink(){
        alertLink.click();
    }

    //return the alert link
    public String getAlertTitle(){
        String alertPageTitleElement=alertTitleText.getText();
        return alertPageTitleElement;
    }
    //return the error alert
    public String getErrorAlert(){
        String errorAlertText=errorAlert.getText();
        return errorAlertText;
    }
    public String getSuccessAlertText(){
        String SuccessAlertText=successAlertText.getText();
        return SuccessAlertText;
    }
    public String infoAlert(){
        String infoAlertText=infoAlert.getText();
        return infoAlertText;
    }

}
