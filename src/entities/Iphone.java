package entities;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    private Tela tela;
    private SistemaOperacional sistemaOperacional;
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    @Override
    public void ligar() {
        System.out.println("Ligando iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciado correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo paginas");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }
}
