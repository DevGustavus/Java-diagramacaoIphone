/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivate Stringdefault.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gusta
 */
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorWeb {
    
    private String numTelefone;
    private String dono;
    private float preco;
    private int memoria;
    private String modelo;

    //CONSTRUCTOR
    public Iphone(String numTelefone, String dono, float preco, int memoria, String modelo) {
        this.numTelefone = numTelefone;
        this.dono = dono;
        this.preco = preco;
        this.memoria = memoria;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Iphone{" + "numTelefone=" + numTelefone + ", dono=" + dono + ", preco=" + preco + ", memoria=" + memoria + ", modelo=" + modelo + '}';
    }

    //GETTERS
    public String getNumTelefone() {
        return numTelefone;
    }

    public String getDono() {
        return dono;
    }

    public float getPreco() {
        return preco;
    }

    public int getMemoria() {
        return memoria;
    }

    public String getModelo() {
        return modelo;
    }

    //SETTERS
    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    //METHODS
    @Override
    public void tocar(String nomeMusica) {
        System.out.println("Tocando musica: " + nomeMusica);
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada.");
    }

    @Override
    public void selecionar(String nomeMusica) {
        System.out.println(nomeMusica + " selecionada.");
    }

    @Override
    public void ligar(String numTel) {
        System.out.println("Ligando para: " + numTel);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Enviando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina WEB: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }
    
}
