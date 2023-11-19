package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class C02_ilkTest {

    public static void main(String[] args) throws InterruptedException {


        //testotomasyonu ana sayfaya gidin.
        //url'in https://testotomasyonu.com içerdiğini
        //ve Title'ın test kelimesi içerdiğini test edin.

        //her test için mutlaka bir webdriver oluşturmalı
        // ve gerekli ayarlamaları yapmalıyız.

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //testotomasyonu anasayfaya gidin.
        // clena kod için her aşamaya ekleme yap!!!!
        driver.get("https://testotomasyonu.com/");
        //driver.get(\"https://testotomasyonu.com");ilk test girdimizdi.

        //url'in https://testotomasyonu.com içerdiğini
        String expectedUrl= "https://testotomasyonu.com/"; //beklenen,test için istenen URL girilir.
        String actualUrl= driver.getCurrentUrl(); //geçerli olan URL i bize getirecek.

        if (expectedUrl.equals(actualUrl)){
            System.out.println("URL testi PASSED");
        }else {
            System.out.println("URL testi FAİLED");
            System.out.println("Actual URL:" + actualUrl); //failed ise sebebini yazdirir.
            // URL testi FAİLED
            // Actual URL:https://testotomasyonu.com/
        }
            //ve Title'ın test kelimesi içerdiğini test edin.
            String expectedTitleIcerigi="test";
            String actualTitle= driver.getTitle();
            if (actualTitle.contains(expectedTitleIcerigi)){
                System.out.println("Title testi PASSED");
            } else {
                System.out.println("Title testi FAİLED");
                System.out.println("actual title:"+actualTitle);
                //URL testi PASSED
                //Title testi FAİLED
                //actual title:Otrixcommerce Website - Otrixcommerce
            }


            Thread.sleep(3000);
            driver.quit();
        }



    }

