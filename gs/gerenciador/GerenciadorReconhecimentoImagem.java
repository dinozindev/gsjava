package gs.gerenciador;

import gs.model.EspecieMarinha;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorReconhecimentoImagem {

    private List<EspecieMarinha> listaEspecies;

    public GerenciadorReconhecimentoImagem() {
        this.listaEspecies = new ArrayList<>();
    }

    public void adicionarEspecie(EspecieMarinha especie) {
        listaEspecies.add(especie);
    }

    public void reconhecerEspecie(EspecieMarinha especie) {
        if (especie.isStatusConservacao()) {
            System.out.println("A espécie " + especie.getNomeEspecie() + " está em risco de extinção.");
        } else {
            System.out.println("A espécie " + especie.getNomeEspecie() + " não está em risco de extinção.");
        }

        if (especie.getDescricaoEspecie().contains("rara")) {
            System.out.println("A espécie " + especie.getNomeEspecie() + " é considerada rara.");
        } else if (especie.getDescricaoEspecie().contains("endêmica")) {
            System.out.println("A espécie " + especie.getNomeEspecie() + " é considerada endêmica.");
        } else {
            System.out.println("A espécie " + especie.getNomeEspecie() + " não tem um status de conservação especial.");
        }
    }

    public void listarEspecies() {
        for (EspecieMarinha especie : listaEspecies) {
            especie.imprimirEspecieMarinha();
        }
    }
}