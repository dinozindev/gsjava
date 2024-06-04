package gs.model;

public class Recibo {
    private int idRecibo;
    private double valorTotal;
    private String dataRecibo;
    private String horaRecibo;
	
    public Recibo() {
	
	}
    
	public int getIdRecibo() {
		return idRecibo;
	}
	public void setIdRecibo(int idRecibo) {
		this.idRecibo = idRecibo;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getDataRecibo() {
		return dataRecibo;
	}
	public void setDataRecibo(String dataRecibo) {
		this.dataRecibo = dataRecibo;
	}
	public String getHoraRecibo() {
		return horaRecibo;
	}
	public void setHoraRecibo(String horaRecibo) {
		this.horaRecibo = horaRecibo;
	}

	public void imprimirRecibo() {
        System.out.println("------------------------------------");
        System.out.println("              ECOCEAN             ");
        System.out.println("------------------------------------");
        System.out.println("RECIBO Nº " + getIdRecibo()   );
        System.out.println("------------------------------------");
        System.out.println("Valor Total: R$ " + getValorTotal());
        System.out.println("------------------------------------");
        System.out.println("Data de emissão: " + getDataRecibo());
        System.out.println("------------------------------------");
        System.out.println("Hora de emissão: " + getHoraRecibo());
        System.out.println("------------------------------------\n");
    }
    
}
