package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsElements {
    @Test
    public void linkTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altamash\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/link.html";
        driver.get(baseUrl);
        driver.findElement(By.linkText("click here")).click();
        System.out.println("title of page is: " + driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void partiallinkTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altamash\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/link.html";
        driver.get(baseUrl);
        driver.findElement(By.partialLinkText("click here")).click();
        System.out.println("title of page is: " + driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void registerPartialLinkTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altamash\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        driver.get(baseUrl);
        String theLinkText = driver.findElement(By
                                   .partialLinkText("egis"))
                                   .getText();
        System.out.println(theLinkText);
        theLinkText = driver.findElement(By
                            .partialLinkText("EGIS"))
                            .getText();
        System.out.println(theLinkText);
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void insideAndOutside() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altamash\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/block.html";
        driver.get(baseUrl);

        driver.findElement(By.partialLinkText("Inside")).click();
        System.out.println(driver.getTitle());
        driver.navigate().back();

        driver.findElement(By.partialLinkText("Outside")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
    }

}