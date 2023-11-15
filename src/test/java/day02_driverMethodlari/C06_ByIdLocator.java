package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_ByIdLocator {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chorem.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        //testotomasyonu.com adresine gidin.
        driver.get("https://www.testotomasyonu.com");

        //arama kutusuna phone yazip arattırın.
        //bir web elementi kullanmak istiyorsak
        //öncelikle drivera o elementi buldurup
        //kullanabileceğimiz bir obje olarak kaydetmeliyiz.

       WebElement aramaKutusu = driver.findElement(By.id("global-search")); //kaydetmek için
        //driver gidip ıd'si global search olanı bulup gelip kaydediyor.

        aramaKutusu.sendKeys("phone"); //arama kutusuna gidip phone yazar.
        aramaKutusu.submit(); //enterlama - phone sonuçlarını verir.

        //bulunun sonuç sayısını yazdırın.
        WebElement sonucYaziElementi=driver.findElement(By.className("product-count-text"));
        //System.out.println(sonucYaziElementi);
        //web elementler direk yazdirilamaz. Eğer webelement üzerindeki yaziyi elde etmek istersek
        System.out.println(sonucYaziElementi.getText());

        //arama sonucunda urun bulunabildiğini test edin.
        String sonucSayisiStr=sonucYaziElementi.getText().replaceAll("\\D","");
        //web elem. dizisinde sayı olmayan her şeyi yok ettik.
        int sonucSayisiInt=Integer.parseInt(sonucSayisiStr);
        if (sonucSayisiInt>0 ){
            System.out.println("Arama testi PASSED");
        }else {
            System.out.println("Arama testi FAILED");
        }



        Thread.sleep(10000);
        driver.quit();

    }
}
