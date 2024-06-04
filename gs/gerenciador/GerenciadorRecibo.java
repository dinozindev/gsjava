package gs.gerenciador;

import gs.model.Doacao;
import gs.model.Recibo;
import java.util.ArrayList;

public class GerenciadorRecibo {

    private ArrayList<Recibo> listaRecibos;

    public GerenciadorRecibo() {
        this.listaRecibos = new ArrayList<Recibo>();
    }

    public void adicionarRecibo(Recibo recibo) {
    	System.out.println("Recibo adicionado com sucesso.");
        listaRecibos.add(recibo);
    }
    
    public Recibo gerarRecibo(Doacao doacao) {
    	Recibo recibo = new Recibo();
    	recibo.setIdRecibo(doacao.getIdDoacao());
    	recibo.setValorTotal(doacao.getQuantiaDoacao());
    	recibo.setDataRecibo(doacao.getDataDoacao());
    	recibo.setHoraRecibo(doacao.getHoraDoacao());

    	return recibo;
    }

    public void listarRecibos() {
    	System.out.println("\n*-* LISTA DE RECIBOS *-*\n");
        for (Recibo recibo : listaRecibos) {
            recibo.imprimirRecibo();
        }
    }
    
    public ArrayList<Recibo> retornarRecibos() {
    	return listaRecibos;
    }
}