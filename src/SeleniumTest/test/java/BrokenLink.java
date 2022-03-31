import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class BrokenLink {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe"); //chrome webdrive yüklediğim adres.

        WebDriver driver = new ChromeDriver();               //webdrive oluşturdum.
        driver.get("https://demoqa.com/broken"); //driverın açacağı adresi girdim.
        driver.manage().window().maximize();                 //açılan pencereyi tam ekran yaptık.

        HttpClient client = HttpClientBuilder.create().build();//http bir yapı oluşturduk
        HttpGet requestBroken = new HttpGet("https://the-internet.herokuapp.com/status_codes/500");//gidiceğimiz linke istek yolladık
        HttpGet request = new HttpGet("https://demoqa.com/"); //gidiceğimiz linke istek yolladık
        HttpResponse responseBroken =client.execute(requestBroken); //verilen istege göre bir cevao aldık
        HttpResponse response =client.execute(request);  //verilen istege göre bir cevao aldık
        int statüscodBroken = responseBroken.getStatusLine().getStatusCode();//cevabın statüscod unu aldık
        int statüscod = response.getStatusLine().getStatusCode();//cevabın statüscod unu aldık
        System.out.println(statüscodBroken);
        System.out.println(statüscod);


    }




}
