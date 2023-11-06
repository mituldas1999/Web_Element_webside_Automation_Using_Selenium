package Webelemets.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class loginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver =new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://automation.ts4u.us/");

        //inpect the login buttonand click on the button
        driver.findElement(By.xpath("//header/div[1]/div[1]/a[1]/button[1]")).click();

        //inspect the email field and send the email address
        driver.findElement(By.id("outlined-basic1")).sendKeys("mitul.das@ts4u.us");

        //inspect the password field and send the valid password
        driver.findElement(By.id("outlined-basic2")).sendKeys("Mituldas@#$1999");

        //click on the sign in button
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")).click();

        //verify the logout button
        boolean verify=driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/button[1]")).isDisplayed();
        System.out.println(verify);
    }
}
