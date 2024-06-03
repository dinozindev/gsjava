package gs.model;

public class ReconhecimentoImagem {
    private int idImagem;
    private String dataCaptura;
    private EspecieMarinha especieIdentificada;
    private String imagemFormato;

    public ReconhecimentoImagem(int idImagem, String dataCaptura, EspecieMarinha especieIdentificada, String imagemFormato) {
        this.idImagem = idImagem;
        this.dataCaptura = dataCaptura;
        this.especieIdentificada = especieIdentificada;
        this.imagemFormato = imagemFormato;
    }

    public int getIdImagem() {
        return idImagem;
    }

    public void setIdImagem(int idImagem) {
        this.idImagem = idImagem;
    }

    public String getDataCaptura() {
        return dataCaptura;
    }

    public void setDataCaptura(String dataCaptura) {
        this.dataCaptura = dataCaptura;
    }

    public EspecieMarinha getEspecieIdentificada() {
        return especieIdentificada;
    }

    public void setEspecieIdentificada(EspecieMarinha especieIdentificada) {
        this.especieIdentificada = especieIdentificada;
    }

	public String getImagemFormato() {
		return imagemFormato;
	}

	public void setImagemFormato(String imagemFormato) {
		this.imagemFormato = imagemFormato;
	}
    
}
