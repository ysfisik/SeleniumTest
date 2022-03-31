import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

    public static <loginbutton> void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");//chrome webdrive yüklediğim adres.

        WebDriver driver = new ChromeDriver();//webdrive oluşturdum.
        driver.get("https://demoqa.com/text-box");//driverın açacağı adresi girdim.
        driver.manage().window().maximize();//açılan pencereyi tam ekran yaptık.

        //  not : # bu işaretten sonra id ismini yazarsak sadece id ler içinde arama yapar

        WebElement fullNameText = driver.findElement(By.id("userName"));//tıklayacağımız yerin id sini girdim.
        fullNameText.click();//tıklama komutu
        fullNameText.sendKeys("Yusuf");//yazma komutu

        //tıklayacağımız yerin adresini girdim.eğer id başka yerde de varsa aşağıdaki yöntemi kullanırız.
        /*  .mr-sm-2[type='email']  => burada noktadan sonra clas ismini yazarsak clas ları bulur
          köşeli parantez içine o clasta bulunan özelliklerden birini yazar ve eşittir deriz özelliği yazınca
          aradğimız email type sadece orada varsa artık bunu aşağıdaki şekilde kullanabiliriz. */

        WebElement mailText = driver.findElement(new By.ByCssSelector(".mr-sm-2[type='email']"));
        mailText.click();//tıklama komutu
        mailText.sendKeys("yusuf.72@gmail.com");//yazma komutu



        WebElement currentAddress = driver.findElement(new By.ByCssSelector(".form-control[placeholder='Current Address']"));
        currentAddress.click();//tıklama komutu
        currentAddress.sendKeys("Ankara - Türkiye");//yazma komutu


        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));//tıklayacağımız yerin id sini girdim.
        permanentAddress.click();//tıklama komutu
        permanentAddress.sendKeys("Ankara - Türkiye");//yazma komutu

        ((JavascriptExecutor)driver).executeScript("scroll(0,300)");//sayfayı 300 piksel aşağı indirme komutu

        WebElement submitBotton = driver.findElement(new By.ByCssSelector("button.btn"));//tıklayacağımız yeri adresini girdim.
        submitBotton.click();//tıklama komutu


        // not: //div/p [@id='name']  çift //div yazınca tüm divleri bulur /p yapınca p leri bulur en son [@id='name'] id leri bulur.
        WebElement nameText = driver.findElement(By.xpath("//div/p [@id='name']"));
        String name = nameText.getText();//alınan yazıyı name değişkenine atadım
        System.out.println(name);//ekrana yazdırdım.


    }
}
