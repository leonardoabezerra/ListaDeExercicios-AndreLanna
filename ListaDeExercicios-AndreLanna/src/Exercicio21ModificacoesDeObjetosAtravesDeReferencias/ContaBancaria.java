package Exercicio21ModificacoesDeObjetosAtravesDeReferencias;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ContaBancaria {
      // Atributos
    double saldo;

      // Construtor
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public static ContaBancaria deposito(ContaBancaria conta) {
          // Declaração de Variáveis
        double valor;
        String strvalor = JOptionPane.showInputDialog("Informe o valor a ser depositado");
        valor = Double.parseDouble(strvalor);

        valor += conta.saldo;  // Ajuste do saldo
        
          // Cria um novo objeto a ser retornado com o valor novo do saldo
        ContaBancaria conta2 = new ContaBancaria(valor);
        return conta2;
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

          // Criar novo objeto ContaBancaria
        ContaBancaria contaTeste = new ContaBancaria(10000);

          // Criar novo objeto para receber o novo saldo
        ContaBancaria contaPaga = deposito(contaTeste);

          // Formatação dos valores
        String saldoOriginal_df = df.format(contaTeste.saldo);
        String saldoNovo_df = df.format(contaPaga.saldo);

        JOptionPane.showMessageDialog(null, "Saldo original da conta: R$ " + saldoOriginal_df +
                                                            "\nSaldo após depósito: R$ " + saldoNovo_df);

    }

}
