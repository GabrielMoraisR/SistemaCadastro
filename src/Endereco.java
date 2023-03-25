public class Endereco {

	private String rua;
	private int numero;
	private String CEP;

	public Endereco() {
	}
	
	public String getRua() {
		return rua;
	}
	
	public int getNumero() {
		return numero;
	}

	public String getCep() {
		return CEP;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setCep(String CEP) {
		this.CEP = CEP;
	}
}
