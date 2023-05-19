package elementos;

import org.openqa.selenium.By;

public class MotorsElements {

    private static String url = "https://www.webmotors.com.br/";

    public static By verifpagina = By.cssSelector("a[href='https://www.webmotors.com.br/']");

    public static By busca_marca = By.cssSelector("input[placeholder='Digite marca ou modelo do carro']");

    public static By click_marca = By.cssSelector("a[href$='1704']");

    public static By verif_busca = By.cssSelector("div[data-qa='vehicle_card_8']");

    public static By click_item_da_lista = By.cssSelector("div[data-qa='vehicle_card_8']");

    public static By click_Mod_Ver = By.cssSelector("a[href$='1705']");

    public static By verif_busca_vazia = By.cssSelector("div[class='sc-dSuTWQ kVGRby']");



    public static String getUrl() {
        return url;
    }
}
