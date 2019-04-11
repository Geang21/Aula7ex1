package br.com.digitalhouse;

public class Principal {
    public static void main(String[] args) {

        Contrato contrato1 = new Contrato();

        contrato1.setNomeContrato("Venda");
        contrato1.setTipoContrato(" Maroto");

        Foto foto1 = new Foto();

        foto1.setNomeFoto("primeira foto");
        foto1.setTipoFoto(".JPG");

        Documento documento1 = new Documento();

        documento1.setNomeDocumento("Documento Medico");
        documento1.setTipoDeDocumento(".docx");

        Impressora impressora1 = new Impressora();

        impressora1.adicionarImprimivel(contrato1);
        impressora1.adicionarImprimivel(foto1);
        impressora1.adicionarImprimivel(documento1);

        impressora1.imprimirTudo();
    }
}
