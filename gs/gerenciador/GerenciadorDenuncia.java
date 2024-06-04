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
    private Scanner scanner;

    public GerenciadorDenuncia() {
        this.denuncias = new ArrayList<Denuncia>();
        this.tiposPesca = new ArrayList<String>();
        this.tiposPesca.add("Pesca em Áreas Protegidas");
        this.tiposPesca.add("Pesca de Espécies Protegidas");
        this.tiposPesca.add("Uso de Equipamentos Proibidos");
        this.tiposPesca.add("Pesca Fora de Temporada");
        this.tiposPesca.add("Captura Excedendo Limites de Quantidade");
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

    public void listarDenuncias() {
        for (Denuncia denuncia : denuncias) {
        	denuncia.imprimirDenuncia();
        }
    }

    public Denuncia buscarDenunciaPorId(int idDenuncia) {
        for (Denuncia denuncia : denuncias) {
            if (denuncia.getIdDenuncia() == idDenuncia) {
                return denuncia;
            }
        }
        return null;
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
    			System.out.print("Qual o tipo de pesca ilegal identificado? (ex: Captura Excedendo Limites de Quantidade): ");
    			String inputTipoPesca = scanner.nextLine();
    			boolean tipoCorreto = false;
    			for (String tipoPesca : tiposPesca) {
    				if (inputTipoPesca.equals(tipoPesca)) {
    					denunciaPescaIlegal.setTipoPescaIlegal(inputTipoPesca);
    					tipoCorreto = true;
    					break;
    				}
    			}
    			if (tipoCorreto == true) {
    				break;
    			} else {
    				System.out.println("Tipo de pesca ilegal incorreto.");
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
 }