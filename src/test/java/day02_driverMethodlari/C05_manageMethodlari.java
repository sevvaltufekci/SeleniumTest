package day02_driverMethodlari;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_manageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        //artık bir testi başlatmadan önce aşağıda yer alan 4 satır fix olacak.
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /*
        Wait konusunu ileride daha detaylı anlatacağız implicitlyWait() sayfanın yüklenmesi ve/veya
        arayacağımız webelementelerini bulmak için dinamik olarak tanımlanmış maximum bekleme süresidir.

        Asıl amaç bekleme değil, görevi yapmaktır.

        Burada tanımlanan süre görevi yapmaya çabalayacağı maksimum süredir.
        Bu süre içerisinde görevi yapamazsa exception fırlatır.

         */

        System.out.println("ilk baştaki konum : " + driver.manage().window().getPosition());
        System.out.println("ilk baştaki size : " +  driver.manage().window().getSize());
        Thread.sleep(2000);

        driver.manage().window().maximize();

        System.out.println("maximize  konum : " + driver.manage().window().getPosition());
        System.out.println("maximize size : " +  driver.manage().window().getSize());
        Thread.sleep(2000);

        driver.manage().window().fullscreen();
        System.out.println("fullscreen  konum : " + driver.manage().window().getPosition());
        System.out.println("fullscreen size : " +  driver.manage().window().getSize());
        Thread.sleep(2000);

        //pencereyi başlangıç noktası (50,100) ve size'i (1000,700) yapın.
        driver.manage().window().setSize(new Dimension(1000,700));
        driver.manage().window().setPosition(new Point(50,100));
        System.out.println("özel  konum : " + driver.manage().window().getPosition());
        System.out.println("özel size : " +  driver.manage().window().getSize());

       /* özel  konum : (49, 100)
        özel size : (1003, 703)
        aradaki farklılık bilgisayarın çözünürlüğü ile ilgili.

        */

        System.out.println(driver.manage().window().getSize().getWidth());
        /*
        ilk baştaki konum : (9, 9)
        ilk baştaki size : (1051, 806)
        maximize  konum : (-8, -8)
        maximize size : (1552, 840)
        fullscreen  konum : (0, 0)
        fullscreen size : (1536, 864)
         */


        Thread.sleep(22000);
        driver.close();
        driver.quit();
    }

}
