package com.bridgelabz.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

    public class BrowserNavigation {
        @Test
        public void navigation() throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altamash\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://www.facebook.com/");
            Thread.sleep(2000);

            driver.navigate().to("https://www.amazon.com/");
            Thread.sleep(2000);

            driver.navigate().back();
            Thread.sleep(3000);
            driver.close();
        }

    }
    
