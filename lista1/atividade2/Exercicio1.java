package lista1.atividade2;
// CALCULADORA
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA");
        System.out.println("Digite o primeiro número da operação: ");
        double numero1 =  scanner.nextDouble();

        System.out.println("Digite o segundo número da operação: ");
        double numero2 =  scanner.nextDouble();

        System.out.println("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0.0;

        switch (operacao){
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if(numero2 != 0){
                    resultado = numero1 / numero2;
                }else{
                    System.out.println("Erro: Divisão por zero não é permitida");
                }
                break;
            default:
                System.out.println("Operação inválida. Use +, -, * ou /");    
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();    }
    
}

