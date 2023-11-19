package day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.NoSuchElementException;

public class C01_xpath {
    public static void main(String[] args) {
        //https://testotomasyonu.com/addremove/ adresine gidin.
        //add element butonuna basın.
        //delete butonu'nun görünür olduğunu test edin.
        //delete tuşuna basın.
        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin.

        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1- https://testotomasyonu.com/addremove/ adresine gidin
        driver.get("https://testotomasyonu.com/addremove/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@id='sub-btn']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement removeButonu = driver.findElement(By.xpath("//*[@class='remove-btn']"));

        if (removeButonu.isDisplayed()){
            System.out.println("Remove butonu gorunme testi PASSED");
        }else System.out.println("Remove butonu gorunme testi FAILED");

        //4- Delete tusuna basin

        driver.findElement(By.xpath("//button[@class='remove-btn']")).click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement addRemoveYaziElementi = driver.findElement(By.xpath("//*[@class='container']"));

        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("Add Remove Yazisi gorunme testi PASSED");
        }else System.out.println("Add Remove Yazisi gorunme testi FAILED");

        // Remove butonunun gorunur olmadigini test edin

        try {
            removeButonu = driver.findElement(By.xpath("//*[@class='remove-btn']"));
            System.out.println("Remove butonu gorunmeme testi FAILED");
        } catch (NoSuchElementException e) {
            System.out.println("Remove butonu gorunmeme testi PASSED");
        }

        driver.quit();

    }

}
