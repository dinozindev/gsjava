package gs.gerenciador;

import java.util.ArrayList;
import java.util.List;
import gs.model.Denuncia;

public class GerenciadorDenuncia {
    private List<Denuncia> denuncias;

    public GerenciadorDenuncia() {
        this.denuncias = new ArrayList<>();
    }

    public void cadastrarDenuncia(Denuncia denuncia) {
        denuncias.add(denuncia);
    }

    public List<Denuncia> listarDenuncias() {
        return denuncias;
    }

    public Denuncia buscarDenunciaPorId(int idDenuncia) {
        for (Denuncia denuncia : denuncias) {
            if (denuncia.getIdDenuncia() == idDenuncia) {
                return denuncia;
            }
        }
        return null;
    }

    public void cadastrarDenunciaPescaIlegal(String localizacao, String especieAmeacada, String descricao) {
        Denuncia denuncia = new Denuncia();
        denuncia.setPontoReferencia(localizacao);
        denuncia.setDescricaoDenuncia("Pesca ilegal de " + especieAmeacada + ": " + descricao);
        cadastrarDenuncia(denuncia);
    }

    public void cadastrarDenunciaPoluicaoMarinha(String localizacao, String tipoPoluicao, String descricao) {
        Denuncia denuncia = new Denuncia();
        denuncia.setPontoReferencia(localizacao);
        denuncia.setDescricaoDenuncia("Poluição marinha por " + tipoPoluicao + ": " + descricao);
        cadastrarDenuncia(denuncia);
    }

    public void cadastrarDenunciaSaudeMarinha(String localizacao, String sintoma, String descricao) {
        Denuncia denuncia = new Denuncia();
        denuncia.setPontoReferencia(localizacao);
        denuncia.setDescricaoDenuncia("Problema de saúde marinha em " + localizacao + ": " + sintoma + ". Descrição: " + descricao);
        cadastrarDenuncia(denuncia);
    }
}