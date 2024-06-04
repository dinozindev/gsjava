package gs.gerenciador;

import gs.model.ReconhecimentoImagem;

import java.util.ArrayList;

public class GerenciadorReconhecimentoImagem {

    private ArrayList<ReconhecimentoImagem> reconhecimentos;

    public GerenciadorReconhecimentoImagem() {
        this.reconhecimentos = new ArrayList<ReconhecimentoImagem>();
    }

    public void adicionarReconhecimento(ReconhecimentoImagem ri) {
    	System.out.println("Reconhecimento de imagem adicionado com sucesso.");
        reconhecimentos.add(ri);
    }
    
    public void removerReconhecimento(ReconhecimentoImagem ri) {
    	System.out.println("Reconhecimento de imagem removido com sucesso.");
        reconhecimentos.add(ri);
    }
    
    public void listarReconhecimentos() {
    	System.out.println("\n*-* LISTA DE RECONHECIMENTOS *-*\n");
    	for (ReconhecimentoImagem ri : reconhecimentos) {
    		ri.imprimirReconhecimento();
    	}
    }
    
    public void visualizarInformacoesEspecie(ReconhecimentoImagem ri) {
    	System.out.println("\n*-* IMPRIMINDO INFORMAÇÕES DA ESPÉCIE IDENTIFICADA *-*\n");
    	ri.getEspecieIdentificada().imprimirEspecieMarinha();
    }
    
    public ArrayList<ReconhecimentoImagem> retornarReconhecimentos() {
    	return reconhecimentos;
    }

}