package gs.model;

public class ReconhecimentoImagem {
    private int idImagem;
    private String dataCaptura;
    private EspecieMarinha especieIdentificada;
    private String imgFormato;
    // a imagem com o caminho é apenas um exemplo, já que não estamos trabalhando com arquivos de imagem.
    private String imgReconhecimento;
    private Usuario usuario;

    public ReconhecimentoImagem(int idImagem, String dataCaptura, EspecieMarinha especieIdentificada, String imgFormato, String imgReconhecimento, Usuario usuario) {
        this.idImagem = idImagem;
        this.dataCaptura = dataCaptura;
        this.especieIdentificada = especieIdentificada;
        this.imgFormato = imgFormato;
        this.imgReconhecimento = imgReconhecimento;
        this.usuario = usuario;
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

	public String getImgFormato() {
		return imgFormato;
	}

	public void setImgFormato(String imgFormato) {
		this.imgFormato = imgFormato;
	}

	public String getImgReconhecimento() {
		return imgReconhecimento;
	}

	public void setImgReconhecimento(String imgReconhecimento) {
		this.imgReconhecimento = imgReconhecimento;
	}
	
    public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void imprimirReconhecimento() {
    	System.out.println("ID da Imagem: " + getIdImagem());
    	System.out.println("Data da captura: " + getDataCaptura());
    	System.out.println("Espécie identificada: " + getEspecieIdentificada().getNomeEspecie());
    	System.out.println("Arquivo da imagem: " + getImgReconhecimento());
    	System.out.println("Formato da imagem: " + getImgFormato());
    	System.out.println("Usuário que identificou: " + getUsuario().getNomeUsuario() + "\n");
    }
}
