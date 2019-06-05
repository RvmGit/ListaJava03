package Carros;
/*Todos os carros possuem informa��es se possuem ar
condicionado, n�mero de passageiros que comportam, tipo de combust�vel
(gasolina, flex, diesel ou el�trico), valor da di�ria, se podem ser alugados com
quilometragem livre, placa, ano de fabrica��o e quilometragem rodada total.*/

//B�sico,Comum, Executivo e Luxo.


public abstract class CarroGeral {
	TipoCarro categoria;
	boolean arFlag;
	TipoCombustivel tipo;
	float valorDiaria;
	boolean kmLivre;
	String placa;
	int anoFabbricacao;
	float kmTotal;
	public TipoCarro getCategoria() {
		return categoria;
	}
	public void setCategoria(TipoCarro categoria) {
		this.categoria = categoria;
	}
	public boolean isArFlag() {
		return arFlag;
	}
	public void setArFlag(boolean arFlag) {
		this.arFlag = arFlag;
	}
	public TipoCombustivel getTipo() {
		return tipo;
	}
	public void setTipo(TipoCombustivel tipo) {
		this.tipo = tipo;
	}
	public float getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	public boolean isKmLivre() {
		return kmLivre;
	}
	public void setKmLivre(boolean kmLivre) {
		this.kmLivre = kmLivre;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAnoFabbricacao() {
		return anoFabbricacao;
	}
	public void setAnoFabbricacao(int anoFabbricacao) {
		this.anoFabbricacao = anoFabbricacao;
	}
	public float getKmTotal() {
		return kmTotal;
	}
	public void setKmTotal(float kmTotal) {
		this.kmTotal = kmTotal;
	}
	
}
