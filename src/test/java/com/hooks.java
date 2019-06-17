package com;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {

    webDriverClass driverclass = new webDriverClass();


    @Before
    public void open(){
        //open browser
        driverclass.openBrowser();

    }







    @After
    public void close(){
        driverclass.closeBrowser();
        //close browser
    }








}
