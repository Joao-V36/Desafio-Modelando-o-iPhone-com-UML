package Celular;

import AparelhoTelefonico.telefone;
import NavegadorInternet.safari;
import ReproutorMusical.appleMusic;

public class iphone {
    public static void main(String[] args) {

        appleMusic play = new appleMusic();
        System.out.println("APPLE MUSIC: \n");
        play.selecionarMusica();
        play.tocar();
        play.pausar();


        telefone tel = new telefone();
        System.out.println("\nTELEFONE: \n");
        tel.ligar();
        tel.atender();
        tel.correioVoz();


        safari nav = new safari();
        System.out.println("\nSAFARI: \n");
        nav.exibirPagina();
        nav.adicionarNovaAba();
        nav.atualizarPagina();

    }
}

