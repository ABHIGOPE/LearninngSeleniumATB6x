package com.thetestingacademy.ex_selenium13072024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab313 {

    @Test
    public void testVWOLoginNegative() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        WebElement emailInputBox = (WebElement) driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement emailPasswordBox = (WebElement) driver.findElement(By.id("login-password"));
        emailPasswordBox.sendKeys("Hello@123");


        WebElement signinButtopn = (WebElement) driver.findElement(By.id("js-login-btn"));
        signinButtopn.click();

        Thread.sleep(5000);


        // Verify the message
        //WebElement error_msg = driver.findElement(By.id("js-notification-box-msg"));
        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_msg.getText(), "Your email, password, IP address or location did not match");


      WebElement freeTrialLink =driver.findElement(By.linkText("Start a free trial"));
      freeTrialLink.click();
       Assert.assertEquals(driver.getCurrentUrl(),"https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage");


        Thread.sleep(3000);



        driver.quit();


        // id - , name , class not unique ->
        // link text and partial link  - a tag anchor
        //WebElement freeTrialLink = driver.findElement(By.linkText("Start a free trial"));


    }
}