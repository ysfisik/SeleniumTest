import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modal {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe"); //chrome webdrive yüklediğim adres.

        WebDriver driver = new ChromeDriver();               //webdrive oluşturdum.
        driver.get("https://demoqa.com/modal-dialogs");             //driverın açacağı adresi girdim.
        driver.manage().window().maximize();                 //açılan pencereyi tam ekran yaptık.

        WebElement smolModal = driver.findElement(By.id("showSmallModal"));
        smolModal.click();

        WebElement modalText = driver.findElement(By.cssSelector("div.modal-body"));
        System.out.println(modalText.getText());

        WebElement smolCloseClick = driver.findElement(By.id("closeSmallModal"));
        smolCloseClick.click();
    }
}
