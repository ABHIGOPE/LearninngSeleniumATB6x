package com.thetestingacademy.ex_selenium13072024;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab312 {
    @Test
    public void testVWOLoginNegative() throws InterruptedException {
        //        **Project #1 - TC ( Negative) - Invalid username, pass - Error message**
//
//        1. Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
//        2. **Find the Email id** and enter the email as admin@admin.com
//        3. **Find the pass inputbox** and enter passwrod as admin.
//        4. Find and Click on the submit button
//        5. Verify that the error message is shown "Your email, password, IP address or location did not match"
//<input
// type="email"
// class="text-input W(100%)"
// name="username"
// id="login-username"
// data-qa="hocewoqisi"
// fdprocessedid="3hsyjd">


//        <input
//        type="password"
//        class="text-input W(100%)"
//        name="password"
//        id="login-password"
//        data-qa="jobodapuxe"
//        fdprocessedid="p63iip">

        EdgeOptions edgeOptions= new EdgeOptions();
//        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        WebElement emailInputBox= (WebElement) driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement emailPasswordBox= (WebElement) driver.findElement(By.id("login-password"));
        emailPasswordBox.sendKeys("Hello@123");



        WebElement signinButtopn= (WebElement) driver.findElement(By.id("js-login-btn"));
        signinButtopn.click();

        Thread.sleep(5000);


        // Verify the message
        //WebElement error_msg = driver.findElement(By.id("js-notification-box-msg"));
        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");
        Thread.sleep(5000);

        driver.quit();








    }
        }
