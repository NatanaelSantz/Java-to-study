import java.util.Objects;
import java.util.Scanner;
public class Main {
    static int somaValor(int num1, int num2){
        return num1 + num2;
    }
    static  int subtraiValor(int num1, int num2){
        return  num1 - num2;
    }
    static  int multValor(int num1, int num2){
        return num1 * num2;
    }
    static int divideValor(int num1, int num2){
        return  num1 / num2;
    }
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nomeUsuario = myObj.nextLine();
        System.out.print("Digite um numero: ");
        int num1 = myObj.nextInt();
        System.out.print("Digite outro numero: ");
        int num2 = myObj.nextInt();
        System.out.print("Digite um sinal (-, +, *, /): ");
        String sinalOperacao = myObj.next();
        switch (sinalOperacao) {
            case "-" -> {
                int resultado = subtraiValor(num1, num2);
                System.out.print("O resultado é: " + resultado);
            }
            case "+" -> {
                int resultado = somaValor(num1, num2);
                System.out.println("O resultado é: " + resultado);
            }
            case "*" -> {
                int resultado = multValor(num1, num2);
                System.out.println("O resultado é: " + resultado);
            }
            case "/" -> {
                double resultado = divideValor(num1, num2);
                System.out.println("O resultado é: " + resultado);
            }
        }
        System.out.println(nomeUsuario +" Fez o calculo");

    }
}