package tests.day04_xPath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_XPath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
          //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);
       // 2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@*='addElement()']")).click();

      //  3- Delete butonu’nun gorunur oldugunu test edin

       // 4- Delete tusuna basin

      //  5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
driver.close();
    }
}
