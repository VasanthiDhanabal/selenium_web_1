package org.example.react;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class ReactTest1 {
    ///html/body/div/div/header/a

    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://localhost:3000/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        String EXPECTED_STRING = "Testing react with automation";
        String actualResult = driver.findElement(By.xpath("/html/body/div/div/header/a")).getText();
        if (EXPECTED_STRING.equals(actualResult)) {
            System.out.println("Test Succeded");
        } else {
            System.out.println("Test failed");
        }
        driver.close();
    }
}
