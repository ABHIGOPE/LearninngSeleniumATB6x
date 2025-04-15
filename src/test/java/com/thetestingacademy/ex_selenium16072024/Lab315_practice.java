package com.thetestingacademy.ex_selenium16072024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Lab315_practice {




        @Test
        public static void testScenariovwo() throws InterruptedException {
            WebDriver driver = new EdgeDriver();
            driver.get("https://www.instagram.com/");

//            Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
//            Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");

            //        WebElement btnElement_ID = driver.findElement(By.id("btn-make-appointment"));
//        WebElement btnElement_CN = driver.findElement(By.className("btn-lg"));
//        WebElement btnElement_PTEXT = driver.findElement(By.partialLinkText("Make"));

            Thread.sleep(3000);
                WebElement username = driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username, or email\"]"));
            username.sendKeys("gopeabhishek165@gmail.com");;

            WebElement password = driver.findElement(By.xpath("//input[@aria-label=\"Password\"]"));
            password.sendKeys("Cutm@tcs2023");

            List <WebElement> loginButton = driver.findElements(By.xpath("//div[@class=\"x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1\"]"));
            loginButton.get(0).click();

            //div[@class="x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1"]




//            WebElement btnElement_xPath=driver.findElement(By.xpath("//a[@href=\"./profile.php#login\"]"));

            Thread.sleep(3000);
            driver.quit();
            





        }
    }


