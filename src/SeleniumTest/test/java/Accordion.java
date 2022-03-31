import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accordion {

    public static void main(String[] args) throws InterruptedException {



        //NOT: clas ismi değişkenlik gösteriyor açılmadan önce açılırken ve açık halde farklı clas ismi var
        //test yaparken açık veya kapalı kontrolü burdan yapılabilir.

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe"); //chrome webdrive yüklediğim adres.

        WebDriver driver = new ChromeDriver();               //webdrive oluşturdum.
        driver.get("https://demoqa.com/accordian");             //driverın açacağı adresi girdim.
        driver.manage().window().maximize();                 //açılan pencereyi tam ekran yaptık.

        WebElement open = driver.findElement(By.xpath("//div[@class='card'][1]/div[2]"));
        String className = open.getAttribute("class");
        System.out.println(className);

        WebElement close = driver.findElement(By.id("section1Heading"));
        close.click();
        className = open.getAttribute("class");
        System.out.println(className);

        Thread.sleep(5000);

        className = open.getAttribute("class");
        System.out.println(className);



    }




}
