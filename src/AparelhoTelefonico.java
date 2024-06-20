public class AparelhoTelefonico {

    public void fazerLigacao(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atenderLigacao() {
        System.out.println("Ligação atendida.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    public static void main(String[] args) {
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.fazerLigacao("91456-7890");
        telefone.atenderLigacao();
        telefone.iniciarCorreioVoz();
    }
}
