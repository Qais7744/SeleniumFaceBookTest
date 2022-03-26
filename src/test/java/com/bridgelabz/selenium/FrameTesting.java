package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameTesting {

    @Test
    public void frameTesting() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altamash\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("file:C:\\Users\\Altamash\\IdeaProjects\\SeleniumFaceBookTest\\src\\main\\resources\\frame2.html");

        driver.findElement(By.id("t2")).sendKeys("12345");

        driver.switchTo().frame(0);
        driver.findElement(By.id("t1")).sendKeys("T1 text field");

        Thread.sleep(1000);

        driver.switchTo().defaultContent();

        driver.switchTo().frame("n2");
        driver.findElement(By.id("t3")).sendKeys("T3 text field");

        Thread.sleep(5000);

        driver.quit();
    }

}
