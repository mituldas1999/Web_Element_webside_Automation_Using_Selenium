package components;

import Webelemets.login.LoginSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Button extends LoginSteps {
    public static void main(String[] args) {
        LoginSteps loginSteps=new LoginSteps();
        loginSteps.initializeDriver();
        loginSteps.login();


        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/nav[1]/div[1]/div[1]/div[1]/ul[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[2]/span[1]")).click();
        Button button=new Button();
        button.verifyButtonTitle();
        button.clickSecondaryButton();
        button.clickSuccessButton();
        button.clickErrorButton();
        button.clickDeleteButton();
        button.clickSendButton();
        driver.quit();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    public void verifyButtonTitle(){
        String buttonText=driver.findElement(By.xpath("//h3[contains(text(),'Button')]")).getText();
        Assert.assertEquals(buttonText,"Button","Button text title is not Matching!");
        System.out.println("Verified the Button Title!\n");
    }
    //Click on the secondary button
    public void clickSecondaryButton(){
        WebElement secondaryButton=driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/button[1]"));
        secondaryButton.click();
        try{
          Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String secondaryButtonMessage= driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]")).getText();
        Assert.assertEquals(secondaryButtonMessage,"Button Clicked","Secondary Button Clicking Message is not Matching!");
        System.out.println("Verified the Secondary Button Clicking Message!\n");
        secondaryButton.click();

    }
    public void clickSuccessButton(){
        WebElement successButton=driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/button[2]"));
        successButton.click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String clickSuccessButton= driver.findElement(By.xpath("//div[contains(text(),'Button Clicked')]")).getText();
        Assert.assertEquals(clickSuccessButton,"Button Clicked","Click Success Button Clicking Message is not Matching!");
        System.out.println("Verified Success Button Clicking Message!\n");
        successButton.click();

    }

    public void clickErrorButton(){
        WebElement errorButton=driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/button[3]"));
        errorButton.click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String clickErrorButton= driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]")).getText();
        Assert.assertEquals(clickErrorButton,"Button Clicked","Click Error Button Clicking Message is not Matching!");
        System.out.println("Verified Error Button Clicking Message!\n");
        errorButton.click();
    }
    public void clickDeleteButton(){
        WebElement deleteButton=driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/button[4]"));
        deleteButton.click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String clickDeleteButton= driver.findElement(By.xpath("//div[contains(text(),'Button Clicked')]")).getText();
        Assert.assertEquals(clickDeleteButton,"Button Clicked","Click Delete Button Clicking Message is not Matching!");
        System.out.println("Verified Delete Button Clicking Message!\n");
        deleteButton.click();
    }
    public void clickSendButton(){
        WebElement sendButton=driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/button[5]"));
        sendButton.click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String clickSendButton= driver.findElement(By.xpath("//div[contains(text(),'Button Clicked')]")).getText();
        Assert.assertEquals(clickSendButton,"Button Clicked","Click Send Button Clicking Message is not Matching!");
        System.out.println("Verified Send Button Clicking Message!\n");
        sendButton.click();
    }

}
