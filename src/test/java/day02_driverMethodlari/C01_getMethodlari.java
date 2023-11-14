package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_getMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");//olmazsa olmaz, hep yazılacak
        //main method gibi System.setProperty
        WebDriver driver=new ChromeDriver(); //System.setProperty yazdıktan hemen sonra webdriver oluşturmak zorunlu.
        //bunu yazdıktan sonra hiçbir şey yapmazsak bile arka tarafta düzenleme yapıp bekliyor.
        driver.manage().window().maximize();
        //selenium'da da Java gibi birçok method vardır.

        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(3000);
        driver.get("https://www.wisequarter.com");
        Thread.sleep(3000);

        //driver.get("www.youtube.com");   //youtube gidemiyor, bu yüzden konsolda kırmızı uyarı verir.
        //seleniumda hata olduğunu yazıların kırmızı olduğundan değil, exit code 'dan anlarız. Java'dan farklı.
        //driver.get methodu "https:// yazilmadan çalışmaz.

        driver.get("https://youtube.com");


        Thread.sleep(10000);
        driver.close();
        driver.quit();

    }
}
