package gs.gerenciador;

import java.util.ArrayList;

import gs.model.EspecieMarinha;

public class GerenciadorEspecieMarinha {
	private ArrayList<EspecieMarinha> especies;
	
	public GerenciadorEspecieMarinha() {
		especies = new ArrayList<EspecieMarinha>();
	}
	
	public void adicionarEspecie(EspecieMarinha especie) {
		especies.add(especie);
		System.out.println("Espécie adicionada com sucesso.");
	}
	
	public void removerEspecie(EspecieMarinha especie) {
		especies.remove(especie);
		System.out.println("Espécie removida com sucesso.");
	}
	
	public void buscarEspecieNomeCientifico(String nomeCientifico) {
		for (EspecieMarinha especie : especies) {
            if (especie.getNomeCientificoEspecie().equals(nomeCientifico)) {
            	System.out.println("A espécie buscada foi encontrada!\n");
                especie.imprimirEspecieMarinha();
            }
        }
	}
	
	public void consultarEspecies() {
		System.out.println("\n*-* LISTA DE ESPÉCIES MARINHAS *-*\n");
		for (EspecieMarinha especie : especies) {
			especie.imprimirEspecieMarinha();
		}
	}
	
	public ArrayList<EspecieMarinha> retornarEspecies() {
		return especies;
	}
}
