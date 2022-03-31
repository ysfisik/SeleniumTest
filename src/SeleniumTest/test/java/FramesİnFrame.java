import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesİnFrame {


    public static void main(String[] args) throws InterruptedException {


        //NOT: frame olduğu anlamak için element kısmına bakarız orda http yazıyosa framdir

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe"); //chrome webdrive yüklediğim adres.

        WebDriver driver = new ChromeDriver();               //webdrive oluşturdum.
        driver.get("https://demoqa.com/nestedframes");             //driverın açacağı adresi girdim.
        driver.manage().window().maximize();                 //açılan pencereyi tam ekran yaptık.

        Thread.sleep(5000);

        // frame içinde frame olsuğu için ilk olarak büyük framein elementlerden yerini bulduk
        WebElement frameBig = driver.findElement(new By.ByCssSelector("iframe[title='3rd party ad content']"));
        driver.switchTo().frame(frameBig); // frame girdik
        WebElement closeBottom = driver.findElement(By.id("cbb"));// X butonunun elemenlerden yerini bulduk
        closeBottom.click();



    }
}
