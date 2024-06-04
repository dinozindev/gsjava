package gs.model;

public class DenunciaPescaIlegal extends Denuncia {
	private int idPescaIlegal;
	private String tipoPescaIlegal;
	private String horaPescaIlegal;
	private String dataPescaIlegal;

	public DenunciaPescaIlegal(int idDenuncia, String pontoReferencia, String coordenadasDenuncia, String descricaoDenuncia, Usuario usuario,  int idPescaIlegal, String tipoPescaIlegal, String horaPescaIlegal, String dataPescaIlegal) {
		super(idDenuncia, pontoReferencia, coordenadasDenuncia, descricaoDenuncia, usuario);
		this.idPescaIlegal = idPescaIlegal;
		this.tipoPescaIlegal = tipoPescaIlegal;
		this.horaPescaIlegal = horaPescaIlegal;
		this.dataPescaIlegal = dataPescaIlegal;
	}
	
	public DenunciaPescaIlegal() {
		
	}

	public int getIdPescaIlegal() {
		return idPescaIlegal;
	}

	public void setIdPescaIlegal(int idPescaIlegal) {
		this.idPescaIlegal = idPescaIlegal;
	}

	public String getTipoPescaIlegal() {
		return tipoPescaIlegal;
	}

	public void setTipoPescaIlegal(String tipoPescaIlegal) {
		this.tipoPescaIlegal = tipoPescaIlegal;
	}

	public String getHoraPescaIlegal() {
		return horaPescaIlegal;
	}

	public void setHoraPescaIlegal(String horaPescaIlegal) {
		this.horaPescaIlegal = horaPescaIlegal;
	}

	public String getDataPescaIlegal() {
		return dataPescaIlegal;
	}

	public void setDataPescaIlegal(String dataPescaIlegal) {
		this.dataPescaIlegal = dataPescaIlegal;
	}
	
	// metodo com sobrescrita
	@Override
	public void imprimirDenuncia() {
		super.imprimirDenuncia();
		System.out.println("ID_Pesca: " + getIdPescaIlegal());
		System.out.println("Tipo de Pesca Ilegal: " + getTipoPescaIlegal());
		System.out.println("Horário: " + getHoraPescaIlegal());
		System.out.println("Data: " + getDataPescaIlegal());
	}
	
	
}
