package entities;

public class Tela {
    private int largura;
    private int altura;
    private String displayExibicao;


    public Tela(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public String getDisplayExibicao() {
        return displayExibicao;
    }

    public void exibir(String conteudo){
        this.displayExibicao = conteudo;
    }
}
