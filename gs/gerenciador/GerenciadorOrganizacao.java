package gs.gerenciador;

import java.util.ArrayList;
import gs.model.Organizacao;

public class GerenciadorOrganizacao {
    private ArrayList<Organizacao> organizacoes;

    public GerenciadorOrganizacao() {
        this.organizacoes = new ArrayList<Organizacao>();
    }

    public void cadastrarOrganizacao(Organizacao organizacao) {
        organizacoes.add(organizacao);
        System.out.println("Organização adicionada com sucesso.");
    }

    public int getPontosOrganizacao(String cnpjOrganizacao) {
        for (Organizacao organizacao : organizacoes) {
            if (organizacao.getCnpjOrganizacao().equals(cnpjOrganizacao)) {
                return organizacao.getPontosOrganizacao();
            }
        }
        return 0;
    }

    public Organizacao buscarOrganizacaoPorCnpj(String cnpjOrganizacao) {
        for (Organizacao organizacao : organizacoes) {
            if (organizacao.getCnpjOrganizacao().equals(cnpjOrganizacao)) {
                return organizacao;
            }
        }
        return null;
    }
    
    public void removerOrganizacao(Organizacao organizacao) {
    	organizacoes.remove(organizacao);
    	System.out.println("Organização removida com sucesso.");
    }
    
    public void imprimirOrganizacoes() {
    	System.out.println("\n*-* LISTA DE ORGANIZAÇÕES *-*\n");
    	for (Organizacao o : organizacoes) {
    		o.imprimirOrganizacao();
    	}
    }
    
    public void adicionarPontosOrganizacao(Organizacao organizacao, int pontos) {
    	int pontosAtuais = organizacao.getPontosOrganizacao();
    	organizacao.setPontosOrganizacao(pontosAtuais+=pontos);
    }

    public ArrayList<Organizacao> retornarOrganizacoes() {
        return organizacoes;
    }
}