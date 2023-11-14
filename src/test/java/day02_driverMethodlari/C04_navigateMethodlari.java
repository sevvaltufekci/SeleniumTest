package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class C04_navigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //testotomasyonu ana sayfaya gidin.
        driver.get("https://testotomasyonu.com");


        //title'ın otomasyon içerdiğini test edin.
        String expectedTitleIcerik="Otomasyon";
        String actualTitle= driver.getTitle();
        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("test otomasyonu title testi PASSED");
        }else{
            System.out.println("test otomasyonu title testi FAILED");
            }




        //Sonra WiseQuarter anasayfaya gidin.
        driver.navigate().to("https://www.wisequarter.com");

        //URL'in wisequarter içerdiğini test edin.
        String expectedUrlIcerik="wisequarter";
        String actualUrl= driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("wisequarter url testi PASSED");
        }else {
            System.out.println("wisequarter Url testi FAILED");
        }

        //tekrar testotomasyonu sayfasina dönün.
        driver.navigate().back();

        //URL'in otomasyon içerdiğini test edin.
        expectedUrlIcerik="otomasyon"; // daha önce tanımlama yaptığımızdan şimdi sadece değer atadık.
        actualUrl= driver.getCurrentUrl();// bunu yine driver dan aldık.
        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("testotomasyonu url testi PASSED");
        }else {
            System.out.println("testotomasyonu Url testi FAILED");
        }

        //sayfayı kapatın.

        Thread.sleep(2000);
        driver.quit();

    }
}
