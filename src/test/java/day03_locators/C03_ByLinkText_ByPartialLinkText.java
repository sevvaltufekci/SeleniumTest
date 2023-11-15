package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ByLinkText_ByPartialLinkText {
    //gerekli ayarlamaları yapın.
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    //testotomasyonu.com anasayfaya gidin.
        driver.get("https://www.testotomasyonu.com");

    //shoes Linkine tıklayın.
        driver.findElement(By.linkText("Shoes")).click(); //linki bulup click yapacak.


    //açılan sayfada Title'in shoes içerdiğini test edin.
        String expectedTitleIcerik="shoes";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Shoes testi Passed");
        }else {
            System.out.println("Shoes testi Failed");
        }
       driver.quit();
}

}
