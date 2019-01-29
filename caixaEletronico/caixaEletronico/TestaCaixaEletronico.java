/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaEletronico;

public class TestaCaixaEletronico {

    public static void main(String[] args) {

        CaixaEletronico caixa = new CaixaEletronico();
        Saque saque = new Saque();
        Deposito deposito = new Deposito();
        SaldoCelula saldoCelula = new SaldoCelula();
        Celula celula = new Celula();


        //Testa os Métodos das Classes
        caixa.setNome("Dalmo");
        caixa.setSaldo(550);
        caixa.realizaSaque(485);
        caixa.realizaDeposito(300);
        // caixa.exibirExtrato();
        //caixa.dataHora();
        // caixa.exibirSaldo();
        //caixa.desligar();
        // System.out.println(caixa.toString());
        //saque.dataHora();
        //saque.lancamento(caixa);
        //deposito.lancamento(caixa);
        // saldoCelula.qtdCelula(caixa);
        celula.mostrarNome(caixa);
    }
}
