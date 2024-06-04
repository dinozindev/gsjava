package gs.model;

public class EspecieMarinha {
    private int idEspecie;
    private String nomeEspecie;
    private String nomeCientificoEspecie;
    private String statusConservacao;
    private String descricaoEspecie;
	
    public EspecieMarinha(int idEspecie, String nomeEspecie, String nomeCientificoEspecie, String statusConservacao, String descricaoEspecie) {
		this.idEspecie = idEspecie;
		this.nomeEspecie = nomeEspecie;
		this.nomeCientificoEspecie = nomeCientificoEspecie;
		this.statusConservacao = statusConservacao;
		this.descricaoEspecie = descricaoEspecie;
	}

	public int getIdEspecie() {
		return idEspecie;
	}

	public void setIdEspecie(int idEspecie) {
		this.idEspecie = idEspecie;
	}

	public String getNomeEspecie() {
		return nomeEspecie;
	}

	public void setNomeEspecie(String nomeEspecie) {
		this.nomeEspecie = nomeEspecie;
	}

	public String getNomeCientificoEspecie() {
		return nomeCientificoEspecie;
	}

	public void setNomeCientificoEspecie(String nomeCientificoEspecie) {
		this.nomeCientificoEspecie = nomeCientificoEspecie;
	}

	public String getStatusConservacao() {
		return statusConservacao;
	}

	public void setStatusConservacao(String statusConservacao) {
		this.statusConservacao = statusConservacao;
	}

	public String getDescricaoEspecie() {
		return descricaoEspecie;
	}

	public void setDescricaoEspecie(String descricaoEspecie) {
		this.descricaoEspecie = descricaoEspecie;
	}
    
    public void imprimirEspecieMarinha() {
    	System.out.println("ID Espécie: " + getIdEspecie());
    	System.out.println("Nome: " + getNomeEspecie());
    	System.out.println("Nome científico: " + getNomeCientificoEspecie());
    	System.out.println("Descrição: " + getDescricaoEspecie());
    	System.out.println("Status de conservação: " + getStatusConservacao() + "\n");
    	
    }

    
}

