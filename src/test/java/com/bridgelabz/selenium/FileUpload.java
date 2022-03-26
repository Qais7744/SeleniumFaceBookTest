package com.bridgelabz.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {

    @Test
    public void FileDownload() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altamash\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
        Thread.sleep(2000);

    }
}
