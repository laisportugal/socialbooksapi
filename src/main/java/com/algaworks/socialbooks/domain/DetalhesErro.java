package com.algaworks.socialbooks.domain;

public class DetalhesErro {

	private String titulo;
	private Long status;
	private Long timesStamp;
	private String mensagemDesenvolvedor;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getTimesStamp() {
		return timesStamp;
	}
	public void setTimesStamp(Long timesStamp) {
		this.timesStamp = timesStamp;
	}
	public String getMensagemDesenvolvedor() {
		return mensagemDesenvolvedor;
	}
	public void setMensagemDesenvolvedor(String mensagemDesenvolvedor) {
		this.mensagemDesenvolvedor = mensagemDesenvolvedor;
	}
	
}
