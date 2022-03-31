import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class DownloadBottom {

    public static void main(String[] args) throws IOException, InterruptedException {

        //Not :  statüscod 200 geliyo normalde 500 gelmesi lazım sitenin kendi hastası kodumuz doğru çalışıyor.

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe"); //chrome webdrive yüklediğim adres.

        WebDriver driver = new ChromeDriver();               //webdrive oluşturdum.
        driver.get("https://demoqa.com/upload-download"); //driverın açacağı adresi girdim.
        driver.manage().window().maximize();                 //açılan pencereyi tam ekran yaptık.

        WebElement downloadBottom = driver.findElement(By.id("downloadButton"));//adresi bulur
        downloadBottom.click();
        String path = "C:/Users/yusuf/Downloads";//dosyanın pc indirildiği adresi aldık
        String fileName = "sampleFile.jpeg"; // inen dosyanın adını aldık
        Thread.sleep(2000); // 2 sn bekle dedik .  indirmesini beklemek için
        boolean durum = isFileDownload(path,fileName);// aşağıdaki isFileDownload metodunu çalıştırdık sonuç bolun gelcek
        System.out.println(durum);

    }

    public static boolean isFileDownload(String downloadPath , String fileName) {

        File file = new File(downloadPath);// file metodu downloadPath değerini alıyor
        File[] files = file.listFiles(); // files dizisi oluşturduk listFiles daki dosyaları içine attık

        for (int i=0 ; i <files.length;i++){   // listedeki tüm elemanları döngüye soktuk

            if (files[i].getName().equals(fileName)){ //inen dosyanın adı dizinin içinde varmı kontrolu yaptık

                files[i].delete(); //dosya varsa  yani inmişse sil dedik
                return true; //  sonuç true olarak dönsün dedik
            }
        }

        return false; // if içine girmezse yani dosya yoksa false dönsün dedik.
    }

}
