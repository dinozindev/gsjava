package gs.gerenciador;

import java.util.ArrayList;
import gs.model.Recompensa;
import gs.model.Usuario;
public class GerenciadorRecompensa {
    private ArrayList<Recompensa> recompensas;

    public GerenciadorRecompensa() {
        this.recompensas = new ArrayList<Recompensa>();
    }

    public void cadastrarRecompensa(Recompensa recompensa) {
        recompensas.add(recompensa);
        System.out.println("Recompensa adicionada com sucesso.");
    }

    public void listarRecompensas() {
    	System.out.println("\n*-* LISTA DE RECOMPENSAS *-*\n");
        for (Recompensa recompensa : recompensas) {
        	recompensa.imprimirRecompensa();
        }
    }
    
    public ArrayList<Recompensa> retornarRecompensas() {
    	return recompensas;
    }
    
    public Recompensa obterRecompensaUsuario(Usuario usuario, Recompensa recompensa) {
    	if (recompensa.getPontoNecessario() > usuario.getPontosUsuario()) {
    		System.out.println("Você não tem pontos suficientes para resgatar a recompensa.");
    		return null;
    	} else {
    		int pontosAtuais = usuario.getPontosUsuario() - recompensa.getPontoNecessario();
    		usuario.setPontosUsuario(pontosAtuais);
    		System.out.println("Recompensa resgatada com sucesso.");
    		return recompensa;
    	}
    }
}