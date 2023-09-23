package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_IlkTestOtomasyonu {
    public static void main(String[] args) throws InterruptedException {

// amazon anasayfaya gidin
        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
// arama kutusuna "Nutella" yazdirip aratin
        // once araa kutusunu findElement() ve locator ile drivera tanitip
        // o webelementi bu class da kullanabilecegim sekilde kaydetmeliyim
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu  = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();

// arama sonuclarinin "Nutella" icerdigini test edin
        // By.className locatori class attribute nin degeri bosluk icerdiginde
        // saglikli calismaz.
        // Cogunlukla class ismi ayni ozelliklerdeki webelementleri gruplandirmak icin kullanilir
        //Biz de class degeri "sg-col-inner" arattigimizda 73 tane webelement buldu

       // WebElement aramaSonucElementi =driver.findElement(By.className("sg-col-inner"));

        List<WebElement> elementlerListesi = driver.findElements(By.className("sg-col-inner"));
        String actualAramaSonucu = elementlerListesi.get(0).getText();
        String expectedIcerik = "Nutella";
        if (actualAramaSonucu.contains("Nutella")){
            System.out.println("Ilk otomasyon testi PASSED");
        }else{
            System.out.println("Ilk otomasyon testi FAILED");
        }


       driver.close();

    }

}
