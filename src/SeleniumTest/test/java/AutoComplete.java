import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoComplete {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe"); //chrome webdrive yüklediğim adres.

        WebDriver driver = new ChromeDriver();               //webdrive oluşturdum.
        driver.get("https://demoqa.com/auto-complete");             //driverın açacağı adresi girdim.
        driver.manage().window().maximize();                 //açılan pencereyi tam ekran yaptık.

        WebElement input = driver.findElement(By.id("autoCompleteSingleInput"));
        input.sendKeys("R");

        List<WebElement> suggestions =driver.findElements(new By.ByCssSelector("div.auto-complete__option"));

        for (WebElement suggestion : suggestions ){

            String text = suggestion.getText();
            System.out.println(text);

            if (text.toLowerCase().contains("r")) {

                System.out.println(text + " = r harfi var");

            }
            suggestions.get(0).click();
            break;
        }
    }
}
