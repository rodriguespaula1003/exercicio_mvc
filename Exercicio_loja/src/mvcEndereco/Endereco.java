package mvcEndereco;

public class Endereco {
	private int fkCliente;
	private String rua;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public int getFkCliente() {
		return fkCliente;
	}

	public void setFkCliente(int fkCliente) {
		this.fkCliente = fkCliente;
	}
		
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}

	
}
