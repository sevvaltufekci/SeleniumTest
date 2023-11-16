package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class C07_ByClassNameLocator {
    public static void main(String[] args) throws InterruptedException {
        //testotomasyonu.com sayfasına gidin.

        //arama kutusuna phone yazip aratın

        //arama yapıldıktan sonra , sol tarafta çıkan Categories menüsündeki
        //kategori sayısının 8 oldugunu test edin.

        //kategorileri yazdırın.

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //testotomasyonu.com sayfasına gidin.
        driver.get("https://www.testotomasyonu.com");

        //arama kutusuna phone yazip aratın.
        WebElement aramaKutusu=driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone");
        //aramaKutusu.sendKeys("phone"+Keys.ENTER); submit seçeneği yerine ikinci yöntem olarak kullanılabilir.
        aramaKutusu.submit();

        //arama yapıldıktan sonra , sol tarafta çıkan Categories menüsündeki
        //kategori sayısının 8 oldugunu test edin.
        int expectedKategoriSayisi=8;

        List<WebElement>kategoriElementleriList =driver.findElements(By.className("acc-head"));
        int actualKategoriSayisi=kategoriElementleriList.size();

        if (expectedKategoriSayisi==actualKategoriSayisi){
            System.out.println("Kategori Sayisi testi PASSED");
        }else {
            System.out.println("Kategori Testi FAILED");
            System.out.println("Actual Kategori Sayisi :"+actualKategoriSayisi);
        }
        //kategorileri yazdırın.
        //System.out.println(kategoriElementleriList);//böyle yazdırırsak referanslarını yazdırır. Web elementleri 
        //direk yazdıramıyoruz. 
        //System.out.println(kategoriElementleriList);
        
        //Bu list web elementlerden oluşmaktadır. 
        //Web elementler üzerindeki yaziyi direk yazdıramayız.
        //her bir web elementi ele alıp üzerindeki yazıyı yazdırmamız gerekir.

        /*
        Yazdirma işlemini bir for-each loop ile yapabiliriz.
        ama biz bu işlemi çok kullanacağımız için
        bir method oluşturup
        webelementlerden olusan listeyi
        stringlerden oluşan bir listeye çevirdik.
        for (WebElement each:kategoriElementleriList
             ) {
            System.out.println(each.getText());
        } //web elementlerle uğraşıcam, bizim oğlan bu web elementleri kategori elementler listesinden getirecek.
        //sonrada yazdıracağız.


         */

        System.out.println(ReusableMethods.stringListeDonustur(kategoriElementleriList));
        Thread.sleep(3000);
        driver.close();



    }
}
