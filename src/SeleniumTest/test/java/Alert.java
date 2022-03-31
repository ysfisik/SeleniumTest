import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Alert {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe"); //chrome webdrive yüklediğim adres.

        WebDriver driver = new ChromeDriver();               //webdrive oluşturdum.
        driver.get("https://demoqa.com/alerts");             //driverın açacağı adresi girdim.
        driver.manage().window().maximize();                 //açılan pencereyi tam ekran yaptık.

        WebElement alertButton = driver.findElement(By.id("alertButton"));  //adresi bulur
        alertButton.click();
        Thread.sleep(2000); //2 sn bekle
        driver.switchTo().alert().accept(); // açılan allerti kabul et

        //NOT: accept() yerine dismiss() yazarsak reddeder
        //NOT: accept() yerine getText() yazarsak allert içindeki yazıyı alır
        //NOT: accept() yerine sendKeys("yusuf") yazarsak allert içine yusuf yazar


    }
}
