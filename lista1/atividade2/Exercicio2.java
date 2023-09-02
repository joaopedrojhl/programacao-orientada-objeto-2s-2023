package lista1.atividade2;
// CONVERSOR DE TEMPERATURA
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("CONVERSOR DE TEMPERATURA");
        System.out.println("Escolha para qual temperatura irá mudar: Celsius para Fahrenheit - 'C' ou Fahrenheit para Celsius - 'F'): ");
        char direcao = scanner.next().charAt(0);

        double temperaturaCelsius;
        double temperaturaFahrenheit;

        if (direcao == 'C' || direcao == 'c') {
            System.out.println("Digite a temperatura em Celsius: ");
            temperaturaCelsius = scanner.nextDouble();
            temperaturaFahrenheit = celsiusParaFahrenheit(temperaturaCelsius);
            System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);
        } else if (direcao == 'F' || direcao == 'f') {
            System.out.println("Digite a temperatura em Fahrenheit: ");
            temperaturaFahrenheit = scanner.nextDouble();
            temperaturaCelsius = fahrenheitParaCelsius(temperaturaFahrenheit);
            System.out.println("Temperatura em Celsius: " + temperaturaCelsius);
        } else{
            System.out.println("Conversão inválida. Use 'C' para Celsius para Fahrenheit ou 'F' para Fahrenheit para Celsius.");
        }
    }

    public static double celsiusParaFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }
    public static double fahrenheitParaCelsius(double fahrenheit){
        return (fahrenheit - 32) * 9/50;
    }
}