package com.thetestingacademy.ex_selenium20072024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Lab321 {

    EdgeDriver driver;

    @BeforeTest
    public void startBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }


    @Test(groups = "QA")
    @Description ("Test Case Description")
    public void openBrowser() {

        //Explicit Wait
        driver.navigate().to("https://app.vwo.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("login-username"));
        username.sendKeys("gope@gmail.com");


        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("12345678");


        WebElement loginButton=driver.findElement(By.id("js-login-btn"));
        loginButton.click();


        WebElement error_msg=driver.findElement(By.id("js-notification-box-msg"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElement(error_msg,"Your email, password, IP address or location did not match"));



        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");








        }


    @AfterTest


    public void quitBrowser()

    {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }


}

