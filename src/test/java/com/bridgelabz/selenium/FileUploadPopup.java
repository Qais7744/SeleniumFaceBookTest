package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadPopup {

    @Test
    public void fileUploadPopup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altamash\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("C:\\Users\\Altamash\\OneDrive\\Desktop");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@ng-click=\"item.upload()\"]")).click();
        Thread.sleep(2000);
        driver.close();
    }

}
