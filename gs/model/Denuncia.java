package gs.model;

import java.util.UUID;

public class Denuncia {
    private String idDenuncia;
    private String pontoReferencia;
    private String coordenadasDenuncia;
    private String descricaoDenuncia;
    private Usuario usuario;

    public Denuncia(String idDenuncia, String pontoReferencia, String coordenadasDenuncia, String descricaoDenuncia, Usuario usuario) {
        this.idDenuncia = UUID.randomUUID().toString();
        this.pontoReferencia = pontoReferencia;
        this.coordenadasDenuncia = coordenadasDenuncia;
        this.descricaoDenuncia = descricaoDenuncia;
        this.usuario = usuario;
    }

    public Denuncia() {
    	this.idDenuncia = UUID.randomUUID().toString();
    }

    public String getIdDenuncia() {
        return idDenuncia;
    }

    public void setIdDenuncia(String idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    public String getCoordenadasDenuncia() {
        return coordenadasDenuncia;
    }

    public void setCoordenadasDenuncia(String coordenadasDenuncia) {
        this.coordenadasDenuncia = coordenadasDenuncia;
    }

    public String getDescricaoDenuncia() {
        return descricaoDenuncia;
    }

    public void setDescricaoDenuncia(String descricaoDenuncia) {
        this.descricaoDenuncia = descricaoDenuncia;
    }
    
    public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void imprimirDenuncia() {
    	System.out.println("ID_Denúncia: " + getIdDenuncia());
    	System.out.println("Coordenadas: " + getCoordenadasDenuncia());
    	System.out.println("Ponto de referência: " + getPontoReferencia());
    	System.out.println("Descrição: " + getDescricaoDenuncia());
    	System.out.println("Usuário: " + getUsuario().getNomeUsuario());
    }
}
