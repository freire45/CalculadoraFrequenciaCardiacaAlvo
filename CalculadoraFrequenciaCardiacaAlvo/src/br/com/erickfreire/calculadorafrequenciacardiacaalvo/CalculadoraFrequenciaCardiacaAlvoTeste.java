package br.com.erickfreire.calculadorafrequenciacardiacaalvo;

import javax.swing.JOptionPane;

public class CalculadoraFrequenciaCardiacaAlvoTeste {
	public static void main(String[] args) {
		String nome;
		String sobrenome;
		String dia;
		String mes;
		String ano;
		String msgfinal;
		int dia1;
		int mes1;
		int ano1;
		int idade;
		
		JOptionPane.showMessageDialog(null, "Calculadora de Frequência Cardíaca!");
		
		nome = JOptionPane.showInputDialog("Infome o seu nome: ");
		sobrenome = JOptionPane.showInputDialog("Infome o seu sobrenome: ");
		dia = JOptionPane.showInputDialog("Dia de Nascimento: ");
		mes = JOptionPane.showInputDialog("Mês de Nascimento: ");
		ano = JOptionPane.showInputDialog("Ano de Nascimento: ");
		
		dia1 = Integer.parseInt(dia);
		mes1 = Integer.parseInt(mes);
		ano1 = Integer.parseInt(ano);
		
		System.out.print(ano1);
		
		CalculadoraFrequenciaCardiacaAlvo c1 = new CalculadoraFrequenciaCardiacaAlvo(nome, sobrenome, mes1, dia1, ano1);
		
		idade = c1.calculaIdade(ano1);
		
		msgfinal = String.format("Nome: %s %s%n"
				               + "Data de Nascimento %s/%s/%s%n"
				               + "Idade: %d%n"
				               + "Frequência Máxima: %d%n"
				               + "Frequência Alvo: %s%n", nome, sobrenome, dia, mes, ano, idade, c1.calculaFrequenciaMaxima(idade),c1.calculaFrequenciaAlvo(c1.calculaFrequenciaMaxima(idade)) );
		
		JOptionPane.showMessageDialog(null, msgfinal);
	}

}
