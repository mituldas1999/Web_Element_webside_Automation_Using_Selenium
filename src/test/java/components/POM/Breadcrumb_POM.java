package components.POM;

import Webelemets.login.LoginSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Breadcrumb_POM extends LoginSteps {

    //inspect the element
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/nav/div/div/div/ul/div[4]/div/div/div/div[5]/div[2]/span")
    WebElement breadCrumbLink;

    @FindBy(xpath = "//h3[contains(text(),'Breadcrumb')]")
    WebElement breadCrumbTitle;

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/nav[1]/ol[1]/li[5]/p[1]")
    WebElement breadCrumb;

    //initialize the element
    public Breadcrumb_POM(){
        PageFactory.initElements(driver,this);
    }

    //Derclired the method
    public boolean verifyTheBreadCrumbLink(){
        boolean verifyTheBreadCrumbLinkEnable=breadCrumbLink.isEnabled();
        breadCrumbLink.click();
        return verifyTheBreadCrumbLinkEnable;
    }
    public boolean verifyTheBreadCrumbTitle(){
        boolean verifyTheBreadCrumbTitleEnable=breadCrumbTitle.isEnabled();
        return verifyTheBreadCrumbTitleEnable;
    }
    public boolean verifyTheBreadCrumb(){
        boolean verifyTheBreadCrumb=breadCrumb.isEnabled();
        return verifyTheBreadCrumb;
    }


}
