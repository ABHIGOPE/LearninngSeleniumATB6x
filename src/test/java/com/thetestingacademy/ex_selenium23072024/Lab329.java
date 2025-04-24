package com.thetestingacademy.ex_selenium23072024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class Lab329 {
    @Test (groups="QA")
    @Description("TeST case DEscription")
    public void testFlipkartSearchSVG(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));
        search.sendKeys("macmini");

        List <WebElement>  svg=driver.findElements(By.xpath("//*[local-name()=\"svg\"]"));

        svg.get(0).click();
        try {
            Thread.sleep(Long.parseLong("3000"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();



    }
}
