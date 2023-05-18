package elementos;

import org.openqa.selenium.By;

public class MotorsElements {

    private static String url = "https://www.webmotors.com.br/";

    public static By verifpagina = By.cssSelector("a[href='https://www.webmotors.com.br/']");




    public static String getUrl() {
        return url;
    }
}
