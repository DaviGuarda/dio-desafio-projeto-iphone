package entities;

import java.util.ArrayList;
import java.util.List;

public class SistemaOperacional {

    private List<Aplicativo> aplicativos;
    private String configuracoes;

    public SistemaOperacional(String configuracoes) {
        this.aplicativos = new ArrayList<>();
        this.configuracoes = configuracoes;
    }

    public void instalarApp(Aplicativo app){
        aplicativos.add(app);
    }

    public void abrirApp(String nomeAplicativo){
        Aplicativo aplicativo = null;
        if (!aplicativos.isEmpty()){
            for (Aplicativo ap : aplicativos){
                if (ap.getNome().equalsIgnoreCase(nomeAplicativo)){
                    aplicativo = ap;
                    break;
                }
            }
            System.out.println("Abrindo aplicativo -> "+aplicativo);
        }
    }
    public void configurar(String config){
        System.out.println("Você configurou ->" + config);
    }
}
