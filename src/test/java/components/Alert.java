//package components;
//
//import Webelemets.login.LoginSteps;
//import org.openqa.selenium.By;
//
//public class Alert extends LoginSteps {
//    public static void main(String[] args) {
//        LoginSteps loginSteps=new LoginSteps();
//        loginSteps.initializeDriver();
//        loginSteps.login();
//        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/nav[1]/div[1]/div[1]/div[1]/ul[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")).click();
//
//        Alert alert=new Alert();
//        alert.verifyAlartText();
//        alert.verifyErrorAlart();
//    }
//    public void verifyAlartText(){
//        //inspect the alart title
//        String alarttitle= driver.findElement(By.xpath("//h3[contains(text(),'Alert')]")).getText();
//        System.out.println("Title: "+alarttitle);
//
//        //verify the alart title
//        if(alarttitle.equals("Alert")){
//            System.out.println("Alart title is Matching!");
//        }else{
//            System.out.println("Alart title is Not Matching!");
//        }
//    }
//    public  void verifyErrorAlart(){
//        String erroralart=driver.findElement(By.xpath("//div[contains(text(),'This is an error alert — check it out!')]")).getText();
//        System.out.println("Error Alart: "+erroralart);
//        if(erroralart.equals("This is an error alert — check it out!")){
//            System.out.println("The error alart text is matching!");
//        }else {
//            System.out.println("The error alart text is not matching!");
//        }
//
//
//    }
//}
