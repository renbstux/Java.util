package br.com.renbstux.Modelo;

/**
 * Classe que representa um cliente no ByteBank.
 * 
 * @author Renato de Souza
 *@version 0.1
 */

public class Cliente {
	
	private String cpf;
	private String profissao;
	private String nome;

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return this.profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
}
 
