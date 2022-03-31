import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicClick {

    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");//chrome webdrive yüklediğim adres.

        WebDriver driver = new ChromeDriver();//webdrive oluşturdum.
        driver.get("https://demoqa.com/buttons");//driverın açacağı adresi girdim.
        driver.manage().window().maximize();//açılan pencereyi tam ekran yaptık.

        // dynamicClick id nin her sayfa yenilendiğinde vaya farklı kosullarda değişmesidir.
        // dynamicClick bulmak için xpath kullanılır.elementleri bulmak için farklı yolları vardır
        //aşağıda //div[last()]/button yazılan yerde tüm divlerin içindeki son button u bul demek
        WebElement dynamicClick = driver.findElement(By.xpath("//div[last()]/button"));
        dynamicClick.click();



    }
}
