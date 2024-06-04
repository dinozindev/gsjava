package gs.gerenciador;

import java.util.ArrayList;
import java.util.List;
import gs.model.Recompensa;
public class GerenciadorRecompensa {
    private List<Recompensa> recompensas;

    public GerenciadorRecompensa() {
        this.recompensas = new ArrayList<>();
    }

    public void cadastrarRecompensa(Recompensa recompensa) {
        recompensas.add(recompensa);
    }

    public List<Recompensa> buscarRecompensasPorTipo(String tipoRecompensa) {
        List<Recompensa> recompensasEncontradas = new ArrayList<>();
        for (Recompensa recompensa : recompensas) {
            if (recompensa.getTipoRecompensa().equals(tipoRecompensa)) {
                recompensasEncontradas.add(recompensa);
            }
        }
        return recompensasEncontradas;
    }

    public void atualizarRecompensa(Recompensa recompensaAtualizada) {
        for (Recompensa recompensa : recompensas) {
            if (recompensa.getIdRecompensa() == recompensaAtualizada.getIdRecompensa()) {
                recompensa.setDescricaoRecompensa(recompensaAtualizada.getDescricaoRecompensa());
                recompensa.setPontoNecessario(recompensaAtualizada.getPontoNecessario());
                recompensa.setTipoRecompensa(recompensaAtualizada.getTipoRecompensa());
                return;
            }
        }
    }

    public List<Recompensa> listarRecompensas() {
        return recompensas;
    }
}