/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaEletronico;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Deposito implements Lancamento { //Abstração

    Date dataHoraAtual = new Date();
    String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
    String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

    public void dataHora() { //Override da classe Lancamento que mostra a data e hora do sistema
        System.out.println("Data Atual: " + data
                + "\nHora do Sistema: " + hora);
    }

    public void lancamento(CaixaEletronico caixa) { /*Método Void que mostra nome, saldo hora e
                                                     data do sistema da Classe CaixaEletronica(Objeto caixa) */
        System.out.println("Correntista: " + caixa.getNome()
                + "\nSaldo do Cliente: " + caixa.getSaldo());
        System.out.println("Data atual do Sistema: " + data
                + "\nHora atual do Sistema: " + hora);

    }

    public void valor(CaixaEletronico caixa) { /*Método void que pega o saldo atual
                                               da Classe CaixaEltronico(Objeto caixa)*/
        System.out.println("Valor saldo atual: " + caixa.getSaldo());
    }

    public void valor() {
    }
}
