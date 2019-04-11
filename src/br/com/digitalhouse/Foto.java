package br.com.digitalhouse;

public class Foto implements Imprimivel {

    private String nomeFoto;
    private String tipoFoto;

    public Foto(){

    }

    public Foto (String novaFoto, String novoTipoFoto) {
        nomeFoto = novaFoto;
        tipoFoto = novoTipoFoto;
    }

    public String getNomeFoto() {
        return nomeFoto;
    }

    public void setNomeFoto(String nomeFoto) {
        this.nomeFoto = nomeFoto;
    }

    public String getTipoFoto() {
        return tipoFoto;
    }

    public void setTipoFoto(String tipoFoto) {
        this.tipoFoto = tipoFoto;
    }


    @Override
    public void imprimir() {
        System.out.println("Sou uma Self " + getNomeFoto() +  getTipoFoto());
    }
}
