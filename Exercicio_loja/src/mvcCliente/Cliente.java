package mvcCliente;

public class Cliente {
	private int id_cliente;
	private String nome;
	private String cpf;
	private String rg;
	private String email;
	private String dataNascimento;
	
	public int getId_cliente() {
		return id_cliente;
	}
	
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
