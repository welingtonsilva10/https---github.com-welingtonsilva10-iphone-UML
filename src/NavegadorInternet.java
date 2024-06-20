import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet {
    private List<String> abas;
    private String paginaAtual;

    public NavegadorInternet() {
        this.abas = new ArrayList<>();
        this.paginaAtual = null;
    }

    public void abrirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("Página aberta: " + url);
    }

    public void adicionarAba(String url) {
        abas.add(url);
        System.out.println("Nova aba adicionada: " + url);
    }

    public void atualizarPagina() {
        if (paginaAtual != null) {
            System.out.println("Página atualizada: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página está aberta para atualizar.");
        }
    }

    public void exibirAbas() {
        if (abas.isEmpty()) {
            System.out.println("Nenhuma aba aberta.");
        } else {
            System.out.println("Abas abertas:");
            for (int i = 0; i < abas.size(); i++) {
                System.out.println((i + 1) + ": " + abas.get(i));
            }
        }
    }

    public static void main(String[] args) {
        NavegadorInternet navegador = new NavegadorInternet();
        navegador.abrirPagina("https://www.ihuu.com");
        navegador.adicionarAba("https://www.google.com");
        navegador.adicionarAba("https://www.github.com");
        navegador.atualizarPagina();
        navegador.exibirAbas();
    }
}
