package controller;

import java.util.ArrayList;
import java.util.Scanner;

import misc.MockupData;
import model.Exposicao;
import model.Obra;

public class GestaoExposicao {

	
	Scanner n = new Scanner(System.in);
	MockupData bd = new MockupData();
	
	
	public GestaoExposicao(){
		
	}
	
	public ArrayList<Obra> addObra(ArrayList<Obra> os, Obra o){
		
			os.add(o);
			
			return os;
	}
	
	
	public void addExposicao(String nome, String dataInicio, String dataFim,int quant, ArrayList<Obra> obs,Obra ob, float preco){
		
		addObra(obs, ob);
		
		Exposicao exp = new Exposicao(bd.exposicao.size(), nome, dataInicio,dataFim,quant,obs,preco);
		bd.exposicao.add(exp);
	}
	
	
	public void listarExposicao(int idExp) throws InterruptedException{
		
		
		idExp-=1;
		if(idExp == bd.exposicao.get(idExp).getIdExposicao()){
			System.out.println("\n\n");
			System.out.println("\tO NOME DA EXPOSICAO: "+bd.exposicao.get(idExp).getNomeExposicao());
			System.out.println("\tA DATA DE INICIO E: "+bd.exposicao.get(idExp).getDataInicioExposicao());
			System.out.println("\tA DATA DO FIM DA EXPOSICAO: "+bd.exposicao.get(idExp).getDataFimExposicao());
			System.out.println("\tA QUANTIDADE DE VISITANTES: "+bd.exposicao.get(idExp).getQuantVisitante());
			
			for(int i=0; i<bd.exposicao.get(idExp).getObrasExp().size(); i++){
				System.out.println("\tOBRAS REGISTADAS: \n\tTITULO DA OBRA: "
						+bd.exposicao.get(idExp).getObrasExp().get(i).getTituloObra()+"\n\tNOME DO ARTISTA: "
						+bd.exposicao.get(idExp).getObrasExp().get(i).getNomeArtista()+"\n\n");
			}
			
			System.out.print("\tPRECO DO BILHETE: "+bd.exposicao.get(idExp).getPrecoExposicao());
			System.out.println("\n\n");
		}
		
	}
	
	public void lisTodasExp(){
			
		for(int i=0; i<bd.exposicao.size(); i++){
			System.out.println("\n\n");
			System.out.println("\tO NOME DA EXPOSICAO: "+bd.exposicao.get(i).getNomeExposicao());
			System.out.println("\tA DATA DE INICIO E: "+bd.exposicao.get(i).getDataInicioExposicao());
			System.out.println("\tA DATA DO FIM DA EXPOSICAO: "+bd.exposicao.get(i).getDataFimExposicao());
			System.out.println("\tA QUANTIDADE DE VISITANTES: "+bd.exposicao.get(i).getQuantVisitante());
			for(int j=0; j<bd.exposicao.get(i).getObrasExp().size(); j++){
				System.out.println("\tOBRAS REGISTADAS: \n\tTITULO DA OBRA: "
						+bd.exposicao.get(i).getObrasExp().get(j).getTituloObra()+"\n\tNOME DO ARTISTA: "
						+bd.exposicao.get(i).getObrasExp().get(j).getNomeArtista()+"\n\n");
			}
			System.out.print("\tPRECO DO BILHETE: "+bd.exposicao.get(i).getPrecoExposicao());
			System.out.println("\n\n");
		}
		
	}
}
