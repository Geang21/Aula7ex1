package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Impressora {

    private List<Imprimivel> imprimeveis = new ArrayList<>();

    public Impressora(){

    }

    public List<Imprimivel> getImprimeveis() {
        return imprimeveis;
    }

    public void setImprimeveis(List<Imprimivel> imprimeveis) {
        this.imprimeveis = imprimeveis;
    }

    public void imprimirTudo(){
        for(int i = 0; i < imprimeveis.size();i++){
            imprimeveis.get(i).imprimir();
        }
    }

    public void adicionarImprimivel(Imprimivel umImprimivel){
        imprimeveis.add(umImprimivel);
    }

}
