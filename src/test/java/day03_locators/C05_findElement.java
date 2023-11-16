package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v117.overlay.model.LineStyle;

import java.time.Duration;
import java.util.List;

public class C05_findElement {
    public static void main(String[] args) {

        //gerekli ayarlamaları yapın.

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //testotomasyonu.com adresine gidin.
        driver.get("https://testotomasyonu.com");

        //shoes linkine tıklayın.
        driver.findElement(By.partialLinkText("hoes")).click();

        //cıkan ürünlerden 3.ürüne tıklayın.
        //3.ürünü ozel olarak locate edemiyorsak tüm ürünleri bir list'e atıp
        //sonra listedeki 3.ürünü seçebiliriz.

        List<WebElement> urunElementleriListesi=driver.findElements(By.className("prod-img"));

        //cıkan ürünlerden 3.ürüne tıklayın.
        urunElementleriListesi.get(2).click();
        WebElement urunDetaylariElementi=driver.findElement(By.className("prod-detail"));
        //System.out.println(urunDetaylariElementi.getText());
        String expectedIcerik="shoe";
        String actualDetaylar=urunDetaylariElementi.getText().toLowerCase();

        if (actualDetaylar.contains(expectedIcerik)){
            System.out.println("Urun detay testi PASSED");
        }else {
            System.out.println("Urun detay testi FAILED");
        }



        //ürün kısa açıklamalarında case sensitive olmadan shoe geçtiğini  test edin.











        
    }
}
