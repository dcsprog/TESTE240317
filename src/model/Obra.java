package model;

public class Obra {

	
	public Obra(){
		
	}

	
	private int idObra;
	private String nomeArtista;
	private String tituloObra;
	private String categoriaObra;
	private String tipoObra;
	private String dataCriacao;
	
	
	
	public Obra(int idObra, String nomeArtista, String tituloObra, String categoriaObra, String tipoObra,
			String dataCriacao) {
		super();
		this.idObra = idObra;
		this.nomeArtista = nomeArtista;
		this.tituloObra = tituloObra;
		this.categoriaObra = categoriaObra;
		this.tipoObra = tipoObra;
		this.dataCriacao = dataCriacao;
	}



	public int getIdObra() {
		return idObra;
	}



	public void setIdObra(int idObra) {
		this.idObra = idObra;
	}



	public String getNomeArtista() {
		return nomeArtista;
	}



	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}



	public String getTituloObra() {
		return tituloObra;
	}



	public void setTituloObra(String tituloObra) {
		this.tituloObra = tituloObra;
	}



	public String getCategoriaObra() {
		return categoriaObra;
	}



	public void setCategoriaObra(String categoriaObra) {
		this.categoriaObra = categoriaObra;
	}



	public String getTipoObra() {
		return tipoObra;
	}



	public void setTipoObra(String tipoObra) {
		this.tipoObra = tipoObra;
	}



	public String getDataCriacao() {
		return dataCriacao;
	}



	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	
	
	

}


