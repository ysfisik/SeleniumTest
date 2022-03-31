import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class TabOpen {

    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe"); //chrome webdrive yüklediğim adres.

        WebDriver driver = new ChromeDriver();               //webdrive oluşturdum.
        driver.get("https://demoqa.com/browser-windows");    //driverın açacağı adresi girdim.
        driver.manage().window().maximize();                 //açılan pencereyi tam ekran yaptık.

        WebElement tabButtom = driver.findElement(By.id("tabButton"));  //adresi bulur
        tabButtom.click();


        List<String> tabs = new ArrayList<>(driver.getWindowHandles()); //açılan pencereleri listeye attık
        driver.switchTo().window(tabs.get(1)); //listede 1 sıradaki sekmeye geç dedik
        System.out.println(driver.getCurrentUrl()); // suanda açık olan sekmenin url sini ekrana yazdırdık

        Thread.sleep(2000); //2 sn bekle

        driver.close(); // açık olan sekmeyi kapat



    }
}