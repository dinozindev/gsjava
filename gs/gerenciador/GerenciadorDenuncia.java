package gs.gerenciador;

import java.util.ArrayList;
import gs.model.Denuncia;


public class GerenciadorDenuncia {
    private ArrayList<Denuncia> denuncias;

    public GerenciadorDenuncia() {
        this.denuncias = new ArrayList<Denuncia>();
    }

    public void cadastrarDenuncia(Denuncia denuncia) {
        denuncias.add(denuncia);
    }

    public ArrayList<Denuncia> listarDenuncias() {
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
}