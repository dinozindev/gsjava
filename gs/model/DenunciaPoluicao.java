package gs.model;

import java.util.UUID;

public class DenunciaPoluicao extends Denuncia{
	private String idPoluicao;
	private String tipoPoluicao;
	private String quantidadePoluicao;
	private String oceanoPoluicao;
	
	public DenunciaPoluicao(String idDenuncia, String pontoReferencia, String coordenadasDenuncia, String descricaoDenuncia, Usuario usuario, String tipoPoluicao, String quantidadePoluicao, String oceanoPoluicao) {
		super(idDenuncia, pontoReferencia, coordenadasDenuncia, descricaoDenuncia, usuario);
		this.idPoluicao = UUID.randomUUID().toString();
		this.tipoPoluicao = tipoPoluicao;
		this.quantidadePoluicao = quantidadePoluicao;
		this.oceanoPoluicao = oceanoPoluicao;
	}
	
	public DenunciaPoluicao() {
		this.idPoluicao = UUID.randomUUID().toString();
	}

	public String getIdPoluicao() {
		return idPoluicao;
	}

	public void setIdPoluicao(String idPoluicao) {
		this.idPoluicao = idPoluicao;
	}

	public String getTipoPoluicao() {
		return tipoPoluicao;
	}

	public void setTipoPoluicao(String tipoPoluicao) {
		this.tipoPoluicao = tipoPoluicao;
	}

	public String getQuantidadePoluicao() {
		return quantidadePoluicao;
	}

	public void setQuantidadePoluicao(String quantidadePoluicao) {
		this.quantidadePoluicao = quantidadePoluicao;
	}

	public String getOceanoPoluicao() {
		return oceanoPoluicao;
	}

	public void setOceanoPoluicao(String oceanoPoluicao) {
		this.oceanoPoluicao = oceanoPoluicao;
	}
	
	// metodo com sobrescrita
	@Override
	public void imprimirDenuncia() {
		super.imprimirDenuncia();
		System.out.println("ID_Poluição: " + getIdPoluicao());
		System.out.println("Tipo da poluição: " + getTipoPoluicao());
		System.out.println("Quantidade de poluição: " + getQuantidadePoluicao());
		System.out.println("Oceano em que ocorreu: " + getOceanoPoluicao() + "\n");
	}
	
	
	
}
