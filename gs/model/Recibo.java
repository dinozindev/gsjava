package gs.model;

public class Recibo {
    private int idRecibo;
    private double valorTotal;
    private String data;
    private String hora;

    public Recibo(int idRecibo, double valorTotal, String data, String hora) {
        this.idRecibo = idRecibo;
        this.valorTotal = valorTotal;
        this.data = data;
        this.hora = hora;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
