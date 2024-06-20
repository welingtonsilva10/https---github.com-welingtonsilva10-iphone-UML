public class Main {
    public static void main(String[] args) {
        AparelhoTelefonico telefone = new AparelhoTelefonico();

        fazerLigacao(telefone, "92654-7890");
        atenderLigacao(telefone);
        iniciarCorreioVoz(telefone);

        NavegadorInternet navegador = new NavegadorInternet();
        abrirPagina(navegador, "https://www.teste.com");
        adicionarAba(navegador, "https://www.google.com");
        adicionarAba(navegador, "https://www.github.com");
        atualizarPagina(navegador);
        navegador.exibirAbas();

        ReprodutorMusical reprodutor = new ReprodutorMusical();
        selecionarMusica(reprodutor, "Minha Música Favorita.mp3");
        tocarMusica(reprodutor);
        pausarMusica(reprodutor);
        reprodutor.exibirEstado();
    }


    public static void fazerLigacao(AparelhoTelefonico telefone, String numero) {
        telefone.fazerLigacao(numero);
    }

    public static void atenderLigacao(AparelhoTelefonico telefone) {
        telefone.atenderLigacao();
    }

    public static void iniciarCorreioVoz(AparelhoTelefonico telefone) {
        telefone.iniciarCorreioVoz();
    }

    public static void abrirPagina(NavegadorInternet navegador, String url) {
        navegador.abrirPagina(url);
    }

    public static void adicionarAba(NavegadorInternet navegador, String url) {
        navegador.adicionarAba(url);
    }

    public static void atualizarPagina(NavegadorInternet navegador) {
        navegador.atualizarPagina();
    }

    public static void selecionarMusica(ReprodutorMusical reprodutor, String musica) {
        reprodutor.selecionarMusica(musica);
    }

    public static void tocarMusica(ReprodutorMusical reprodutor) {
        reprodutor.tocarMusica();
    }

    public static void pausarMusica(ReprodutorMusical reprodutor) {
        reprodutor.pausarMusica();
    }
}
