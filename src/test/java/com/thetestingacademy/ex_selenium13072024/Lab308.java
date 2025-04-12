package com.thetestingacademy.ex_selenium13072024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Lab308 {
    public static void main(String[] args) throws InterruptedException {

        EdgeOptions options =new EdgeOptions();
//        options.addArguments("--Start-maximized");
//        Thread.sleep(3000);
        options.addArguments("--window-size=800,600");


        WebDriver driver =new EdgeDriver(options);
        driver.get("https://instagram.com");
        Thread.sleep(5000);
        driver.quit();
    }
}
