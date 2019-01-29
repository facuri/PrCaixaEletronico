package caixaEletronico;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CaixaEletronico implements Lancamento { //Abstração

    //Variaveis
    private String nome;
    private int saldo;
    private boolean ligado;
    int notaCem = 100;
    int notaCinq = 50;
    int notaVinte = 20;
    int notaDez = 10;
    int notaCinco = 5;
    int limite = 500;
    int limite1 = 450;
    int limite2 = 400;
    int limite3 = 350;
    int limite4 = 300;
    int depositar = 0;
    int retirar = 0;
    Date dataHoraAtual = new Date();
    String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
    String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

    //Encapsulamento
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;

    }

    public CaixaEletronico() { //Método Construtor
        ligado = true;
        this.limite = 500;
        this.limite1 = 450;
        this.limite2 = 400;
        this.limite3 = 350;
        this.limite4 = 300;

    }

    @Override
    public String toString() { /*to String mostra o estado do caixa eletrônico
                                 o carregamento das cédulas a qtd e o valor das cédulas
                                 do construtor CaixaEletronico */
        String estado = ligado ? "Funcionando" : "Manutenção";
        int estadoSaldo = this.saldo = 0;
        return estado + "\nValor das Notas e quantidade disponíveis: "
                + "\nR$100 = " + limite + " notas "
                + "\nR$50 = " + limite1 + " notas "
                + "\nR$20 = " + limite2 + " notas "
                + "\nR$10 = " + limite3 + " notas "
                + "\nR$5 = " + limite4 + " notas "
                + "\nSaldo Caixa Eletrônico: " + estadoSaldo;
    }

    public void exibirExtrato() { /*Método void que vai mostrar o nome e
                                    saldo do Cliente, e a hora e a data do sistema */
        System.out.println("Correntista: " + this.getNome()
                + "\nSaldo: " + this.getSaldo());
        System.out.println("Data atual: " + data
                + "\nHora atual: " + hora);
    }

    public void exibirSaldo() { //Método void que exibi nome e saldo do Cliente
        System.out.println("Saldo Atual de: " + this.getNome()
                + "\né: " + this.getSaldo());
    }

    public void realizaDeposito(int valor) { //Método void  que realiza o depósito bancário
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Saldo com depósito: " + this.getSaldo());


    }

    public void realizaSaque(int valor) { /*Realiza o saque, atualiza a quantidade de notas disponíveis
                                            de cada cédula o valor delas, e verifica o limite do saque.*/
        this.setSaldo(this.getSaldo() - valor);
        System.out.println("Saque de: " + valor + " realizado na conta de: " + this.getNome());
        System.out.println("");
        if (valor >= 10 && valor <= 500) {
            if (valor >= notaCem) {
                System.out.println("Total de notas de R$100 disponíveis no caixa eletrônico: " + limite);
                notaCem = valor / 100;
                valor = valor % 100;
                limite -= notaCem;
                if (notaCem < limite) {
                    System.out.println(notaCem + " notas de 100"
                            + "\nTotal de notas de R$100 atualizadas no caixa eletrônico: " + limite);
                    System.out.println("");
                } else {
                    System.out.println("Notas de R$100 indisponíveis, Repita a operação");
                }


            }
            if (valor >= notaCinq) {
                System.out.println("Total de notas de R$50 disponíveis no caixa eletrônico: " + limite1);
                notaCinq = valor / 50;
                valor = valor % 50;
                limite1 -= notaCinq;
                if (notaCinq < limite1) {
                    System.out.println(notaCinq + " notas de 50"
                            + "\nTotal de notas de R$50 atualizadas no caixa eletrônico: " + limite1);
                    System.out.println("");
                } else {
                    System.out.println("Notas de R$50 indisponíveis, Repita a operação");
                }
            }
            if (valor >= notaVinte) {
                System.out.println("Total de notas de R$20 disponíveis no caixa eletrônico: " + limite2);
                notaVinte = valor / 20;
                valor = valor % 20;
                limite2 -= notaVinte;
                if (notaVinte < limite2) {
                    System.out.println(notaVinte + " notas de 20"
                            + "\nTotal de notas de R$20 atualizadas no caixa eletrônico: " + limite2);
                    System.out.println("");
                } else {
                    System.out.println("Notas de R$20 indisponíveis, Repita a operação");
                }
            }
            if (valor >= notaDez) {
                System.out.println("Total de notas de R$10 disponíveis no caixa eletrônico: " + limite3);
                notaDez = valor / 10;
                valor = valor % 10;
                limite3 -= notaDez;
                if (notaDez < limite3) {
                    System.out.println(notaDez + " notas de 10"
                            + "\nTotal de notas de R$10 atualizadas no caixa eletrônico: " + limite3);
                    System.out.println("");
                } else {
                    System.out.println("Notas de R$10 indisponíveis, Repita a operação");
                }
            }
            if (valor >= notaCinco) {
                System.out.println("Total de notas de R$5 disponíveis no caixa eletrônico: " + limite4);
                notaCinco = valor / 5;
                valor = valor % 5;
                limite4 -= notaCinco;
                if (notaCinco < limite4) {
                    System.out.println(notaCinco + " notas de 5"
                            + "\nTotal de notas de R$5 atualizadas no caixa eletrônico: " + limite4);
                } else {
                    System.out.println("Notas de R$5 indisponíveis, Repita a operação");
                }

            }

        } else {
            System.out.println("Não é possível realizar o saque"); //limite do saque

        }

        System.out.println("\nSaldo Total: " + this.getSaldo()); //Mostra o saldo atual

    }

    public void dataHora() { /*Override da classe abstrata Lancamento
                               que mostra a data e a hora do sistema*/
        System.out.println("Data atual: " + data
                + "\nHora atual" + hora);
    }

    public void valor() {/*Override da classe abstrata Lancamento
                           que mostra o saldo do cliente*/
        System.out.println("Valor saldo atual: " + this.getSaldo());

    }
}
