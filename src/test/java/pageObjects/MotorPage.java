package pageObjects;

import basePages.BasePage;
import elementos.MotorsElements;
import org.openqa.selenium.WebDriver;

import static entidades.TimeSleep.timesleep;

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


    public void busca_marca(String busca){
        driver.findElement(MotorsElements.busca_marca).sendKeys(busca);
        timesleep(3000);
        driver.findElement(MotorsElements.click_marca).click();
        timesleep(3000);
    }

    public boolean verif_busca(){
        driver.findElement(MotorsElements.verif_busca);
        timesleep(3000);
        driver.findElement(MotorsElements.click_item_da_lista).click();
        timesleep(3000);
        return true;
    }

    public void busca_Mod_ver(String busca){
        driver.findElement(MotorsElements.busca_marca).sendKeys(busca);
        timesleep(3000);
        driver.findElement(MotorsElements.click_Mod_Ver).click();
        timesleep(3000);
    }







}
