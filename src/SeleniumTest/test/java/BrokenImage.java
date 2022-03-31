import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class BrokenImage {

    public static void main(String[] args) throws IOException {

        //Not :  statüscod 200 geliyo normalde 500 gelmesi lazım sitenin kendi hastası kodumuz doğru çalışıyor.

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe"); //chrome webdrive yüklediğim adres.

        WebDriver driver = new ChromeDriver();               //webdrive oluşturdum.
        driver.get("https://demoqa.com/broken"); //driverın açacağı adresi girdim.
        driver.manage().window().maximize();                 //açılan pencereyi tam ekran yaptık.

        WebElement brokenImage = driver.findElement(By.xpath("//div/img[2]"));//adresi bulur

        String brokenImageUrl = brokenImage.getAttribute("src");//src Attribute iurl yi aldıkçindeki
        System.out.println(brokenImageUrl);
        HttpClient client = HttpClientBuilder.create().build();//http bir yapı oluşturduk
        HttpGet requestBrokenImage = new HttpGet(brokenImageUrl);//gidiceğimiz linke istek yolladık
        HttpResponse responseBrokenImage = client.execute(requestBrokenImage); //verilen istege göre bir cevao aldık
        int statüscodBrokenImage = responseBrokenImage.getStatusLine().getStatusCode();//cevabın statüscod unu aldık

        System.out.println(statüscodBrokenImage);




    }
}
