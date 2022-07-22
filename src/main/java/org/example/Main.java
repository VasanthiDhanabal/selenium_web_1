package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! test 1");
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://google.com");
        try {
            Thread.sleep(1000);
            System.out.println("Wait time over");
        } catch (InterruptedException exception) {
            System.out.println("Thread is interrupted during sleep");
        }
        if (driver.getPageSource().contains("I'm Feeling Lucky")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        driver.quit();
    }
}