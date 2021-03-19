import java.util.Scanner;

public class Produto {

        private String nome;
        private double valor;

    public Produto() {
    }

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularDesconto() {
        if (valor > 1000) {
            return valor * 0.975;
        } else {
            return valor;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Digite o nome do produto:");
        produto.setNome(scanner.nextLine());

        System.out.println("Digite o valor do produto:");
        produto.setValor(scanner.nextDouble());

        System.out.println("\nNome do produto: " + produto.nome);
        System.out.println("Valor do produto: R$ " + produto.calcularDesconto());
    }
}