package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class selenium_ilkTest {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
       WebDriver driver =new ChromeDriver();
       driver.get("https://amazon.com");

    }
}
