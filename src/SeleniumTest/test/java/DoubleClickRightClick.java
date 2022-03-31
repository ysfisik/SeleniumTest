import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickRightClick {

    public static void main(String[] args) {


        //   ÇİFT TIKLAMA

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");//chrome webdrive yüklediğim adres.

        WebDriver driver = new ChromeDriver();//webdrive oluşturdum.
        driver.get("https://demoqa.com/buttons");//driverın açacağı adresi girdim.
        driver.manage().window().maximize();//açılan pencereyi tam ekran yaptık.

        WebElement dobleClickBottom = driver.findElement(By.id("doubleClickBtn"));
        Actions action = new Actions(driver);//çift tklamak için actions class içindeki metodları kullanırız.
        action.doubleClick(dobleClickBottom).perform();//actions class içindeki doubleClick metodunu kullandık.

        WebElement DobleClickText = driver.findElement(By.id("doubleClickMessage"));
        String message = DobleClickText.getText();
        System.out.println(message);


        //   SAĞ TIKLAMA

        WebElement rightClickBottom = driver.findElement(By.id("rightClickBtn"));
        action.contextClick(rightClickBottom).perform();

        WebElement rightClicktext = driver.findElement(By.id("rightClickMessage"));
        String rightClickMessage = rightClicktext.getText();
        System.out.println(rightClickMessage);


    }
}
