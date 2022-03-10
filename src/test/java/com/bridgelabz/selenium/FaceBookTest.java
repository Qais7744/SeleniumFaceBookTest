package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;


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
        Thread.sleep(2000);

        driver.findElement(By.name("lastname")).sendKeys("Bagwan");
        Thread.sleep(2000);

        driver.findElement(By.name("reg_email__")).sendKeys("altamashbagwan1@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("altamashbagwan1@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.name("reg_passwd__")).sendKeys("Altamash@77");
        Thread.sleep(2000);

        driver.findElement(By.name("birthday_day")).sendKeys("26");
        Thread.sleep(2000);

        driver.findElement(By.name("birthday_month")).sendKeys("April");
        Thread.sleep(2000);

        driver.findElement(By.name("birthday_year")).sendKeys("1998");
        Thread.sleep(2000);
//        1st way
//        driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
//        2nd way
//        List<WebElement> gender = driver.findElements(By.name("sex"));
//        gender.get(1).click();
//        3rd way
        driver.findElements(By.name("sex")).get(2).click();
        Thread.sleep(2000);

        driver.findElement(By.name("preferred_pronoun")).sendKeys("He: Wish him a happy birthday!");
        Thread.sleep(2000);

        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(5000);
        driver.close();

    }

}
