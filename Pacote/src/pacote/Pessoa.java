package pacote;

import javax.swing.JOptionPane;

public class Pessoa {
    String nome;
    int anoNascto, idade, anoCalculo;

    public void recebeDados() {
            nome = JOptionPane.showInputDialog("Digite seu nome");
            anoNascto = Integer.parseInt (JOptionPane.showInputDialog("Digite seu ano de nascimento"));
            anoCalculo = Integer.parseInt (JOptionPane.showInputDialog("Digite o ano para calculo"));
    }
    public void calculaIdade() {
            idade = anoCalculo - anoNascto;
    }
    public void mostraDados() {
            JOptionPane.showMessageDialog(null, "RELATÓRIO: \n"
                    + "NOME: " + nome + "\n\nEm " + anoCalculo + "SUA UDADE SERÁ: " + idade);
    }
}	