package controller;

import java.util.Scanner;

import misc.MockupData;
import model.Exposicao;
import model.Torniquete;

public class GestaoTorniquete {

	Scanner n = new Scanner(System.in);
	MockupData bd = new MockupData();
	
	public void regTorniquete(Exposicao exp, int quant){
		
		Torniquete t = new Torniquete(bd.torniquete.size(),exp,quant);
		bd.torniquete.add(t);
		
	}
	
	
	public void regPassagemVist(int idTor, int idExp){
		idTor-=1;
		
		if(idTor == bd.torniquete.get(idTor).getIdTorniquete()&& idExp == bd.exposicao.get(idExp).getIdExposicao()){
			System.out.println("QUANTAS PASSAGEM DESEJA REGISTAR? ");
			int quant=n.nextInt();
			bd.torniquete.get(idTor).setQuantVisitante(quant);
		}else{
			System.out.println("OS IDS ESTAO INCORRETOS...");
		}
		
	}
	
	
}
