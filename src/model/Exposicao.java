package model;

import java.util.ArrayList;

public class Exposicao {

	
	public Exposicao(){
		
	}
	
	private int idExposicao;
	private String nomeExposicao;
	private String dataInicioExposicao;
	private String dataFimExposicao;
	private int quantVisitante;
	private ArrayList<Obra> obrasExp;
	private float precoExposicao;
	
	
	public Exposicao(int idExposicao, String nomeExposicao, String dataInicioExposicao, String dataFimExposicao,
			int quantVisitante, ArrayList<Obra> obrasExp, float precoExposicao) {
		super();
		this.idExposicao = idExposicao;
		this.nomeExposicao = nomeExposicao;
		this.dataInicioExposicao = dataInicioExposicao;
		this.dataFimExposicao = dataFimExposicao;
		this.quantVisitante = quantVisitante;
		this.obrasExp = obrasExp;
		this.precoExposicao = precoExposicao;
	}


	public int getIdExposicao() {
		return idExposicao;
	}


	public void setIdExposicao(int idExposicao) {
		this.idExposicao = idExposicao;
	}


	public String getNomeExposicao() {
		return nomeExposicao;
	}


	public void setNomeExposicao(String nomeExposicao) {
		this.nomeExposicao = nomeExposicao;
	}


	public String getDataInicioExposicao() {
		return dataInicioExposicao;
	}


	public void setDataInicioExposicao(String dataInicioExposicao) {
		this.dataInicioExposicao = dataInicioExposicao;
	}


	public String getDataFimExposicao() {
		return dataFimExposicao;
	}


	public void setDataFimExposicao(String dataFimExposicao) {
		this.dataFimExposicao = dataFimExposicao;
	}


	public int getQuantVisitante() {
		return quantVisitante;
	}


	public void setQuantVisitante(int quantVisitante) {
		this.quantVisitante = quantVisitante;
	}


	public ArrayList<Obra> getObrasExp() {
		return obrasExp;
	}


	public void setObrasExp(ArrayList<Obra> obrasExp) {
		this.obrasExp = obrasExp;
	}


	public float getPrecoExposicao() {
		return precoExposicao;
	}


	public void setPrecoExposicao(float precoExposicao) {
		this.precoExposicao = precoExposicao;
	}
	
	
	
	
	
	
	
	
	
}
