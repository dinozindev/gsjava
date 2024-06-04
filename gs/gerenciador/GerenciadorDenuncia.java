package gs.gerenciador;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import gs.model.Denuncia;
import gs.model.DenunciaPescaIlegal;
import gs.model.DenunciaPoluicao;
import gs.model.Usuario;


public class GerenciadorDenuncia {
    private ArrayList<Denuncia> denuncias;
    private ArrayList<String> tiposPesca;
    private ArrayList<String> tiposPoluicao;
    private ArrayList<String> oceanos;
    private ArrayList<String> qtnd;
    private Scanner scanner;

    public GerenciadorDenuncia() {
        this.denuncias = new ArrayList<Denuncia>();
        this.tiposPesca = new ArrayList<String>();
        // adicionando tipos de pesca
        tiposPesca.add("Pesca em Áreas Protegidas");
        tiposPesca.add("Pesca de Espécies Protegidas");
        tiposPesca.add("Uso de Equipamentos Proibidos");
        tiposPesca.add("Pesca Fora de Temporada");
        tiposPesca.add("Captura Excedendo Limites de Quantidade");
        this.tiposPoluicao = new ArrayList<String>();
        // adicionando tipos de poluição
        tiposPoluicao.add("Plástico");
        tiposPoluicao.add("Vazamento de óleo");
        tiposPoluicao.add("Descarte de esgoto");
        tiposPoluicao.add("Produtos químicos");
        this.oceanos = new ArrayList<String>();
        // adicionando oceanos
        oceanos.add("Oceano Índico");
        oceanos.add("Oceano Antártico");
        oceanos.add("Oceano Pacífico");
        oceanos.add("Oceano Atlântico");
        oceanos.add("Oceano Ártico");
        this.qtnd = new ArrayList<String>();
        // adicionando qtnd de poluição
        qtnd.add("Pequena");
        qtnd.add("Baixa");
        qtnd.add("Média");
        qtnd.add("Alta");
        qtnd.add("Alarmante");
        this.scanner = new Scanner(System.in);
    }

    // exemplo de sobrecarga
    public void cadastrarDenuncia(DenunciaPescaIlegal denunciaPesca) {
        denuncias.add(denunciaPesca);
        System.out.println("\nDenúncia de Pesca Ilegal adicionada a lista com sucesso!\n");
    }
    
    public void cadastrarDenuncia(DenunciaPoluicao denunciaPoluicao) {
    	denuncias.add(denunciaPoluicao);
    	System.out.println("\nDenúncia de Poluição adicionada a lista com sucesso!\n");
    }
    
    // exemplo de sobrecarga
    public void removerDenuncia(DenunciaPescaIlegal denunciaPesca) {
    	denuncias.remove(denunciaPesca);
    	System.out.println("\nDenúncia de Pesca Ilegal removida da lista com sucesso!");
    }
    
    public void removerDenuncia(DenunciaPoluicao denunciaPoluicao) {
    	denuncias.remove(denunciaPoluicao);
    	System.out.println("\nDenúncia de Poluicao removida da lista com sucesso!");
    }

    public void listarDenuncias() {
    	System.out.println("\n*-* LISTA DE DENÚNCIAS *-*\n");
        for (Denuncia denuncia : denuncias) {
        	denuncia.imprimirDenuncia();
        }
    }
    
    public ArrayList<Denuncia> retornarDenuncias() {
    	return denuncias;
    }
    
    public DenunciaPescaIlegal realizarDenunciaPescaIlegal(Usuario usuario, GerenciadorUsuario gu) {
    	System.out.println("\n*-* INICIANDO DENÚNCIA DE PESCA ILEGAL *-*\n");
    	Pattern regexHora = Pattern.compile("^(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9])(:([0-5][0-9]))?$");
    	Pattern regexData = Pattern.compile("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])$");
    	Pattern regexCoordenadas = Pattern.compile("^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?)\\s*,\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)$");
    	DenunciaPescaIlegal denunciaPescaIlegal = new DenunciaPescaIlegal();
    	while (true) {
    		if (gu.getUsuarioLogado() != usuario) {
    			System.out.println("Você não está logado. Realize o login primeiro.");
    			break;
    		} else {
    			usuario.setPontosUsuario(gu.somar(usuario.getPontosUsuario(), 10));
    			denunciaPescaIlegal.setUsuario(usuario);
    		}
    		while (true) {
	        	System.out.print("Qual a data que a pesca ilegal ocorreu?: ");
	            String inputData = scanner.nextLine();
	            Matcher matcherData = regexData.matcher(inputData);
	            if (matcherData.matches()) {
	            	denunciaPescaIlegal.setDataPescaIlegal(inputData);
	            	break;
	            } else {
	            	System.out.println("Data inválida.");
	            	continue;
	            }
	        }
    		while (true) {
    	        System.out.print("Qual o horário que a pesca ilegal ocorreu?: ");
    	        String inputHora = scanner.nextLine();
    	        Matcher matcherHora = regexHora.matcher(inputHora);
    	           if (matcherHora.matches()) {
    	        	   denunciaPescaIlegal.setHoraPescaIlegal(inputHora);
    	        	   break;
    	            } else {
    	            	System.out.println("Horário inválido.");
    	            	continue;
    	            }
    	     }
    		while (true) {
    			for (String tipoPesca : tiposPesca) {
    				System.out.println("- " + tipoPesca);
    			}
    			System.out.print("\nQual o tipo de pesca ilegal identificado?: ");
    			String inputTipoPesca = scanner.nextLine();
    			boolean tipoCorreto = false;
    			for (String tipoPesca : tiposPesca) {
    				if (inputTipoPesca.equalsIgnoreCase(tipoPesca)) {
    					denunciaPescaIlegal.setTipoPescaIlegal(inputTipoPesca);
    					tipoCorreto = true;
    					break;
    				}
    			}
    			if (tipoCorreto == true) {
    				break;
    			} else {
    				System.out.println("\nTipo de pesca ilegal incorreto.\n");
    			}
    		} 
    		while (true) {
    			System.out.print("Quais as coordenadas em que a pesca ilegal ocorreu? (ex: 37.7749, -122.4194): ");
    	        String inputCoordenadas = scanner.nextLine();
    	        Matcher matcherCoordenadas = regexCoordenadas.matcher(inputCoordenadas);
    	        if (matcherCoordenadas.matches()) {
    	        	denunciaPescaIlegal.setCoordenadasDenuncia(inputCoordenadas);
    	        	break;
    	        } else {
    	        	System.out.println("Coordenadas inválidas.");
    	            continue;
    	        }
    		}
    		System.out.println("Qual o ponto de referência?: ");
    		String inputReferencia = scanner.nextLine();
    		denunciaPescaIlegal.setPontoReferencia(inputReferencia);
    		System.out.println("Mais alguma observação?: ");
    		String inputDescricao = scanner.nextLine();
    		denunciaPescaIlegal.setDescricaoDenuncia(inputDescricao);
    		break;
    	} 
    	System.out.println("\nDenúncia registrada com sucesso!\n");
    	return denunciaPescaIlegal;
    }
    
    public DenunciaPoluicao realizarDenunciaPoluicao(Usuario usuario, GerenciadorUsuario gu) {
    	System.out.println("\n*-* INICIANDO DENÚNCIA DE POLUIÇÃO *-*\n");
    	DenunciaPoluicao denunciaPoluicao = new DenunciaPoluicao();
    	Pattern regexCoordenadas = Pattern.compile("^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?)\\s*,\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)$");
    	while (true) {
    		if (gu.getUsuarioLogado() != usuario) {
    			System.out.println("Você não está logado. Realize o login primeiro.");
    			break;
    		} else {
    			usuario.setPontosUsuario(gu.somar(usuario.getPontosUsuario(), 10));
    			denunciaPoluicao.setUsuario(usuario);
    		}
    		while (true) {
    			for (String tipoPoluicao : tiposPoluicao) {
    				System.out.println("- " + tipoPoluicao);
    			}
    			System.out.print("\nQual o tipo de poluição identificada?: ");
    			String inputTipoPoluicao = scanner.nextLine();
    			boolean tipoCorreto = false;
    			for (String tipoPoluicao : tiposPoluicao) {
    				if (inputTipoPoluicao.equalsIgnoreCase(tipoPoluicao)) {
    					denunciaPoluicao.setTipoPoluicao(inputTipoPoluicao);
    					tipoCorreto = true;
    					break;
    				}
    			}
    			if (tipoCorreto == true) {
    				break;
    			} else {
    				System.out.println("\nTipo de poluição incorreto.\n");
    			}
    		}
    		while (true) {
    			for (String oceano : oceanos) {
    				System.out.println("- " + oceano);
    			}
    			System.out.print("\nEm qual oceano foi identificada a poluição?: ");
    			String inputOceano = scanner.nextLine();
    			boolean oceanoCorreto = false;
    			for (String oceano : oceanos) {
    				if (inputOceano.equalsIgnoreCase(oceano)) {
    					denunciaPoluicao.setOceanoPoluicao(oceano);
    					oceanoCorreto = true;
    					break;
    				}
    			}
    			if (oceanoCorreto == true) {
    				break;
    			} else {
    				System.out.println("\nOceano incorreto.\n");
    			}
    		}
    		while (true) {
    			for (String quantidade : qtnd) {
    				System.out.println("- " + quantidade);
    			}
    			System.out.print("\nQual o nível da quantidade de poluição encontrada?: ");
    			String inputQtnd = scanner.nextLine();
    			boolean qtndCorreto = false;
    			for (String quantidade : qtnd) {
    				if (inputQtnd.equalsIgnoreCase(quantidade)) {
    					denunciaPoluicao.setQuantidadePoluicao(quantidade);
    					qtndCorreto = true;
    					break;
    				}
    			}
    			if (qtndCorreto == true) {
    				break;
    			} else {
    				System.out.println("\nQuantidade incorreta.\n");
    			}
    		}
    		while (true) {
    			System.out.print("Quais as coordenadas em que a poluição foi encontrada? (ex: 37.7749, -122.4194): ");
    	        String inputCoordenadas = scanner.nextLine();
    	        Matcher matcherCoordenadas = regexCoordenadas.matcher(inputCoordenadas);
    	        if (matcherCoordenadas.matches()) {
    	        	denunciaPoluicao.setCoordenadasDenuncia(inputCoordenadas);
    	        	break;
    	        } else {
    	        	System.out.println("Coordenadas inválidas.");
    	            continue;
    	        }
    		}
    		System.out.println("Qual o ponto de referência?: ");
    		String inputReferencia = scanner.nextLine();
    		denunciaPoluicao.setPontoReferencia(inputReferencia);
    		System.out.println("Mais alguma observação?: ");
    		String inputDescricao = scanner.nextLine();
    		denunciaPoluicao.setDescricaoDenuncia(inputDescricao);
    		break;
    	}
    	System.out.println("\nDenúncia registrada com sucesso!\n");
    	return denunciaPoluicao;
    }
}