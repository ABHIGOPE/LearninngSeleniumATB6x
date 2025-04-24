package com.thetestingacademy.ex_selenium20072024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab327 {



        WebDriver driver ;

        @BeforeTest
        public void openBrowser() {
            EdgeOptions options = new EdgeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            options.addArguments("--guest");
            driver = new EdgeDriver(options);
        }

        @Test
        @Description("")
        public void testTables() {
            driver.get("https://awesomeqa.com/webtable.html");
            System.out.println(driver.getTitle());

            // Print all the data in the table. - P1
            // Halen belong to which country  - P2

            WebElement username = driver.findElement(By.id("login-username"));
            username.sendKeys("contact+atb7x@thetestingacademy.com");

            WebElement password = driver.findElement(By.id("login-password"));
            password.sendKeys("Wingify@1234");

            WebElement login = driver.findElement(By.id("js-login-btn"));
            login.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-qa=\"lufexuloga\"]")));

            WebElement loggedInUser = driver.findElement(By.cssSelector("[data-qa=\"lufexuloga\"]"));

            System.out.println("Logged In User Details-->" + loggedInUser.getText());

            Assert.assertEquals(loggedInUser.getText(), "Aman Ji");
        }

        @AfterTest
        public void closeBrowser() {


            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.quit();
        }


    }



