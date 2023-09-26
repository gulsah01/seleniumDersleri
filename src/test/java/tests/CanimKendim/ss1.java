package tests.CanimKendim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ss1 {
    public static void main(String[] args) throws InterruptedException {
       //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> LinkListesi=driver.findElements(By.tagName("a"));
        int expectedLinkSayisi=147;
        int actualLinkSayisi= LinkListesi.size();
        if (expectedLinkSayisi==actualLinkSayisi){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
        //4- Products linkine tiklayin
        driver.findElement(By.partialLinkText("Products")).click();

        //5- special offer yazisinin gorundugunu test edin
        WebElement specialOfferYazisi=driver.findElement(By.id("sale_image"));
        if (specialOfferYazisi.isDisplayed()){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
        //6- Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();

    }
}
