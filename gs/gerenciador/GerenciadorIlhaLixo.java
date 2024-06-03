package gs.gerenciador;

import gs.model.IlhaLixo;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorIlhaLixo {

    private List<IlhaLixo> listaIlhas;

    public GerenciadorIlhaLixo() {
        this.listaIlhas = new ArrayList<>();
    }

    public void adicionarIlha(IlhaLixo ilha) {
        listaIlhas.add(ilha);
    }

    public void verificarStatusLimpeza(IlhaLixo ilha) {
        if (ilha.isStatusLimpeza()) {
            System.out.println("A ilha " + ilha.getLocalizacao() + " está limpa.");
        } else {
            System.out.println("A ilha " + ilha.getLocalizacao() + " não está limpa.");
        }
    }

    public void listarIlhas() {
        for (IlhaLixo ilha : listaIlhas) {
            System.out.println("ID: " + ilha.getIdIlha() + " - Localização: " + ilha.getLocalizacao() + " - Tamanho: " + ilha.getTamanho() + " - Tipo de Lixo: " + ilha.getTipoLixo());
        }
    }
}