/*
 * Click nbfs://nbhost/ult.txt to change this license
 * Click nbfs://nbhost/ edit this template
 */
package controller;

import model.Iphone;

/**
 *
 * @author gusta
 */
public class IphoneController {

    Iphone celular;
    
    public IphoneController(String numTelefone, String dono, float preco, int memoria, String modelo) {
        this.celular = new Iphone(numTelefone, dono, preco, memoria, modelo);
    }
    
    public void toStringController() {
        System.out.println("\n" + celular.toString());
    }
    
    public void tocar(String nomeMusica) {
        this.celular.tocar(nomeMusica);
    }

    public void pausar() {
        this.celular.pausar();
    }

    public void selecionar(String nomeMusica) {
        this.celular.selecionar(nomeMusica);
    }

    public void ligar(String numTel) {
        this.celular.ligar(numTel);
    }

    public void atender() {
        this.celular.atender();
    }

    public void iniciarCorreioVoz() {
        this.celular.iniciarCorreioVoz();
    }

    public void exibirPagina(String url) {
        this.celular.exibirPagina(url);
    }

    public void adicionarNovaAba(String url) {
        this.celular.adicionarNovaAba(url);
    }

    public void atualizarPagina() {
        this.celular.atualizarPagina();
    }
    
}
