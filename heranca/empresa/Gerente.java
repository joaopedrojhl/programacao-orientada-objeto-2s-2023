package heranca.empresa;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Gerente extends Funcionario{
    
    private Integer quantidadeGerenciados;


    public Gerente() {
    }

    public Gerente(String nome, Integer cpf, Integer telefone, Integer quantidadeGerenciados) {
        super(nome, cpf, telefone);
        this.quantidadeGerenciados = quantidadeGerenciados;
    }



    public Integer getQuantidadeGerenciados() {
        return this.quantidadeGerenciados;
    }

    public void setQuantidadeGerenciados(Integer quantidadeGerenciados) {
        this.quantidadeGerenciados = quantidadeGerenciados;
    }

    @Override
    public BigDecimal getSalario(){
        return new BigDecimal(15000.00);
    }

    @Override
    public BigDecimal getBonificacao(){
        return getSalario().multiply(new BigDecimal(0.15));
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", quantidadeGerenciados='" + getQuantidadeGerenciados() + "'" +
            ", salario='" + getSalario() + "'" +
            ", bonificacao='" + getBonificacao().setScale(2, RoundingMode.UP) + "'" +
            "}";
    }
    
}
