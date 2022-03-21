package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelector {

    @Test
    public void Css() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altamash\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        /* CssSelector expression is use the ID attribute*/
        driver.findElement(By.cssSelector("#email")).sendKeys("altamashbagwan1@gmail.com");

        driver.findElement(By.cssSelector("#pass")).sendKeys("Qais@720");
        Thread.sleep(2000);

        /* CssSelector expression is use the Type attribute*/
        driver.findElement(By.cssSelector(" button[type=submit]")).click();
        Thread.sleep(3000);
        driver.close();
    }

}
