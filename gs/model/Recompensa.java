package gs.model;

public class Recompensa {
    private int idRecompensa;
    private String tipoRecompensa;
    private int pontoNecessario;
    private String descricaoRecompensa;

    public Recompensa(int idRecompensa, String tipoRecompensa, int pontoNecessario, String descricaoRecompensa) {
        this.idRecompensa = idRecompensa;
        this.tipoRecompensa = tipoRecompensa;
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
    
    public void imprimirRecompensa() {
    	System.out.println("ID: " + getIdRecompensa());
    	System.out.println("Descrição da recompensa: " + getDescricaoRecompensa());
    	System.out.println("Pontos necessários: " + getPontoNecessario());
    	System.out.println("Tipo de recompensa: " + getTipoRecompensa() + "\n");
    	
    }
}
