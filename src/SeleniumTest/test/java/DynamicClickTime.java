import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicClickTime {


    public static void examoleOne() {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe"); //chrome webdrive yüklediğim adres.

        WebDriver driver = new ChromeDriver();               //webdrive oluşturdum.
        driver.get("https://demoqa.com/dynamic-properties"); //driverın açacağı adresi girdim.
        driver.manage().window().maximize();                 //açılan pencereyi tam ekran yaptık.


        WebElement firstBotton = driver.findElement(By.id("enableAfter"));
        WebDriverWait wait = new WebDriverWait(driver, 5);   //max 5 sn bekle anlamına gelir.
        wait.until(ExpectedConditions.elementToBeClickable(firstBotton));  //button tıklanabilir olduğunda tıkla anlamına gelir.
        firstBotton.click();

    }

    public static void examoleTwo() {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe"); //chrome webdrive yüklediğim adres.

        WebDriver driver = new ChromeDriver();               //webdrive oluşturdum.
        driver.get("https://demoqa.com/dynamic-properties"); //driverın açacağı adresi girdim.
        driver.manage().window().maximize();                 //açılan pencereyi tam ekran yaptık.

        WebElement colarBotton = driver.findElement(By.id("colorChange"));
        String className = colarBotton.getAttribute("class");// attributeler içinden class olanı al
        System.out.println(className);

        WebDriverWait wait = new WebDriverWait(driver, 5);   //max 5 sn bekle anlamına gelir.

        //colarBotton elementindeki class attributü nün içndeki değer (mt-4 text-danger btn btn-primary) olana kadar bekle
        wait.until(ExpectedConditions.attributeContains(colarBotton, "class", "mt-4 text-danger btn btn-primary"));
        colarBotton.click();
        className = colarBotton.getAttribute("class");//attributü değiştiği için className i tekrar altım
        System.out.println(className);

    }
    public static void lastBotton () {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe"); //chrome webdrive yüklediğim adres.

        WebDriver driver = new ChromeDriver();               //webdrive oluşturdum.
        driver.get("https://demoqa.com/dynamic-properties"); //driverın açacağı adresi girdim.
        driver.manage().window().maximize();                 //açılan pencereyi tam ekran yaptık.

        WebElement lastBotton = driver.findElement(By.id("visibleAfter"));
        WebDriverWait wait = new WebDriverWait(driver, 5);   //max 5 sn bekle anlamına gelir.

        //  visibilityOfAllElementsLocatedBy  tüm elementler göründüğünde anlamına gelr.içine locater alır.
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("visibleAfter")));
        lastBotton.click();


    }


    public static void main(String[] args) {
        lastBotton();


    }
}
