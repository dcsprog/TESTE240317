package model;

public class Torniquete {


	public Torniquete(){
		
	}
	
	
	private int idTorniquete;
	private Exposicao expo;
	private int quantVisitante;
	
	
	public Torniquete(int idTorniquete, Exposicao expo, int quantVisitante) {
		super();
		this.idTorniquete = idTorniquete;
		this.expo = expo;
		this.quantVisitante = quantVisitante;
	}


	public int getIdTorniquete() {
		return idTorniquete;
	}


	public void setIdTorniquete(int idTorniquete) {
		this.idTorniquete = idTorniquete;
	}


	public Exposicao getExpo() {
		return expo;
	}


	public void setExpo(Exposicao expo) {
		this.expo = expo;
	}


	public int getQuantVisitante() {
		return quantVisitante;
	}


	public void setQuantVisitante(int quantVisitante) {
		this.quantVisitante = quantVisitante;
	}
	
	
	
	
	
	
	
}
