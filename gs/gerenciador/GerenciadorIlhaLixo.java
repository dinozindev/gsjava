package gs.gerenciador;

import gs.model.IlhaLixo;
import gs.model.Organizacao;

import java.util.ArrayList;

public class GerenciadorIlhaLixo {

    private ArrayList<IlhaLixo> listaIlhas;

    public GerenciadorIlhaLixo() {
        this.listaIlhas = new ArrayList<IlhaLixo>();
    }

    public void adicionarIlha(IlhaLixo ilha) {
    	System.out.println("Ilha de lixo adicionada com sucesso.");
        listaIlhas.add(ilha);
    }
    
    public void adicionarOrganizacaoColaboradora(Organizacao organizacao, IlhaLixo ilhaLixo) {
    	ilhaLixo.getOrganizacoesAssociadas().add(organizacao);
    	System.out.println("Colaborador adicionado a ilha de lixo.");
    }
    
    public void listarOrganizacoesIlhaLixo(IlhaLixo ilhaLixo) {
    	System.out.println("\n*-* LISTA DE ORGANIZAÇÕES AUXILIANDO A ILHA DE LIXO " + ilhaLixo.getIdIlhaLixo() + " *-*\n");
    	for (Organizacao organizacao : ilhaLixo.getOrganizacoesAssociadas()) {
    		organizacao.imprimirOrganizacao();
    	}
    }

   public void listarIlhasLixo() {
	   System.out.println("\n*-* LISTA DE ILHAS DE LIXO *-*\n");
	   for (IlhaLixo il : listaIlhas) {
		   il.imprimirIlhaLixo();
	   }
   }
   
   public ArrayList<IlhaLixo> retornarIlhasLixo() {
	   return listaIlhas;
   }
}