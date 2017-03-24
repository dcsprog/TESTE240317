package controller;

import java.util.Scanner;

import misc.MockupData;
import model.Obra;

public class GestaoObras {

	
	Scanner n = new Scanner(System.in);
	MockupData bd = new MockupData();
	
	public void addObra(String nome, String titulo, String categoria, String tipo,String dataCriacao){
		
		Obra o = new Obra(bd.obra.size(),nome,titulo,categoria,tipo,dataCriacao);
		bd.obra.add(o);
		
	}
	
	public void listarObraPeloId(int idObra){
		idObra-=1;
		
		if(idObra == bd.obra.get(idObra).getIdObra()){
			System.out.println("\n\n");
			System.out.println("NUMERO DE REG OBRA:" + bd.obra.get(idObra).getIdObra());
			System.out.println("NOME DO ARTISTA: "+bd.obra.get(idObra).getNomeArtista());
			System.out.println("CATEGORIA OBRA: "+bd.obra.get(idObra).getCategoriaObra());
			System.out.println("TIPO DA OBRA: "+bd.obra.get(idObra).getTipoObra());
			System.out.println("DATA DA CRIACAO: "+bd.obra.get(idObra).getDataCriacao());
			System.out.println("\n\n");
		}else{
			System.out.println("O ID NAO ESTA NA BD...");
		}
		
	}
	
	
	public void listarTodasObras(){
		for(int i=0; i<bd.obra.size(); i++){
			System.out.println("\n\n");
			System.out.println("NUMERO DE REG OBRA:" + bd.obra.get(i).getIdObra());
			System.out.println("NOME DO ARTISTA: "+bd.obra.get(i).getNomeArtista());
			System.out.println("CATEGORIA OBRA: "+bd.obra.get(i).getCategoriaObra());
			System.out.println("TIPO DA OBRA: "+bd.obra.get(i).getTipoObra());
			System.out.println("DATA DA CRIACAO: "+bd.obra.get(i).getDataCriacao());
			System.out.println("\n\n");
		}
	}
}
