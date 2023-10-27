package exception.banco;

import java.util.ArrayList;

import exception.banco.exceptions.ContaNaoEncontradaException;
import exception.banco.exceptions.ValorDepositoInvalidoException;

public class Banco {

    private ArrayList<ContaCorrente> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public void abrirConta(String nomeTitular, Integer numero){
        ContaCorrente conta = new ContaCorrente(nomeTitular, numero);
        contas.add(conta);
    }
    
    public ContaCorrente pesquisarConta(String nomeTitular){
        ContaCorrente contaEncontrada = null;

        for (ContaCorrente contaCorrente : this.contas) {
            if(contaCorrente.getNomeTitular().equals(nomeTitular)){
                contaEncontrada = contaCorrente;
            }
        }
        return contaEncontrada;
    }

    public void depositar(Integer numeroDeposito, Double valorDeposito) throws Exception{
        if (valorDeposito<=0){
            throw new ValorDepositoInvalidoException();
        }

        ContaCorrente contaDeposito = null;
        for (ContaCorrente contaCorrente : this.contas) {
            if (contaCorrente.getNumero() == numeroDeposito) {
                contaDeposito = contaCorrente;
            }
        }

        if (contaDeposito == null) {
            throw new ContaNaoEncontradaException();
        }

        contaDeposito.setSaldo(contaDeposito.getSaldo() + valorDeposito);
        
    }

}
