package exception;

import exception.banco.ContaCorrente;
import exception.banco.Banco;

public class Executavel {

    public static void main(String[] args) {
        
        Banco banco = new Banco();

        banco.abrirConta("Jota", 123);

        ContaCorrente conta = banco.pesquisarConta("Jota");
        
        System.out.println(conta);

        try {
            banco.depositar(124, 1.0);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            banco.depositar(123, 0.0);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
}
