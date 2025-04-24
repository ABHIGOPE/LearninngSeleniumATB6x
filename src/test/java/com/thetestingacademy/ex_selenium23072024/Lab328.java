package com.thetestingacademy.ex_selenium23072024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Lab328 {

    @Test
    public void testTable() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");

        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));

        List<WebElement> rows_table = table.findElements(By.tagName("tr"));

        System.out.println(rows_table.size());

        for(int i=0;i<rows_table.size();i++){
            List <WebElement> col= rows_table.get(i).findElements(By.tagName("td"));

            for (WebElement c:col){
                System.out.println(c.getText());            }
        }

        driver.quit();


    }
    }

