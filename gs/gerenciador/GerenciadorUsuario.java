package gs.gerenciador;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import gs.model.Recompensa;
import gs.model.Usuario;

public class GerenciadorUsuario {
	private Scanner scanner;
	private ArrayList<Usuario> usuarios;
	private Usuario usuarioLogado;
	
	public GerenciadorUsuario() {
		this.usuarios = new ArrayList<Usuario>();
		this.scanner = new Scanner(System.in);
	}
	
	public Usuario cadastrar() {
    	Pattern patternEmail = Pattern.compile("^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    	String email;
    	Pattern patternTel = Pattern.compile("^(\\(\\d{2}\\)\\s*\\d{5}-\\d{4})|^(\\d{2}\\s*\\d{5}-\\d{4})$");
    	String telefone;
    	Pattern patternCpf = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");
    	String cpf;
    	
    	System.out.println("\n*-* CADASTRO USUÁRIO *-*");
        System.out.print("Digite o nome: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        while (true) {
        	System.out.print("Digite o CPF: ");
            cpf = scanner.nextLine();
            Matcher matcher = patternCpf.matcher(cpf);
            if (matcher.matches()) {
            	break;
            } else {
            	System.out.println("CPF inválido.");
            	continue;
            }
        }
        while (true) {
        	System.out.print("Digite o email: ");
            email = scanner.nextLine();
            Matcher matcher = patternEmail.matcher(email);
            if (matcher.matches()) {
            	break;
            } else {
            	System.out.println("E-mail inválido.");
            	continue;
            }
        }
        while (true) {
        	System.out.print("Digite o telefone: ");
            telefone = scanner.nextLine();
            Matcher matcher = patternTel.matcher(telefone);
            if (matcher.matches()) {
            	break;
            } else {
            	System.out.println("Telefone inválido.");
            	continue;
            }
        }
        Usuario usuario = new Usuario(cpf, nomeUsuario, email, telefone, senha);
        usuarios.add(usuario);
        System.out.println("\nUsuário cadastrado com sucesso!");
        return usuario;
    }
    
    public void login() {
    	while (true) {
    		boolean autenticado = false;
    		if (usuarioLogado != null) {
    			System.out.println("Você já está logado.");
    			break;
    		}
    		System.out.println("\n*-* LOGIN USUÁRIO *-*");
            System.out.print("Digite o e-mail: ");
            String email = scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();
            for (Usuario usuario : usuarios) {
            	if (usuario.getEmailUsuario().equals(email) && usuario.getSenhaUsuario().equals(senha)) {
                    System.out.println("\nLogin realizado com sucesso!");
                    autenticado = true;
                    setUsuarioLogado(usuario);
                    break;
                } 
            }
            if (autenticado == false) {
                System.out.println("\nUsuário ou senha inválidos.");
            	continue;
            	} else {
            		break;
            	}
            
    	}
    	
    }
    
    public void logout() {
    	if (usuarioLogado != null) {
    		usuarioLogado = null;
    		System.out.println("\nDeslogando...");
    	} else {
    		System.out.println("Você ainda não está logado.");
    	}
    }

    
    public void imprimirUsuarios() {
    	System.out.println("\n*-* LISTA DE USUÁRIOS *-*\n");
    	for (Usuario usuario : usuarios) {
    		usuario.imprimirUsuario();
    	}
    }
    
    public ArrayList<Usuario> retornaListaUsuarios() {
    	return usuarios;
    }
    
    // exemplo de sobrecarga
    // metodo operacional que soma os pontos atuais do usuario + pontos recebidos
    public int somar(int pontosAtuais, int pontosAdicionais) {
    		return pontosAtuais += pontosAdicionais;
    }
    
    // metodo operacional que soma o valor doado atual do usuario + valor novo
    public double somar(double valorDoadoAtual, double valorDoadoAdicional) {
    		return valorDoadoAtual += valorDoadoAdicional;
    }
    
    // método operacional que subtrai os pontos atuais do usuario
    public int subtrair(int pontosAtuais, int pontosASeremRemovidos) {
    		return pontosAtuais -= pontosASeremRemovidos;
    }
    
    public void adicionarRecompensaUsuario(Recompensa recompensa, Usuario usuario) {
    	if (usuario.getEmailUsuario() != usuarioLogado.getEmailUsuario() || usuarioLogado == null) {
    		System.out.println("Você não está logado. Recompensa não foi adicionada a sua lista.");
    	} else {
    		usuario.getRecompensasObtidas().add(recompensa);
    		setUsuarioLogado(usuario);
        	System.out.println("\nRecompensa adicionada ao usuário com sucesso.");
    	}
    }
    
    public void listarRecompensasUsuario(Usuario usuario) {
    	System.out.println("\n*-* LISTA DE RECOMPENSAS DO USUÁRIO *-*\n");
    	for (Recompensa recompensa : usuario.getRecompensasObtidas()) {
    		recompensa.imprimirRecompensa();
    	}
    }
    
    public Usuario getUsuarioLogado() {
        return this.usuarioLogado;
    }
    
    public void setUsuarioLogado(Usuario usuario) {
    	this.usuarioLogado = usuario;
    }
}
