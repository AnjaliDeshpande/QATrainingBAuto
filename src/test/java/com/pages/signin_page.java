package com.pages;

import com.webDriverClass;
import org.junit.Assert;
import org.openqa.selenium.By;

import javax.print.DocFlavor;
import java.net.URL;

public class signin_page extends webDriverClass {


    public void enterURL(String URL) {
        System.out.println(URL);


        driver.get(URL);

    }

    public void clickRegisterButton() {driver.findElement(By.linkText("Register")).click();}
    public void clickSignInbutton(){
        driver.findElement(By.linkText("Sign in")).click();
    }

    public void enterEmailAddress(String emailid) {
        driver.findElement(By.id("email")).sendKeys(emailid);

    }

    public void enterPasswordAs(String password) {
        driver.findElement(By.name("passwd")).sendKeys(password);
    }

    public void clickSignInbuttonOnSignInPage() {
        driver.findElement(By.name("SubmitLogin")).click();
    }

    public void assertErrorMessage(String errorMessage_exp) {
        String errorMessage_act;
        errorMessage_act = driver.findElement(By.xpath("//*[@id=\"center_column\"]/comment()")).getText();
                Assert.assertEquals(errorMessage_exp,errorMessage_act);
    }
}
