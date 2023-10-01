package application;

import entities.Aplicativo;
import entities.Iphone;
import entities.SistemaOperacional;
import entities.Tela;

public class Program {
    public static void main(String[] args) {
        Tela tela = new Tela(75, 150);
        tela.exibir("Display");

        SistemaOperacional so = new SistemaOperacional("4gb RAM Iphone X 126gb armazenamento");

        Aplicativo app1 = new Aplicativo("Whatsapp", "App de conversa");
        Aplicativo app2 = new Aplicativo("Instagram", "App de fotos, videos, reels e etc.");

        Iphone iphone = new Iphone();

        iphone.ligar();

        so.instalarApp(app1);
        so.instalarApp(app2);

        so.abrirApp("Whatsapp");

        iphone.atender();

        iphone.iniciarCorreioVoz();

        iphone.exibirPagina();

        iphone.adicionarNovaAba();

        iphone.atualizarPagina();

        iphone.selecionarMusica();

        iphone.tocar();

        iphone.pausar();
    }
}
