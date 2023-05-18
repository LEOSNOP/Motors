package basePages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class BaseStep {

    public static WebDriver driver;

    public static void abrindo_nav()throws Throwable{

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    public static void saindo_nav ()throws Throwable{
        driver.quit();
    }

    public static void Screenshot(String nome){
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(file, new File("target/screenshots/"+nome+".jpg"));
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
