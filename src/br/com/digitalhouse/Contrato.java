package br.com.digitalhouse;

public class Contrato implements Imprimivel {

    private String nomeContrato;
    private String tipoContrato;

    public Contrato(){

    }

    public Contrato(String novoNome, String novoTipoContrato){
        nomeContrato = novoNome;
        tipoContrato = novoTipoContrato;
    }

    public String getNomeContrato() {
        return nomeContrato;
    }

    public void setNomeContrato(String nome) {
        this.nomeContrato = nome;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um contrato muito legal ! " + getNomeContrato() +getTipoContrato());
    }
}
