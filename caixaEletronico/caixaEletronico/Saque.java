/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaEletronico;

import java.util.Calendar;

public class Saque implements Lancamento { //Abstração

    Calendar cal = Calendar.getInstance();
    int year = cal.get(Calendar.YEAR);
    int dow = cal.get(Calendar.DAY_OF_WEEK);
    int dom = cal.get(Calendar.DAY_OF_MONTH);
    int doy = cal.get(Calendar.DAY_OF_YEAR);

    public void dataHora() { //Método OVerride da classe Lancamento que mostra a hora e a data do Sistema
        System.out.println("Current time and date:: " + cal.getTime());
    }

    public void lancamento(CaixaEletronico caixa) { //Método void que mostra o  nome e o saldo do Cliente
        System.out.println("Correntista: " + caixa.getNome()
                + "\nSaldos futuros: " + caixa.getSaldo());
    }

    public void valor() {//Método Override da classe Lancamento
    }
}
