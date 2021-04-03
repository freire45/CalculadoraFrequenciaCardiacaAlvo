package br.com.erickfreire.calculadorafrequenciacardiacaalvo;

public class CalculadoraFrequenciaCardiacaAlvo {
	private String nome;
	private String sobrenome;
	private int mes;
	private int dia;
	private int ano;
	
	public CalculadoraFrequenciaCardiacaAlvo(String n, String sb, int m, int d, int a){
		this.nome = n;
		this.sobrenome = sb;
		this.mes = m;
		this.dia = d;
		this.ano = a;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int calculaIdade(int a) {
		return 2021 - a;
	}
	
	public int calculaFrequenciaMaxima(int idade) {
		return 220 - idade;
	}
	
	public String calculaFrequenciaAlvo(int freqMa) {
		double minimo = freqMa * 0.5;
		double maxima = freqMa * 0.8;
		
		return String.format("%.2f - %.2f", minimo, maxima);
	}

}
