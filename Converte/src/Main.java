import java.util.Scanner;
public class Main {
    static double converteTemperatura(double temperaturaCelsius){ return (temperaturaCelsius * 1.8) + 32;}
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Digite a temperatura em celsius: ");
        double temperaturaCelsius = myObj.nextDouble();
        double convertido = converteTemperatura(temperaturaCelsius);
        System.out.printf("A Temperatura é %.2f graus Fahrenheit%n", convertido);

    }
}