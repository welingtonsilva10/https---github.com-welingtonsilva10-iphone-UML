public class ReprodutorMusical {
    private String musicaAtual;
    private boolean estaTocando;

    public ReprodutorMusical() {
        this.musicaAtual = null;
        this.estaTocando = false;
    }

    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    public void tocarMusica() {
        if (musicaAtual != null) {
            estaTocando = true;
            System.out.println("Tocando: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    public void pausarMusica() {
        if (estaTocando) {
            estaTocando = false;
            System.out.println("Música pausada: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música está tocando.");
        }
    }

    public void exibirEstado() {
        if (musicaAtual == null) {
            System.out.println("Nenhuma música selecionada.");
        } else if (estaTocando) {
            System.out.println("Tocando: " + musicaAtual);
        } else {
            System.out.println("Música pausada: " + musicaAtual);
        }
    }

    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.selecionarMusica("Minha Música Favorita.mp3");
        reprodutor.tocarMusica();
        reprodutor.pausarMusica();
        reprodutor.exibirEstado();
    }
}

