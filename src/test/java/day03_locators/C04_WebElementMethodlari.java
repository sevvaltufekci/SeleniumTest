package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;

public class C04_WebElementMethodlari {
    public static void main(String[] args) throws InterruptedException {
       // Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

        // Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> linkElementleriList=driver.findElements(By.tagName("a"));
        int expectedLinkSayisi=147;
        int actualLinkSayisi=linkElementleriList.size();

        if (expectedLinkSayisi==actualLinkSayisi){
            System.out.println("Link sayisi testi Passed");
        }else {
            System.out.println("Link sayisi testi Faıled");
            System.out.println("actual link testi : "+actualLinkSayisi);

        }
        // Products linkine tiklayin
            driver.findElement(By.partialLinkText("Products")).click();
            Thread.sleep(2000);



        // special offer yazisinin gorundugunu test edin
            WebElement specialOfferElementi= driver.findElement(By.id("sale_image"));
            if (specialOfferElementi.isDisplayed()){
                System.out.println("Special Offer Testi PASSED");
            }else {
                System.out.println("Special Offer Testi FAILED");
            }



        // Sayfayi kapatin






    }
}