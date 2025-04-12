package com.thetestingacademy.ex_selenium;

import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Lab304 {
    public static void main(String[] args) throws MalformedURLException {
        EdgeDriver driver =new EdgeDriver();
        driver.get("https://infosys.com");
        driver.navigate().to("https://facebook.com");
        driver.navigate().to(new URL("https://netflix.com"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
