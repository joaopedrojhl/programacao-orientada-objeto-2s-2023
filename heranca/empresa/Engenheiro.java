package heranca.empresa;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Engenheiro extends Funcionario{
    
    
    private String crea;
    private String projeto;

    public Engenheiro(){
        
    }

    public Engenheiro(String nome, Integer cpf, Integer telefone, String crea, String projeto) {
        super(nome, cpf, telefone);
        this.crea = crea;
        this.projeto = projeto;
    }

    public String getCrea() {
        return this.crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public String getProjeto() {
        return this.projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    @Override
    public BigDecimal getSalario(){
        return new BigDecimal(10000.00);
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
            ", crea='" + getCrea() + "'" +
            ", projeto='" + getProjeto() + "'" +
            ", salario='" + getSalario() + "'" +
            ", bonificacao='" + getBonificacao().setScale(2, RoundingMode.UP) + "'" +
            "}";
    }
    


}
