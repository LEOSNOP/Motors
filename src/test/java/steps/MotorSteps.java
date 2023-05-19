package steps;

import basePages.BaseStep;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pageObjects.MotorPage;

import static entidades.TimeSleep.timesleep;

public class MotorSteps extends BaseStep {

    MotorPage b = new MotorPage(MotorSteps.driver);


    @Dado("^que o usuario acessa a pagina da webMotors$")
    public void queOUsuarioAcessaAPaginaDaWebMotors() throws Throwable {
        b.abrindo_pagina();
        timesleep(3000);
        Assert.assertTrue(b.verif_pagina());
        timesleep(3000);
        BaseStep.Screenshot("verificando Pagina");
        timesleep(3000);
    }

    @Quando("^o usuario faz a busca por \"([^\"]*)\"$")
    public void oUsuarioFazABuscaPor(String marca) throws Throwable {
        b.busca_marca(marca);
        timesleep(4000);


    }

    @Entao("^verifica o resultado da busca pela marca$")
    public void verificaOResultadoDaBuscaPelaMarca() throws Throwable {
        Assert.assertTrue(b.verif_busca());
        timesleep(3000);
    }

    @Quando("^o usuario faz a busca pelo \"([^\"]*)\"$")
    public void oUsuarioFazABuscaPelo(String modelo) throws Throwable {
        b.busca_Mod_ver(modelo);
        timesleep(3000);

    }

    @Entao("^verifica o resultado da busca pelo modelo$")
    public void verificaOResultadoDaBuscaPeloModelo() throws Throwable {
        Assert.assertTrue(b.verif_busca());
        timesleep(3000);
    }

    @Quando("^o usuario faz a busca pela \"([^\"]*)\"$")
    public void oUsuarioFazABuscaPela(String versao) throws Throwable {
        b.busca_Mod_ver(versao);
        timesleep(3000);
    }

    @Entao("^verifica o resultado da busca pela versao$")
    public void verificaOResultadoDaBuscaPelaVersao() throws Throwable {
        Assert.assertTrue(b.verif_busca());
        timesleep(3000);
    }

    @Quando("^o usuario faz busca \"([^\"]*)\"$")
    public void oUsuarioFazBusca(String Vazia) throws Throwable {
        b.busca_marca(Vazia);
        timesleep(3000);
    }

    @Entao("^o sistema permanece na pagina$")
    public void oSistemaPermaneceNaPagina() throws Throwable {
        Assert.assertTrue(b.verif_b_vazia());
        timesleep(3000);
        Assert.assertTrue(b.verif_pagina());
        timesleep(3000);
    }

}
