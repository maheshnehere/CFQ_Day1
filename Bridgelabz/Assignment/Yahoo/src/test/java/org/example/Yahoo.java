package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {
    WebDriver driver;

    @Test
    public void yahooResistration(){
        driver = new ChromeDriver();

        driver.get("https://login.yahoo.com/account/create?.intl=us&specId=yidReg");

        driver.manage().window().maximize();


        driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]")).sendKeys();


    }
}
