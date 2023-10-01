package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05 {
    /*
 1-Driver oluşturalim
 2-Java class'imiza chnomedriver. exetyi tanitalim
 3-Driver'in tum ekranı kaplamasini saglayalim
 4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim.
  Eger oncesinde sqyfa Yüklenirse, beklemeyi bıraksın.
 5-Navigate to http://www.babayigit.net/murat/testpage.html
 6-first name, surname, age, Your Job, Birth Palace, Last graduated school, Number of Children
     alanlarına gerekli bilgileri yazsın
 7-Submit tuşuna bassın.
 8- All information was entered correctly.. yazısının göründüğünü test etsin ve yazan yazıyı yazdırsın
 9- Clear butonu ile tüm alanları temizlesin
 10- Manuel olarak temizlendiğini görecek kadar beklesin
 11- Sayfayı kapatsın

  */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.drive","kurulumDosyalari/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10809));
        driver.get("http://www.babayigit.net/murat/testpage.html");
        driver.findElement(By.id("ad")).sendKeys("Gulsah");
        driver.findElement(By.name("soyad")).sendKeys("Ozkan");
        driver.findElement(By.xpath("//*[@id=\"yas\"]")).sendKeys("26");
        driver.findElement(By.xpath("//input[@id='meslek']")).sendKeys("tester");
        driver.findElement(By.name("dogum_yeri")).sendKeys("Adana");
        driver.findElement(By.name("mezun_okul")).sendKeys("Moskova Devlet Uniuversitesi");
        driver.findElement(By.name("cocuk_sayisi")).sendKeys("2");
        driver.findElement(By.xpath("input[@value='Submit']")).click();












Thread.sleep(5000);
driver.close();

    }


}
