import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SportCheckBok {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");//chrome webdrive yüklediğim adres.

        WebDriver driver = new ChromeDriver();//webdrive oluşturdum.
        driver.get("https://demoqa.com/automation-practice-form");//driverın açacağı adresi girdim.
        driver.manage().window().maximize();//açılan pencereyi tam ekran yaptık.

        //not: # bu işaretten sonra id ismini yazarsak sadece id ler içinde arama yapar
        //not: adresi alırken üst satırdan birini yazdıktan sonra alt satırına geçince bosluk bıraktıktan sonra yazarız
        WebElement sportCheckBox = driver.findElement(By.id("hobbies-checkbox-1"));//adresi bulur
        boolean isEnabled = sportCheckBox.isEnabled();//isEnabled tıklanabilirmi diye kontrol eder ve bize boolean değer döner
        System.out.println(isEnabled);//gelen cevabı ekrana yazdırdık true geldi yani tıklanabilir
        WebElement sportCheckBoxlabel = driver.findElement(new By.ByCssSelector("label[for='hob" +
                "bies-checkbox-1']"));//adresi bulur

        //not: try-catch metodunda önce try içindekini çalıştırır çalışmaz ve catch'deki' hatayı dönerse catch içindekini çalıştırır.
        //bunu yapma sebebimiz bazen butonu görmüyo bizde buton ve yazının bulunduğu kısmın adresiyle tıklarız.
        try {
            sportCheckBox.click();

        } catch (ElementClickInterceptedException e)//bu hatayı verirse aşağıdaki komutu çalıştır.
        {

            sportCheckBoxlabel.click();

        }
        boolean isSelected = sportCheckBox.isSelected();//tıklandımı diye kontrol ediyoruz boolean değer dönüyo.
        System.out.println(isSelected);//gelen cavabı ekrana yazdırdık.


    }
}