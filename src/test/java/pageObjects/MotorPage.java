package pageObjects;

import basePages.BasePage;
import elementos.MotorsElements;
import org.openqa.selenium.WebDriver;

public class MotorPage extends BasePage {

    public MotorPage(WebDriver d) {
        super(d);
    }


    public void abrindo_pagina(){
    driver.get(MotorsElements.getUrl());
    }

    public boolean verif_pagina(){
        driver.findElement(MotorsElements.verifpagina);
        return true;
    }







}
