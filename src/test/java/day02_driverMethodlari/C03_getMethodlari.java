package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C03_getMethodlari {
    public static void main(String[] args) throws InterruptedException {

        /*
        Selenium 4.12 versiyonu ile
        kendi Webdriver'ını da olusturabiliyor.

        yani artık dışarıdan bir webdriver tanımlama MECBURİYETİ kalmadı.
        Ancak şirketlerin pek çoğu kendilerine özel olarak satın aldıkları webdriverları
        kullanabiliyor.

        Biz bu duruma alışmak için Selenium WebDriver yerine indirdiğimiz driver.exe dosyasını kullanmaya
        devam edeceğiz.

         */
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(1000);

        //System.out.println(driver.getPageSource());
        //bize web sayasının taglarını ve kodlarını getirdi.

        System.out.println(driver.getWindowHandle()); //0F7221D13A11E7BC8479CCC4523ECE63
        //windowhandle değeri: Selenium'un oluşturduğu her webdriver objesine verdiği uniq bir koddur.
        //biz bu değerleri birden fazla sayfa açılırsa sayfalar arasında geçiş yapmak için kullanacağız.


        System.out.println(driver.getWindowHandles()); //[2A8645B1833EC4136FDBC69F67A3AB9A]
        //Aktif webdriver objesinin açtığı tüm sayfaların window handle değerlerini getirir.
        //ileride detaylı göreceğiz.

        Thread.sleep(3000);//gerçek hayatta test yaparken bekleme süresi eklemeyiz.
        //şuan görüntülemek için yapıyoruz.
        driver.quit();

    }
}