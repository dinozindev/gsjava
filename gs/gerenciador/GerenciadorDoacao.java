package gs.gerenciador;

import java.util.ArrayList;

import gs.model.Doacao;

public class GerenciadorDoacao {
    private ArrayList<Doacao> doacoes;

    public GerenciadorDoacao() {
        this.doacoes = new ArrayList<Doacao>();
    }

    public void registrarDoacao(Doacao doacao) {
        doacoes.add(doacao);
    }

    public ArrayList<Doacao> listarDoacoes() {
        return doacoes;
    }

    public void AtualizarDoacao(int idDoacao, double novaQuantia) {
        for (Doacao doacao : doacoes) {
            if (doacao.getIdDoacao() == idDoacao) {
                doacao.setQuantiaDoacao(novaQuantia);
                break;
            }
        }
    }
}