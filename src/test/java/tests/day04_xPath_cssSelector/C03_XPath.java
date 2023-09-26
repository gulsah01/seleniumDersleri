package tests.day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_XPath {
    public static void main(String[] args) {
        //2- https://www.amazon.com/ adresine gidin
        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/ ");
       // 3- Browseri tam sayfa yapin
       // 4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
       // 5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedIcerik="Spend less";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedIcerik)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
      //  6- Gift Cards sekmesine basin
        driver.findElement(By.linkText("Gift Cards")).click();
       // 7- Birthday butonuna basin

       // 8- Best Seller bolumunden ilk urunu tiklayin
       // 9- Gift card details’den 25 $’i secin
        //10-Urun ucretinin 25$ oldugunu test edin
       // 11-Sayfayi kapatin
        driver.close();
    }
}
