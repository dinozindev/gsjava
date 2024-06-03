package gs.model;

public class Recompensa {
    private int idRecompensa;
    private String tipoRecompensa;
    private int pontoNecessario;
    private String descricaoRecompensa;

    public Recompensa(int idRecompensa, int pontoNecessario, String descricaoRecompensa) {
        this.idRecompensa = idRecompensa;
        this.pontoNecessario = pontoNecessario;
        this.descricaoRecompensa = descricaoRecompensa;
    }

    public int getIdRecompensa() {
        return idRecompensa;
    }

    public void setIdRecompensa(int idRecompensa) {
        this.idRecompensa = idRecompensa;
    }

    public int getPontoNecessario() {
        return pontoNecessario;
    }

    public void setPontoNecessario(int pontoNecessario) {
        this.pontoNecessario = pontoNecessario;
    }

    public String getDescricaoRecompensa() {
        return descricaoRecompensa;
    }

    public void setDescricaoRecompensa(String descricaoRecompensa) {
        this.descricaoRecompensa = descricaoRecompensa;
    }

    public String getTipoRecompensa() {
        return tipoRecompensa;
    }

    public void setTipoRecompensa(String tipoRecompensa) {
        this.tipoRecompensa = tipoRecompensa;
    }
}
