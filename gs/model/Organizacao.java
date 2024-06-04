package gs.model;

public class Organizacao {

    private String cnpjOrganizacao;
    private String nomeOrganizacao;
    private String descricaoOrganizacao;
    private String tipoOrganizacao;
    private int pontosOrganizacao;

    public Organizacao(String cnpjOrganizacao, String nomeOrganizacao, String descricaoOrganizacao, String tipoOrganizacao) {
        this.cnpjOrganizacao = cnpjOrganizacao;
        this.nomeOrganizacao = nomeOrganizacao;
        this.descricaoOrganizacao = descricaoOrganizacao;
        this.tipoOrganizacao = tipoOrganizacao;
        this.pontosOrganizacao = 0;
    }

    public String getCnpjOrganizacao() {
        return cnpjOrganizacao;
    }

    public void setCnpjOrganizacao(String cnpjOrganizacao) {
        this.cnpjOrganizacao = cnpjOrganizacao;
    }

    public String getNomeOrganizacao() {
        return nomeOrganizacao;
    }

    public void setNomeOrganizacao(String nomeOrganizacao) {
        this.nomeOrganizacao = nomeOrganizacao;
    }

    public String getDescricaoOrganizacao() {
        return descricaoOrganizacao;
    }

    public void setDescricaoOrganizacao(String descricaoOrganizacao) {
        this.descricaoOrganizacao = descricaoOrganizacao;
    }

    public String getTipoOrganizacao() {
        return tipoOrganizacao;
    }

    public void setTipoOrganizacao(String tipoOrganizacao) {
        this.tipoOrganizacao = tipoOrganizacao;
    }

    public int getPontosOrganizacao() {
        return pontosOrganizacao;
    }

    public void setPontosOrganizacao(int pontosOrganizacao) {
        this.pontosOrganizacao = pontosOrganizacao;
    }
    
    public void imprimirOrganizacao() {
    	System.out.println("Nome da organização: " + getNomeOrganizacao());
    	System.out.println("CNPJ: " + getCnpjOrganizacao());
    	System.out.println("Descrição: " + getDescricaoOrganizacao());
    	System.out.println("Tipo da organização: " + getTipoOrganizacao());
    	System.out.println("Pontos: " + getPontosOrganizacao() + "\n");
    }
}
