package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FaceBookTest {
    @Test
    public void test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altamash\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Altamash");
        driver.findElement(By.name("lastname")).sendKeys("Bagwan");
        driver.findElement(By.name("reg_email__")).sendKeys("altamashbagwan1@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("altamashbagwan1@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Altamash@77");
        driver.findElement(By.name("birthday_day")).sendKeys("26");
        driver.findElement(By.name("birthday_month")).sendKeys("April");
        driver.findElement(By.name("birthday_year")).sendKeys("1998");
        driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
        Thread.sleep(5000);
        driver.close();

    }

}
