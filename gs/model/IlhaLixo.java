package gs.model;

public class IlhaLixo {
    private int idIlha;
    private String localizacao;
    private boolean statusLimpeza;
    private String tamanho;
    private String tipoLixo;

    public IlhaLixo(int idIlha, String localizacao, boolean statusLimpeza, String tamanho, String tipoLixo) {
        this.idIlha = idIlha;
        this.localizacao = localizacao;
        this.statusLimpeza = statusLimpeza;
        this.tamanho = tamanho;
        this.tipoLixo = tipoLixo;
    }

    public int getIdIlha() {
        return idIlha;
    }

    public void setIdIlha(int idIlha) {
        this.idIlha = idIlha;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public boolean isStatusLimpeza() {
        return statusLimpeza;
    }

    public void setStatusLimpeza(boolean statusLimpeza) {
        this.statusLimpeza = statusLimpeza;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoLixo() {
        return tipoLixo;
    }

    public void setTipoLixo(String tipoLixo) {
        this.tipoLixo = tipoLixo;
    }
}
