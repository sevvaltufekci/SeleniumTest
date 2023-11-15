package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_ByClassNameLocator {
    public static void main(String[] args) {
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
        aramaKutusu.submit();






    }
}
