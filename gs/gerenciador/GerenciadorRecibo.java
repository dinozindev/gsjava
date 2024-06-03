package gs.gerenciador;

import gs.model.Recibo;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorRecibo {

    private List<Recibo> listaRecibos;

    public GerenciadorRecibo() {
        this.listaRecibos = new ArrayList<>();
    }

    public void adicionarRecibo(Recibo recibo) {
        listaRecibos.add(recibo);
    }

    public void imprimirRecibo(Recibo recibo) {
        System.out.println("-------------------------");
        System.out.println("        ECOCEAN         ");
        System.out.println("-------------------------");
        System.out.println("RECIBO Nº " + recibo.getIdRecibo());
        System.out.println("------------------------");
        System.out.println("Valor Total: R$ " + recibo.getValorTotal());
        System.out.println("------------------------");
        System.out.println("Data: " + recibo.getData());
        System.out.println("------------------------");
        System.out.println("Hora: " + recibo.getHora());
        System.out.println("------------------------");
    }

    public void listarRecibos() {
        for (Recibo recibo : listaRecibos) {
            System.out.println("------------------------");
            System.out.println("RECIBO Nº " + recibo.getIdRecibo());
            System.out.println("------------------------");
            System.out.println("Valor Total: R$ " + recibo.getValorTotal());
            System.out.println("------------------------");
            System.out.println("Data: " + recibo.getData());
            System.out.println("------------------------");
            System.out.println("Hora: " + recibo.getHora());
            System.out.println("------------------------");
        }
    }
}