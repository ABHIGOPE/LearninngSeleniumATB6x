package com.thetestingacademy.ex_selenium23072024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Lab330 {
    @Test

    public void testSVGMap(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        driver.manage().window().maximize();



        List<WebElement> statesSVG=driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));

        for(WebElement stateName: statesSVG){
            System.out.println(stateName.getAttribute("aria-label"));
            if(stateName.getAttribute("aria-label").contains("Tripura")){
                stateName.click();
            }
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }

    }

