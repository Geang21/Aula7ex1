package br.com.digitalhouse;

public class Documento implements Imprimivel {

    private String nomeDocumento;
    private String tipoDeDocumento;

    public Documento() {

    }

    public Documento(String novoDocumento, String novoTipoDeDocumento) {
        nomeDocumento = novoDocumento;
        tipoDeDocumento = novoTipoDeDocumento;
    }

    public String getNomeDocumento() {
        return nomeDocumento;
    }

    public void setNomeDocumento(String nomeDocumento) {
        this.nomeDocumento = nomeDocumento;
    }

    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(String tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um documento do Word "+ getNomeDocumento() +getTipoDeDocumento());
    }
}
