package com.fallenblackbird.sistemanoticias.modelo;

public class Noticia {

	private String titular;
	private String cuerpo;
	private String url;
	
	public Noticia() {
		
	}

	public Noticia(String titular, String cuerpo, String url) {
		super();
		this.titular = titular;
		this.cuerpo = cuerpo;
		this.url = url;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Noticia [titular=" + titular + ", cuerpo=" + cuerpo + ", url=" + url + "]";
	}

		
}
