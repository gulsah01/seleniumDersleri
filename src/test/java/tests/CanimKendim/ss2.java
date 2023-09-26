package tests.CanimKendim;

import net.bytebuddy.asm.Advice;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ss2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1- https://www.amazon.com/ sayfasına gidin.
        2- Arama kutusuna “city bike” yazip aratin
        3- Görüntülenen sonuçların sayısını yazdırın
        4- Listeden ilk urunun resmine tıklayın.
        */
        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);
        Thread.sleep(3000);
        WebElement sonuc=driver.findElement(By.className("sg-col-inner"));
        System.out.println(sonuc.getText());
        Thread.sleep(3000);
        List<WebElement> urunListesi=driver.findElements(By.className("s-image"));
        urunListesi.get(1).click();
        Thread.sleep(3000);
        driver.close();
    }
}
