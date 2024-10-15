package Iphone;

import Interfaces.AparelhoTelefonico;
import Interfaces.Navegador;
import Interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendo o Iphone...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Deixando um correio de Voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aba nova adicionada...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Musica em pausa...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Usando os métodos da interface ReprodutorMusical
        iphone.selecionarMusica("Lar");
        iphone.tocar();
        iphone.pausar();
        
        System.out.println("\n");
        // Usando os métodos da interface AparelhoTelefonico
        iphone.ligar("9858655932");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\n");
        // Usando os métodos da interface Navegador
        iphone.exibirPagina("www.google.com/java");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
