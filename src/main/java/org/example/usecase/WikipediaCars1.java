package org.example.usecase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.List;

public class WikipediaCars1 {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--no-sandbox");

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("cars wikipedia");
        Thread.sleep(1000);

        driver.findElement(By.name("btnK")).click();

        driver.findElement(By.xpath("//h3[contains(text(),'Car - Wikipedia')]")).click();

        driver.findElement(By.xpath("//a[@title='Carl Benz']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[contains(text(),'Printable version')]")).click();
        Thread.sleep(1000);

        driver.close();



        //driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Download Selenium");
            Thread.sleep(2000);
            //driver.findElement(By.xpath("//div[@class='CqAVzb lJ9FBc']/center/input[1]")).click();

           // List<WebElement> links = driver.findElements(By.xpath("//h3"));






    }
}
