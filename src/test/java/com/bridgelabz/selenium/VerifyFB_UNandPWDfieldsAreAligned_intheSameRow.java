package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyFB_UNandPWDfieldsAreAligned_intheSameRow {

    @Test
    public void verifyFBPageAligned() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altamash\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        WebElement unTB = driver.findElement(By.id("email"));

        // get the y-coordinate of username field
        int username_Ycordinate = unTB.getLocation().getY();

        System.out.println("Username_Ycordinate: " + username_Ycordinate);

        WebElement pwdTB = driver.findElement(By.name("pass"));

        // get the y-coordinate of password field
        int password_Ycordinate = pwdTB.getLocation().getY();

        System.out.println("password_Ycordinate: " + password_Ycordinate);

        //check whether the Y-coordinate of username and password field are same
        if (username_Ycordinate == password_Ycordinate) {
            System.out.println("Both username and password fields are displayed in the same row");
        } else {
            System.out.println("username and password fields are NOT aligned in the same row");
        }
    }

}
