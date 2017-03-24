package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GestaoExposicao;
import controller.GestaoObras;
import misc.MockupData;
import model.Obra;



public class Interface {

	
	static Scanner n = new Scanner(System.in);
	static GestaoObras ob = new GestaoObras();
	static GestaoExposicao exp = new GestaoExposicao();
	static ArrayList<Obra> obs = new ArrayList<Obra>(); 
	static MockupData bd = new MockupData();
	static Obra o = new Obra();
	public Interface(){
		
	}
	
	public void menuPrincipal(){
		
		System.out.println("\n\n");
		System.out.println("BEM VINDO AO GEREART");
		System.out.println(" 1 - REGISTAR OBRA   ");
		System.out.println(" 2 - LISTAR OBRA   ");
		System.out.println(" 3 - REGISTAR EXPOSICAO");
		System.out.println(" 4 - LISTAR EXPOSICAO   ");
		System.out.println(" 5 - LISTAR EXPOSICAO POR ID  ");
		System.out.println(" 6 - LISTAR QUANTIDADE DE VISITANTES ");
		System.out.println(" 7 - SAIR");
		System.out.println();
		System.out.println("    ESCOLHA UMA OPCAO");
		System.out.println("\n\n");
	}
	
	public void regObra(){
		
		System.out.println("INSIRA O NOME DA OBRA: ");
		String nome = n.nextLine();
		System.out.println("INSIRA O TITULO DA OBRA: ");
		String titulo = n.nextLine();
		System.out.println("INSIRA A CATEGORIA DA OBRA: ");
		String categoria = n.nextLine();
		System.out.println("INSIRA O TIPO DA OBRA: ");
		String tipo = n.nextLine();
		System.out.println("INSIRA A DATA DE CRIACAO DA OBRA: ");
		String dataCriacao = n.nextLine();
		
		ob.addObra(nome, titulo, categoria, tipo, dataCriacao);
		
	}

	public void listarObra() throws InterruptedException{
		
		System.out.println("INSIRA O ID DA OBRA: ");
		int id = n.nextInt();
		ob.listarObraPeloId(id);
		
	}
	
	public void regExposicao(){
		
	
		System.out.println("INSIRA O NOME DA EXPOSICAO: ");
		String nome = n.nextLine();
		System.out.println("INSIRA A DATA DE INICO DO EXPOSICAO: ");
		String dataI = n.nextLine();
		System.out.println("INSIRA A DATA DO FIM DO EXPOSICAO: ");
		String dataF = n.nextLine();
		System.out.println("QUNATAS OBRAS QUER  EXPOR?  ");
		int q =n.nextInt();
		if(bd.obra.size()!=0){
			for(int i=0; i<bd.exposicao.size(); i++){
				for(int j=0; j<q; j++){
					 o = new Obra(bd.obra.get(j).getIdObra(),bd.obra.get(j).getNomeArtista(),bd.obra.get(j).getTipoObra(),bd.obra.get(j).getCategoriaObra(),bd.obra.get(j).getTipoObra(),bd.obra.get(j).getDataCriacao());
					 obs.add(o);
				}
			}
			
		}
		
		
		System.out.println("INSIRA O PRECO DO BILHETE DA EXPOSICAO");
		float preco = n.nextFloat();
		
		exp.addExposicao(nome, dataI, dataF, 0,obs,o, preco);
		
	}
	
	public void listarTodasExp(){
		
		exp.lisTodasExp();
		
	}
	
	public void listarExpID() throws InterruptedException{
		System.out.println("INSIRA O ID QUE PROCURA: ");
		int id=n.nextInt();
		exp.listarExposicao(id);
	}
	
	
	public void listarTor(){
		for(int i=0; i<bd.torniquete.size();i++){
			System.out.println("REGISTOS DE PASSAGENS: "+bd.torniquete.get(i).getQuantVisitante());
		}
		
	}
	
}
