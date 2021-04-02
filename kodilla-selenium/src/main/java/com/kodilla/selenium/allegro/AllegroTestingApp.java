package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AllegroTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");


        // Wait used to give a time for NOT A ROBOT check
        WebElement cookieButton = new WebDriverWait(driver, 10)
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.cssSelector("button[data-role=\"accept-consent\"]")));
        System.out.println(cookieButton.getText());
        cookieButton.click();

        WebElement optionElektronika = driver.findElement(By.cssSelector("option[value=\"/kategoria/elektronika\"]"));
        optionElektronika.click();

        WebElement inputField = driver.findElement(By.cssSelector("form[action=\"/listing\"] > div > input[type=\"search\"]"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section > article")));

        List<WebElement> elements = driver.findElements(By.cssSelector("section > article"));
        elements.forEach(p-> System.out.println(p.getText()));
    }
}