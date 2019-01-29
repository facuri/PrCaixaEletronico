
package caixaEletronico;

public class Celula extends SaldoCelula { //Herança

    private String nome;
    private int valor;
     //encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void mostrarNome(CaixaEletronico caixa) { //mostra o nome do cliente da classe CaixaEletronico
        System.out.println("Nome do correntista: " + caixa.getNome());

    }

    @Override // Override toString que pega o Método da classe SaldoCelula
    public String toString() {
        return super.toString();
    }
}
