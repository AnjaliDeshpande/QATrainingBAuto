package com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverClass {

   public static WebDriver driver;


    public void openBrowser(){
         WebDriverManager.firefoxdriver().setup();
         driver  = new ChromeDriver();
    }


    public void closeBrowser(){
        driver.quit();
    }





}




