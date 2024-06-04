package gs.model;

import java.util.ArrayList;

public class Usuario {
    private String cpfUsuario;
    private String nomeUsuario;
    private String emailUsuario;
    private String telUsuario;
    private int pontosUsuario;
    private double valorDoado;
    private String senhaUsuario;
    private ArrayList<Recompensa> recompensasObtidas;
    
    public Usuario(String cpfUsuario, String nomeUsuario, String emailUsuario, String telUsuario, String senhaUsuario) {
    	this.cpfUsuario = cpfUsuario;
    	this.nomeUsuario = nomeUsuario;
    	this.emailUsuario = emailUsuario;
    	this.telUsuario = telUsuario;
    	this.senhaUsuario = senhaUsuario;
    	this.valorDoado = 0;
    	this.pontosUsuario = 0;
    	this.recompensasObtidas = new ArrayList<Recompensa>();
    }

	public String getCpfUsuario() {
		return cpfUsuario;
	}

	public void setCpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getTelUsuario() {
		return telUsuario;
	}

	public void setTelUsuario(String telUsuario) {
		this.telUsuario = telUsuario;
	}

	public int getPontosUsuario() {
		return pontosUsuario;
	}

	public void setPontosUsuario(int pontosUsuario) {
		this.pontosUsuario = pontosUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
    
    public double getValorDoado() {
		return valorDoado;
	}

	public void setValorDoado(double valorDoado) {
		this.valorDoado = valorDoado;
	}

	public ArrayList<Recompensa> getRecompensasObtidas() {
		return recompensasObtidas;
	}

	public void setRecompensasObtidas(ArrayList<Recompensa> recompensasObtidas) {
		this.recompensasObtidas = recompensasObtidas;
	}

	public void imprimirUsuario() {
    	System.out.println("Nome: " + getNomeUsuario());
		System.out.println("CPF: " + getCpfUsuario());
		System.out.println("Senha: " + getSenhaUsuario());
		System.out.println("Pontos: " + getPontosUsuario());
		System.out.println("E-mail: " + getEmailUsuario());
		System.out.println("Valor doado: R$" + getValorDoado());
		System.out.println("Telefone: " + getTelUsuario() + "\n");
    }
}
