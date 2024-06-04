package gs.gerenciador;

import java.util.ArrayList;

import gs.model.Doacao;

public class GerenciadorDoacao {
    private ArrayList<Doacao> doacoes;

    public GerenciadorDoacao() {
        this.doacoes = new ArrayList<Doacao>();
    }

    public void adicionarDoacao(Doacao doacao) {
        doacoes.add(doacao);
        System.out.println("Doação adicionada a lista com sucesso.");
    }
    
    public void listarDoacoes() {
    	System.out.println("\n*-* LISTA DE DOAÇÕES *-*\n");
        for (Doacao doacao : doacoes) {
        	doacao.imprimirDoacao();
        }
    }
    
    public ArrayList<Doacao> retornarDoacoes() {
    	return doacoes;
    }
}