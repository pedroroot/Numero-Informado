import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        double numero;
        System.out.println("Digite um numero na tela.");
        numero = console.nextDouble();
        System.out.println("O numero informado foi: " + numero);
        console.close();

    }
}
