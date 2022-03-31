import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {


        //NOT: frame olduğu anlamak için element kısmına bakarız orda http yazıyosa framdir

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe"); //chrome webdrive yüklediğim adres.

        WebDriver driver = new ChromeDriver();               //webdrive oluşturdum.
        driver.get("https://demoqa.com/frames");             //driverın açacağı adresi girdim.
        driver.manage().window().maximize();                 //açılan pencereyi tam ekran yaptık.

        driver.switchTo().frame("frame1");// id si frame1 olan frame içine gir
        WebElement frame = driver.findElement(By.id("sampleHeading"));  //frame içindeki yazının adresi
        System.out.println(frame.getText());   // içerdeki metini aldık

        driver.switchTo().parentFrame();  //ana frame geri dön demek

        driver.switchTo().frame(2);      //2.sıradaki frame içine gir
        WebElement frame2 = driver.findElement(By.id("sampleHeading"));  //frame içindeki yazının adresi
        System.out.println(frame2.getText()); // içerdeki metini aldık


    }
}