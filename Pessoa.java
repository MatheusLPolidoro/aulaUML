package pacote;

import javax.JoptionPane;

public class Pessoa () {
	String nome;
	int anoNascto, idade, anoCalculo;

	public void recebeDados() {
		nome = JoptionPane.showInputDialog("Digite seu nome");
		anoNascto = Integer.parseInt (JoptionPane.showInputDialog("Digite seu ano de nascimento"));
		anoCalculo = Integer.parseInt (JoptionPane.showInputDialog("Digite o ano para calculo"));
	}
	public void calculaIdade() {
		idade = anoCalculo - anoNascto;
	}
	public void mostraDados() {
		JoptionPane.showMessageDialog(null, "RELATÓRIO: \n"
			+ "NOME: " + nome + "\n\nEm " + anoCalculo + "SUA UDADE SERÁ: " + idade);
	}
}	