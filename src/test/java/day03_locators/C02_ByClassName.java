package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassName {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://wwww.automationexercise.com");
        List<WebElement>kategoryElementleriList=driver.findElements(By.className("panel-title"));
        int expectedKategoriSayisi=3;
        int actualKategorySayisi=kategoryElementleriList.size();

        if (expectedKategoriSayisi==actualKategorySayisi){
            System.out.println("Kategori sayisi testi PASSED");
        }else {
            System.out.println("Kategori testi sayisi FAİLED");
        }
        //Yazdırabilmemiz için dönüştürmemiz lazım
        ReusableMethods.stringListeDonustur(kategoryElementleriList).;
        driver.close();


    }
}
