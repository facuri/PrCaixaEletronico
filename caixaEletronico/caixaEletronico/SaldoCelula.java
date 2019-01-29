/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaEletronico;

public class SaldoCelula {

    public void qtdCelula(CaixaEletronico caixa) {/*Método void que mostra a soma
                                                    da quantidade da cédulas dispóniveis*/
        int soma = 0;
        soma = caixa.limite + caixa.limite1 + caixa.limite2 + caixa.limite3 + caixa.limite4;
        System.out.println("A soma da quantidades das notas disponíveis: " + soma);

    }
}
