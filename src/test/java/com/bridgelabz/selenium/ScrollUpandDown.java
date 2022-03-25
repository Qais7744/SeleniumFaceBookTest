package com.bridgelabz.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUpandDown {

    @Test
    public void scrollUpandDown() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altamash\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://seleniumhq.org/download");
        //typecasting driver object to JavascriptExecutor interface type

        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 1; i < 10; i++) {
            //scroll down on the webpage
            js.executeScript("window.scrollBy(0, 1000)");
            Thread.sleep(3000);
        }

        for (int i = 1; i < 10; i++) {
            //scroll up on the webpage
            js.executeScript("window.scrollBy(0, -1000)");
            Thread.sleep(3000);
        }
    }
}
