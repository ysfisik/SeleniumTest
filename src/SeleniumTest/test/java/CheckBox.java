import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");//chrome webdrive yüklediğim adres.

        WebDriver driver = new ChromeDriver();//webdrive oluşturdum.
        driver.get("https://demoqa.com/checkbox");//driverın açacağı adresi girdim.
        driver.manage().window().maximize();//açılan pencereyi tam ekran yaptık.

        //not: # bu işaretten sonra id ismini yazarsak sadece id ler içinde arama yapar
        //not: adresi alırken üst satırdan birini yazdıktan sonra alt satırına geçince bosluk bıraktıktan sonra yazarız
        WebElement homeCheckBox = driver.findElement(new By.ByCssSelector(".rct-checkbox svg"));//adresi bulur
        homeCheckBox.click();//tıklama komutu

        //tıklandıktan sonra içerisi değiştiği için tekrar adresi buluyoruz.
        homeCheckBox = driver.findElement(new By.ByCssSelector(".rct-checkbox svg"));

        // getAttribute komutu içerdeki Attribute'leri yani tanımlanan özellikler içindeki verileri String olarak almamıza yarar.
        String homeCheckBoxClassName = homeCheckBox.getAttribute("class");

        //class içinden alınan isimle gerçekteki isim aynımı kontrol ediliyor.
        if (homeCheckBoxClassName.equals("rct-icon rct-icon-check"))
        {
            System.out.println("CheckBox tıklandı");
        } else {

            System.out.println("CheckBox tıklanmadı");
        }

    }
}



