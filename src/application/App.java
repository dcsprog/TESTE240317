package application;

import java.util.Scanner;


import controller.GestaoExposicao;
import controller.GestaoObras;
import misc.MockupData;
import view.Interface;

public class App {

	
	static Interface i = new Interface();
	static GestaoExposicao expo = new GestaoExposicao();
	static GestaoObras ob = new GestaoObras();
	MockupData bd = new MockupData();
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		boolean verf=true;
		
		do{
			
			i.menuPrincipal();
			int opc;
			opc = n.nextInt();
			switch(opc){
			case 1:
				i.regObra();
				break;
			case 2:
				i.listarObra();
				break;
			case 3:
				i.regExposicao();
				break;
			case 4:
				i.listarTodasExp();
				break;
			case 5:
				i.listarExpID();
				break;
			case 6:
				verf=false;
				break;
			default:
				break;
			}
		}while(verf);
		
		
	}	
	
}
