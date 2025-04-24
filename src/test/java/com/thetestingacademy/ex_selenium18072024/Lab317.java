package com.thetestingacademy.ex_selenium18072024;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Lab317 {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }


    @Test
    public void testEbayPrint() {
        driver.navigate().to("https://www.ebay.com/");
        driver.manage().window().maximize();
        WebElement searchParameter = driver.findElement(By.cssSelector("[id=\"gh-ac\"]"));
        searchParameter.sendKeys("macmini");

        WebElement buttonSearch = driver.findElement(By.cssSelector("[value=\"Search\"]"));
        buttonSearch.click();



        List<WebElement> searchTitles=driver.findElements(By.cssSelector(" [class=\"s-item__title\"]"));
        List<WebElement> searchTitlesPrice=driver.findElements(By.cssSelector(" [class=\"s-item__price\"]"));

       int size =Math.min(searchTitles.size(),searchTitlesPrice.size());

        for(int i=0;i<size;i++){
            System.out.println("Title:" + searchTitles.get(i).getText()+"||"+"Price :"+ searchTitlesPrice.get(i).getText());
            System.out.println();


        }


//        for(WebElement title: searchTitles){
//            System.out.println(title.getText());
//
//        }

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