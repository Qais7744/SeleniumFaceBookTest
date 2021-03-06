package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyActime_UNandPassword_HeightandWidth {
    @Test
    public void verifyHeightAndWidth() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altamash\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        //find the username field
        WebElement unTB = driver.findElement(By.id("email"));
        //store the height of username
        int username_height = unTB.getSize().getHeight();
        //store the width of username
        int username_width = unTB.getSize().getWidth();

        System.out.println("Username-Height: " + username_height);
        System.out.println("Username-Width: " + username_width);

        //find the password field
        WebElement pwdTB = driver.findElement(By.name("pass"));
        //store the height of password
        int password_height = pwdTB.getSize().getHeight();
        //store the width of password
        int password_width = pwdTB.getSize().getWidth();

        System.out.println("Password-Height: " + password_height);
        System.out.println("password_width: " + password_width);

        //check the height and width of username and password fields are same
        if (username_height == password_height && username_width == password_width) {
            System.out.println("Username and password fields are aligned");
        } else {
            System.out.println("Username and password fields are NOT aligned");
        }
    }
}


