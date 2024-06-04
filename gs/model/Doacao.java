package gs.model;

public class Doacao {
    private int idDoacao;
    private String dataDoacao;
    private String horaDoacao;
    private double quantiaDoacao;
    private String formaPagamento;
    private Usuario usuario;
    private Recibo recibo;

    public Doacao(int idDoacao, String dataDoacao, String horaDoacao, double quantiaDoacao, String formaPagamento, Usuario usuario) {
        this.idDoacao = idDoacao;
        this.dataDoacao = dataDoacao;
        this.horaDoacao = horaDoacao;
        this.quantiaDoacao = quantiaDoacao;
        this.formaPagamento = formaPagamento;
        this.usuario = usuario;
    }

    public int getIdDoacao() {
        return idDoacao;
    }

    public void setIdDoacao(int idDoacao) {
        this.idDoacao = idDoacao;
    }

    public String getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(String dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    public String getHoraDoacao() {
		return horaDoacao;
	}

	public void setHoraDoacao(String horaDoacao) {
		this.horaDoacao = horaDoacao;
	}

	public double getQuantiaDoacao() {
        return quantiaDoacao;
    }

    public void setQuantiaDoacao(double quantiaDoacao) {
        this.quantiaDoacao = quantiaDoacao;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Recibo getRecibo() {
		return recibo;
	}

	public void setRecibo(Recibo recibo) {
		this.recibo = recibo;
	}

	public void imprimirDoacao() {
    	System.out.println("ID da doação: " + getIdDoacao());
    	System.out.println("Data da doação: " + getDataDoacao());
    	System.out.println("Hora da doação: " + getHoraDoacao());
    	System.out.println("Quantia da doação: R$" + getQuantiaDoacao());
    	System.out.println("Usuário responsável: " + getUsuario().getNomeUsuario());
    	System.out.println("Forma de pagamento: " + getFormaPagamento() + "\n");
    }
}
