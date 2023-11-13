package day01_seleniumIlkOtomasyon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverOlusturma {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        //bu satır olusturacağımız webdriver'ın özelliklerini set ediyor.
        //webdriver otomasyon sırasında bizim her şeyimizdir. :)

        //web driver objesi oluşturmak için;
        WebDriver driver=new ChromeDriver();
        // Webdriver interface bu yüzden obje oluşturalamaz bu yüzden ChromeDrriver deriz.

        //bir web sayfasına gitmek istersek;
        driver.get("https://www.testotomasyonu.com");
        driver.manage().window().maximize(); // tam sayfa çalışması için

        Thread.sleep(15000); //(15 sn.) sayfayı açıp biraz beklesin istiyorsak, excep. uyarısı verir.
        //uyarıyı kabul edince yukarıya throws gönderdi. main method içinde.

        //açtığı browserı kapatması için;
        driver.close();
        driver.quit();
    }
}
