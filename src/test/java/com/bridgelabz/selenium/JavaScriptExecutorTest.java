package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorTest {

    @Test
    public void enterText() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altamash\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("file:C:\\Users\\Altamash\\IdeaProjects\\SeleniumFaceBookTest\\src\\main\\resources\\test.html");

        driver.findElement(By.id("t1")).clear();

        Thread.sleep(1000);

        driver.findElement(By.id("t1")).sendKeys("Altamash");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.getElementById('t2').value=''");

        Thread.sleep(2000);
        js.executeScript("document.getElementById('t2').value='Bagwan'");

    }
}
