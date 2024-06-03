package gs.model;

public class Doacao {
    private int idDoacao;
    private String dataDoacao;
    private double quantiaDoacao;
    private String formaPagamento;

    public Doacao(int idDoacao, String dataDoacao, double quantiaDoacao, String formaPagamento) {
        this.idDoacao = idDoacao;
        this.dataDoacao = dataDoacao;
        this.quantiaDoacao = quantiaDoacao;
        this.formaPagamento = formaPagamento;
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
    
    public void imprimirDoacao() {
    	System.out.println("ID da doação: " + getIdDoacao());
    	System.out.println("Data da doação: " + getDataDoacao());
    	System.out.println("Quantia da doação: R$" + getQuantiaDoacao());
    	System.out.println("Forma de pagamento: " + getFormaPagamento());
    }
}
