package com.thetestingacademy.ex_selenium13072024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab314 {
    @Test
    public static void testScenariovwo() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/");

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        WebElement userName=driver.findElement(By.id("login-username"));
        userName.sendKeys("yoyo@du.ae");

        WebElement userPass=driver.findElement(By.id("login-password"));
        userPass.sendKeys("Hello@123");

        WebElement login=driver.findElement(By.id("js-login-btn"));

        login.click();

        Thread.sleep(3000);


        WebElement error_msg=driver.findElement(By.id("js-notification-box-msg"));
        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

        WebElement freeTrialLink=driver.findElement(By.linkText("Start a free trial"));
         freeTrialLink.click();
//        Assert.assertEquals(driver.getCurrentUrl(),"https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage");
//
        WebElement freeTrialEmail=driver.findElement(By.id("page-v1-step1-email"));
        freeTrialEmail.sendKeys("admin@du.ae");

       WebElement gdprConsentCheckbox=driver.findElement(By.name("gdpr_consent_checkbox"));
       gdprConsentCheckbox.click();



    }
}
